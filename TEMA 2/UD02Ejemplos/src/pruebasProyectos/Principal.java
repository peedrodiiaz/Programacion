package pruebasProyectos;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Miercoles 30/10/24 planificamos el menú y creamos variables. Inicamos el
		 * proyecto. Hacemos el case 1 entre todos
		 */
		/*
		 * Jueves 31/10/2024. Hoy Javi hace el case 2,case 3,case 4 y case 5. Creará
		 * aleatorios para generar estadísticas de las películas que hay en la
		 * cartelera. Luego mostrará la cartelera y los asientos, libres u ocupados, de
		 * las salas. Pedro se encarga de hacer la la compra de entradas. Según ofertas
		 * se aplicará un descuento un otro, al elegir la sala y los asientos,
		 * modificará los asientos de la sala. Raúl se encarga de modificar las
		 * películas o los horarios de la sala. Teniendo en cuenta que si cambiamos la
		 * película hay que modificar la cartelera, los asientos y la estadística
		 */
		/*
		 * Lunes 04/11/2024. Hoy modificaremos el proyecto para que se pueda acceder al
		 * programa como administrador o como usuario. Raúl se encargará de hacer este
		 * cambio. Pedro va a mejorar la visualización de los asientos de las salas,
		 * para numerarlas. Javi se encargará perfeccionar le proyecto usando bucles o
		 * condiciones para volver atrás en el caso de que nos equivoquemos de opción
		 */
		int usuario, op2;
		String identidad = "admin.bosco24", contraseña = "Bosco-1", id, pass;
		int filCartelera = 2, colCartelera = 2, filAsientos = 4, colAsientos = 5;
		int tam = 2;
		String cartelera[][] = new String[filCartelera][colCartelera];
		String asientos1[][] = new String[filAsientos][colAsientos];
		String asientos2[][] = new String[filAsientos][colAsientos];
		int op1, atras, menuSala, desde = 100, hasta = 500, contador1 = 3, contador2 = 1, cine, modificar;
		String pelis[] = new String[tam];
		Random estadistica = new Random(System.nanoTime());
		int peliculaSeleccionada;
		int tarjetaCine;
		int filaAsiento;
		int columnaAsiento;
		int cont = 0;
		int cont2 = 0;
		int entradasComprar;
		int tipoEntrada;
		int precioNormal = 10;
		int precioVip = 15;
		int precio = 0;

		double descuento = 0.0;
		double precioFinal;
		int descuentoTarjeta = 10;
		do {
			System.out.println("ENTRAR COMO:\n" + "1.ADMINISTRADOR\t\t2.USUARIO\t0.CERRAR SESIÓN");
			usuario = Leer.datoInt();
			while (usuario < 0 || usuario > 2) {
				System.out.println("ERROR.PRUEBE DE NUEVO:");
				usuario = Leer.datoInt();
			}
			switch (usuario) {
			case 0:
				System.out.println("CERRANDO SESIÓN...");
				break;
			case 1:
				System.out.println("INTRODUZCA EL USUARIO:");
				id = Leer.dato();
				while (!id.equals(identidad)) {
					System.out.println("USUARIO INCORRECTO. VUELVA A INTENTARLO");
					id = Leer.dato();
				}
				System.out.println("INTRODUZCA LA CONTRASEÑA");
				pass = Leer.dato();
				while (!pass.equals(contraseña)) {
					System.out.println("CONTRASEÑA INCORRECTA. VUELVA A INTENTARLO");
					pass = Leer.dato();
				}

				do {
					System.out.println("-------------------Menú-----------------\n" + "0.SALIR\n" + "1.GENERAR SALAS\n"
							+ "2.GENERAR ESTADÍSTICA\n" + "3.MODIFICAR CARTELERA\n" + "\nSELECCIONE UNA OPCIÓN:");
					op1 = Leer.datoInt();
					switch (op1) {
					case 0:
						System.out.println("VOLVIENDO AL INICIO...");
						break;
					case 1:
						System.out.println("1.CREAR SALAS\t2.ATRÁS");
						atras = Leer.datoInt();
						switch (atras) {
						case 1:
							for (int i = 0; i < pelis.length; i++) {
								System.out.println("INTRODUZCA LA PELÍCULA " + (i + 1) + ":");
								pelis[i] = Leer.dato();
							}
							for (int i = 0; i < cartelera.length; i++) {
								for (int j = 0; j < cartelera[i].length; j++) {
									System.out.println("INTRODUZCA EL NOMBRE DE SALA " + (i + 1));
									cartelera[i][j] = Leer.dato();
									j++;
									System.out.println("INTRODUZCA EL HORARIO DE ESA SALA");
									cartelera[i][j] = Leer.dato();
								}

							}

							System.out.println("CREANDO SALAS...");

							for (int i = 0; i < pelis.length; i++) {
								System.out.println("SALA " + (i + 1) + " CREADA");
							}
							for (int i = 0; i < asientos1.length; i++) {
								for (int j = 0; j < asientos1[i].length; j++) {
									asientos1[i][j] = "#";

								}
							}

							for (int i = 0; i < asientos2.length; i++) {
								for (int j = 0; j < asientos2[i].length; j++) {
									asientos2[i][j] = "#";

								}
							}

							System.out.println("SALAS CREADAS CORRECTAMENTE");
							break;

						case 2:
							System.out.println("VOLVIENDO AL MENÚ PRINCIPAL");
							break;
						default:
							System.out.println("OPCIÓN INCORRECTA");
							break;
						}
						break;
					case 2:
						System.out.println("GENERANDO ESTADÍSTICAS DE ESPECTADORES PARA CADA PELÍCULA...");

						contador1 = estadistica.nextInt(hasta - desde + 1) + desde;
						contador2 = estadistica.nextInt(hasta - desde + 1) + desde;

						System.out.println("ESPECTADORES PARA " + pelis[0] + ": " + contador1);
						System.out.println("ESPECTADORES PARA " + pelis[1] + ": " + contador2);

						if (contador1 > contador2) {
							System.out.println("LA PELÍCULA " + pelis[0] + " TIENE MAYOR AUDIENCIA QUE " + pelis[1]);
						} else {
							System.out.println("LA PELÍCULA " + pelis[1] + " TIENE MAYOR AUDIENCIA QUE " + pelis[0]);
						}

						break;
					case 3:
						System.out.println("¿QUÉ SALA QUIERE MODIFICAR?\n" + "1." + cartelera[0][0] + "\t2."
								+ cartelera[1][0] + "\nPULSE CUALQUIER OTRO NÚMERO PARA SALIR");
						modificar = Leer.datoInt();
						if (modificar == 1 || modificar == 2) {

							switch (modificar) {
							case 1:
								do {
//ELIJO SI QUIERO CAMBIAR LA PELÍCULA O EL HORARIO
									System.out.println("1.PELÍCULA\t2.HORARIO\t3.SALIR");
									cine = Leer.datoInt();

									switch (cine) {
									case 1:
										System.out.println("INTRODUZCA EL NOMBRE DE LA PELÍCULA:");
										pelis[0] = Leer.dato();

										for (int i = 0; i < asientos1.length; i++) {
											for (int j = 0; j < asientos1[i].length; j++) {
												asientos1[i][j] = "#";
											}
											contador1 = estadistica.nextInt(hasta - desde + 1) + desde;
										}
										break;
									case 2:
										System.out.println("INTRODUZCA EL NUEVO HORARIO:");
										cartelera[0][1] = Leer.dato();

										for (int i = 0; i < asientos1.length; i++) {
											for (int j = 0; j < asientos1[i].length; j++) {
												asientos1[i][j] = "#";
											}
										}
										break;
									case 3:
										System.out.println("ATRÁS...");
										break;
									default:
										System.out.println("OPCIÓN INCORRECTA");
										break;
									}

								} while (cine != 3);
								break;
							case 2:

								do {

									System.out.println("1.PELÍCULA\t2.HORARIO\t3.SALIR");
									cine = Leer.datoInt();

									switch (cine) {
									case 1:
										System.out.println("INTRODUZCA EL NOMBRE DE LA PELÍCULA:");
										pelis[1] = Leer.dato();

										for (int i = 0; i < asientos2.length; i++) {
											for (int j = 0; j < asientos2[i].length; j++) {
												asientos1[i][j] = "#";
											}
											contador2 = estadistica.nextInt(hasta - desde + 1) + desde;
										}
										break;
									case 2:
										System.out.println("INTRODUZCA EL NUEVO HORARIO:");
										cartelera[1][1] = Leer.dato();

										for (int i = 0; i < asientos2.length; i++) {
											for (int j = 0; j < asientos2[i].length; j++) {
												asientos2[i][j] = "#";
											}
										}
										break;
									case 3:
										System.out.println("ATRÁS...");
										break;
									default:
										System.out.println("OPCIÓN INCORRECTA");
										break;

									}

								} while (cine != 3);
								break;

							}
						}
						break;
					default:
						System.out.println("OPCIÓN INCORRECTA");
						break;
					}
				} while (op1 != 0);
				break;
			case 2:
				do {
					System.out
							.println("-------------------Menú-----------------\n" + "0.SALIR\n" + "1.RECOMENDACIONES\n"
									+ "2.MOSTRAR CARTELERA\n" + "3.MOSTRAR DISPONIBILIDAD DE LAS SALAS\n"
									+ "4.COMPRAR ENTRADAS\n" + "\nSELECCIONE UNA OPCIÓN:");
					op2 = Leer.datoInt();
					switch (op2) {
					case 0:
						System.out.println("SALIENDO...");
						break;
					case 1:
						if (contador1 > contador2) {
							System.out.println(
									"RECOMENDACIÓN: LA PELÍCULA MÁS VISTA ENTRE LOS ESPECTADORES ES: " + pelis[0]);
						} else {
							System.out.println(
									"RECOMENDACIÓN: LA PELÍCULA MÁS VISTA ENTRE LOS ESPECTADORES ES: " + pelis[1]);
						}
						break;
					case 2:
						for (int i = 0; i < cartelera.length; i++) {
							System.out.print(pelis[i]);
							for (int j = 0; j < cartelera[i].length; j++) {
								System.out.print("\t" + cartelera[i][j]);
							}
							System.out.println();
						}

						break;
					case 3:
						System.out.println("1." + cartelera[0][0] + "\t2." + cartelera[1][0]);
						menuSala = Leer.datoInt();
						while (menuSala < 1 || menuSala > 2) {
							System.out.println("SALA INCORRECTA.VUELVA A INTENTARLO:");
							menuSala = Leer.datoInt();
						}
						switch (menuSala) {
						case 1:
							System.out.println("ASIENTOS OCUPADOS:\n" + "#: LIBRE\nX: OCUPADO\n" + "---------------PANTALLA--------------\n");

							for (int i = 0; i < asientos1.length; i++) {
								System.out.println("Fila "+(i+1));				
								
								for (int j = 0; j < asientos1[i].length; j++) {
									System.out.print( (j+1)+"."+asientos1[i][j]+"\t" );

								}
								System.out.println();
							}
							break;
						case 2:
							System.out.println("ASIENTOS OCUPADOS:\n" + "#: LIBRE\nX: OCUPADO\n" + "---------------PANTALLA--------------\n");

							for (int i = 0; i < asientos2.length; i++) {
								System.out.println("Fila "+(i+1));
								for (int j = 0; j < asientos2[i].length; j++) {
									System.out.print( (j+1)+"."+asientos2[i][j]+"\t" );

								}
								System.out.println();
							}
							break;
						}
						break;
					case 4:
						System.out.println("SELECCIONE LA PELICULA (1." + pelis[0] + ", 2." + pelis[1] + "):");
						peliculaSeleccionada = Leer.datoInt();
						while (peliculaSeleccionada < 1 || peliculaSeleccionada > 2) {
							System.out.println("SELECCIÓN INVÁLIDA. SELECCIONE UNA PELICULA VÁLIDA");
							peliculaSeleccionada = Leer.datoInt();
						}
						switch (peliculaSeleccionada) {

						case 1:
							contador1++;
							System.out.println("ASIENTOS OCUPADOS:\n" + "#: LIBRE\nX: OCUPADO\n" + "---------------PANTALLA--------------\n");

							for (int i = 0; i < asientos1.length; i++) {
								System.out.println("Fila "+(i+1));				
								
								for (int j = 0; j < asientos1[i].length; j++) {
									System.out.print( (j+1)+"."+asientos1[i][j]+"\t" );

								}
								System.out.println();
							}

							System.out.println("INDÍCAME CUÁNTAS ENTRADAS VA A COMPRAR:");
							entradasComprar = Leer.datoInt();
							cont = 0;
							while (cont < entradasComprar) {

								System.out.println("SELECCIANA LA FILA DE ASIENTOS QUE DESEA:");
								filaAsiento = Leer.datoInt();
								System.out.println("SELECCIONE EL ASIENTO DE LA FILA " + filaAsiento);
								columnaAsiento = Leer.datoInt();

								while (filaAsiento - 1 < 0 || filaAsiento - 1 >= asientos1.length
										|| columnaAsiento - 1 < 0 || columnaAsiento - 1 >= asientos1[0].length
										|| !asientos1[filaAsiento - 1][columnaAsiento - 1].equals("#")) {

									System.out.println("ASIENTO NO DISPONIBLE O YA OCUPADO. INTRODUCE OTRO:");
									System.out.println("SELECCIANA LA FILA DE ASIENTOS QUE DESEA:");
									filaAsiento = Leer.datoInt();
									System.out.println("SELECCIONE EL ASIENTO DE LA FILA " + filaAsiento);
									columnaAsiento = Leer.datoInt();
								}

								asientos1[filaAsiento - 1][columnaAsiento - 1] = "X";
								System.out.println("ASIENTO RESERVADO");
								cont++;

							}

							System.out.println("TIPO DE ENTRADA 1. NORMAL (10€) 2.VIP (15€)");
							tipoEntrada = Leer.datoInt();
							while (tipoEntrada < 1 || tipoEntrada > 2) {

								System.out.println("ENTRADA NO DISPONIBLE. SELECCIONA 1 O 2");
								tipoEntrada = Leer.datoInt();

							}

							if (tipoEntrada == 1) {
								precio = precioNormal;

							} else {
								precio = precioVip;

							}

							System.out.println("¿TIENE TARJETA DEL CINE? 1.SI 2. NO");

							tarjetaCine = Leer.datoInt();

							while (tarjetaCine < 1 || tarjetaCine > 2) {

								System.out.println("OPCIÓN NO DISPONIBLE. INTRODUCE 1 O 2 ");
								tarjetaCine = Leer.datoInt();

							}

							if (tarjetaCine == 1) {

								descuento = (precio * descuentoTarjeta) / 100;
								System.out.println("SE VA A APLICAR UN DESCUENTO DEL " + descuentoTarjeta + "%.");

								precioFinal = entradasComprar * (precio - descuento);
								System.out.println("------------------TICKET----------------\n" + pelis[0] + "\t"
										+ cartelera[0][0] + "\t" + cartelera[0][1] + "\n");
								System.out.println("N.ENTRADAS \t\t\t" + entradasComprar);
								System.out.println("Precio Normal: " + precioNormal + "€");
								System.out.println("Precio VIP: " + precioVip + "€");
								System.out.println("Descuento Tarteja \t\t" + descuentoTarjeta + "%");
								System.out.println("---------------------------------------");
								System.out.println("TOTAL A PAGAR " + precioFinal + "€");

							} else {

								precioFinal = entradasComprar * precio;
								System.out.println("------------------TICKET----------------\n" + pelis[0] + "\t"
										+ cartelera[0][0] + "\t" + cartelera[0][1] + "\n");
								System.out.println("N.ENTRADAS \t\t\t" + entradasComprar);
								System.out.println("Precio Normal: " + precioNormal + "€");
								System.out.println("Precio VIP: " + precioVip + "€");
								System.out.println("---------------------------------------");
								System.out.println("TOTAL A PAGAR " + precioFinal + "€");
							}
							break;
						case 2:
							contador2++;
							System.out
									.println("ASIENTOS OCUPADOS:\n" + "#: LIBRE\nX: OCUPADO\n" + "-----PANTALLA----\n");
							for (int i = 0; i < asientos1.length; i++) {
								System.out.println("Fila "+(i+1));		
								
								for (int j = 0; j < asientos1[i].length; j++) {
									System.out.print( (j+1)+"."+asientos2[i][j]+"\t" );

								}
								System.out.println();
							}

							System.out.println("INDÍCAME CUÁNTAS ENTRADAS VA A COMPRAR:");
							entradasComprar = Leer.datoInt();
							cont2 = 0;

							while (cont2 < entradasComprar) {
								System.out.println("SELECCIANA LA FILA DE ASIENTOS QUE DESEA:");
								filaAsiento = Leer.datoInt();
								System.out.println("SELECCIONE EL ASIENTO DE LA FILA " + filaAsiento);
								columnaAsiento = Leer.datoInt();

								while (filaAsiento - 1 < 0 || filaAsiento - 1 >= asientos2.length
										|| columnaAsiento - 1 < 0 || columnaAsiento - 1 >= asientos2[0].length
										|| !asientos2[filaAsiento - 1][columnaAsiento - 1].equals("#")) {

									System.out.println("ASIENTO NO DISPONIBLE O YA OCUPADO. INTRODUCE OTRO:");
									System.out.println("SELECCIANA LA FILA DE ASIENTOS QUE DESEA:");
									filaAsiento = Leer.datoInt();
									System.out.println("SELECCIONE EL ASIENTO DE LA FILA " + filaAsiento);
									columnaAsiento = Leer.datoInt();

								}

								asientos2[filaAsiento - 1][columnaAsiento - 1] = "X";
								System.out.println("ASIENTO RESERVADO");
								cont2++;

							}

							System.out.println("TIPO DE ENTRADA 1. NORMAL (10€) 2.VIP (15€)");
							tipoEntrada = Leer.datoInt();
							while (tipoEntrada < 1 || tipoEntrada > 2) {
								System.out.println("ENTRADA NO DISPONIBLE. SELECCIONA 1 O 2");
								tipoEntrada = Leer.datoInt();

							}

							if (tipoEntrada == 1) {

								precio = precioNormal;

							} else {

								precio = precioVip;

							}

							System.out.println("¿TIENE TARJETA DEL CINE? 1.SI 2. NO");
							tarjetaCine = Leer.datoInt();

							while (tarjetaCine < 1 || tarjetaCine > 2) {

								System.out.println("OPCIÓN NO DISPONIBLE. INTRODUCE 1 O 2 ");
								tarjetaCine = Leer.datoInt();

							}

							if (tarjetaCine == 1) {

								descuento = (precio * descuentoTarjeta) / 100;

								System.out.println("SE VA A APLICAR UN DESCUENTO DEL " + descuentoTarjeta + "%");

								precioFinal = entradasComprar * (precio - descuento);

								System.out.println("------------------TICKET----------------\n" + pelis[1] + "\t"
										+ cartelera[1][0] + "\t" + cartelera[1][1] + "\n");
								System.out.println("N.ENTRADAS \t\t\t" + entradasComprar);
								System.out.println("Precio Normal: " + precioNormal + "€");
								System.out.println("Precio VIP: " + precioVip + "€");
								System.out.println("Descuento Tarteja \t\t" + descuentoTarjeta + "%");
								System.out.println("---------------------------------------");
								System.out.println("TOTAL A PAGAR " + precioFinal + "€");

							} else {

								precioFinal = entradasComprar * precio;

								System.out.println("------------------TICKET----------------\n" + pelis[1] + "\t"
										+ cartelera[1][0] + "\t" + cartelera[1][1] + "\n");
								System.out.println("N.ENTRADAS \t\t\t" + entradasComprar);
								System.out.println("Precio Normal: " + precioNormal + "€");
								System.out.println("Precio VIP: " + precioVip + "€");
								System.out.println("Descuento Tarteja \t\t" + descuentoTarjeta + "%");
								System.out.println("---------------------------------------");
								System.out.println("TOTAL A PAGAR " + precioFinal + "€");

							}
							break;

						default:
							System.out.println("OPCIÓN INCORRECTA");
							break;

						}

// aquí ponemos que es 0 porque cuando tu seleccionas en el indice del array en

// verdad es 0

						/*
						 * if (peliculaSeleccionada == 0) { contador1++; } else { contador2++; }
						 */
						System.out.println("COMPRA REALIZADA. Muchas gracias");

						break;
					default:
						System.out.println("OPERACIÓN INCORRECTA");
						break;
					}
				} while (op2 != 0);
				break;
			default:
				System.out.println("OPCIÓN INCORRECTA");
				break;
			}
		} while (usuario != 0);

	}

}