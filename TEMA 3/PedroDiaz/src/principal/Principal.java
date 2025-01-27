package principal;

import utilidades.Leer;
import model.Dinero;
import model.Jugador;
import crud.CrudJugador;
import model.Moderador;
import crud.CrudModerador;
import vista.VistaComprobaciones;
import vista.VistaPreguntas;
import datos.DatoPreguntasABC;
import crud.CrudPreguntas;
import model.Preguntas;
import crud.CrudDinero;
import controller.GeneradorRandom;
import controller.ControllerPregunta;
import vista.VistaPrincipal;

public class Principal {
    //El usuario de administrador es BOSCO y la contraseña es Admin1234
    //eL MÁXIMO DE PREGUNTAS QUE SE PUEDEN AÑADIR SON 100

    public static void main(String[] args) {
        int opcion, contadorPreguntas = 15, preguntaActuliazar, contador2=0, contadoracertada=0;
        double bote = 1000, cantMod;
        char respuesta;
        String nombre, usuario, usuarioNew, contrasena, pregunta, respuesta1, respuesta2, respuesta3, respuestaCorrecta, resElegida = null;
        DatoPreguntasABC lista = new DatoPreguntasABC();
        VistaPreguntas vp = new VistaPreguntas();
        ControllerPregunta ControllerP = new ControllerPregunta();
        CrudDinero cD = new CrudDinero();
        Dinero dn = new Dinero(bote); 
        CrudJugador cj = new CrudJugador();
        CrudModerador cm = new CrudModerador();
        Jugador j1 ; 
        GeneradorRandom gr = new GeneradorRandom();
        VistaComprobaciones vc = new VistaComprobaciones();
        Moderador m = new Moderador("Bosco","Admin1234"); 
        CrudPreguntas cP = new CrudPreguntas(lista);
        Preguntas pr;
        VistaPrincipal vistaP = new VistaPrincipal();
        Preguntas Px;

        do {
        
        	vistaP.imprimirLogo();
        	vistaP.imprimirMenu1();
            opcion = Leer.datoInt();
            contador2=0;

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                	do {
                	 	System.out.println("Introduzca su nombre:");
                 		nombre = Leer.dato();
					
                 	} while (nombre.equals(""));
                	
                    j1 = cj.crearJugador(nombre); //Hecho por Javier
                    System.out.println("Jugador creado correctamente");
                    
                    while (j1.getVida() > 0 && contadorPreguntas < lista.getLista().length && contador2 < contadorPreguntas) {
                    	vistaP.imprimirMenu2();  //Hecho por Mauro
                        opcion = Leer.datoInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Comodines disponibles: " + j1.getComodines()); //Hecho por Javier
                                break;

                            case 2:
                                System.out.println("Vidas restantes: " + j1.getVida()); //Hecho por Javier
                                break;

                            case 3:
                                do {
                                    pr = cP.buscarPregunta(gr.generarRandom(contadorPreguntas), contadorPreguntas); //Hecho por Pedro
                                } while (pr == null || pr.isUsado());
                                contador2++;
                               
                                vp.mostrarPregunta(pr); //Hecho por Pedro
                                cP.marcarPreguntaUsada(pr); //Hecho por Pedro

                                System.out.println("Seleccione una respuesta (a, b o c, si pones otra letra perderás una vida):");
                                respuesta = Leer.datoChar();
                                switch (respuesta) {
                                    case 'a':
                                        resElegida = pr.getRespuestaUno();
                                        break;
                                    case 'b':
                                        resElegida = pr.getRespuestaDos();
                                        break;
                                    case 'c':
                                        resElegida = pr.getRespuestaTres();
                                        break;
                                    default:
                                    	resElegida = "error";
                                        System.out.println("Opción no válida");
                                        break;
                                }

                                if (ControllerP.verificarRes(resElegida, pr)) { //Hecho por Pedro
                                    System.out.println("¡Respuesta correcta!\n");
                                    contadoracertada++;
                                    cj.sumarDinero(dn, j1, contadorPreguntas); //Hecho por Javier
                                    if (contadoracertada==4 && j1.getComodines()==0) {
                                    	
                                    	cj.recuComodin(j1);
                                    	vistaP.recuperacionComodin();
									}
                                    vistaP.imprimirEstadisticas(j1);  //Hecho por Mauro


                                } else {
                                	contadoracertada=0;
                                    System.out.println("Respuesta incorrecta!");
                                    System.out.println("1. Usar un comodín");
                                    System.out.println("2. Perder una vida y continuar");
                                    System.out.println("3. Terminar la partida");
                                    opcion = Leer.datoInt();
                                    switch (opcion) {
                                        case 1:
                                            if (j1.getComodines() > 0) { //Hecho por Javier
                                                cj.restarComodin(j1); //Hecho por Javier
                                                System.out.println("Has usado un comodín. Comodines restantes: " + j1.getComodines()); //Hecho por Javier
                                                
                                            } else {
                                                System.out.println("No tienes comodines disponibles.");
                                                cj.restarVida(j1); //Hecho por Javier
                                            }
                                            break;

                                        case 2:
                                        	cj.restarVida(j1); //Hecho por Javier
                                            System.out.println("Has perdido una vida. Vidas restantes: " + j1.getVida()); //Hecho por Javier
                                            break;

                                        case 3:
                                            j1.setVida(0); //Hecho por Javier
                                            break;

                                        default:
                                        	cj.restarVida(j1); //Hecho por Javier
                                            System.out.println("Opción no válida.");
                                            break;
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Terminando la partida.");
                               
                                j1.setVida(0); //Hecho por Javier
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                    if (contador2 < contadorPreguntas) {
                    	vistaP.impirmirPerdido(); //Hecho por Mauro
					}else {
						vistaP.imprimirGanado(); //Hecho por Mauro
						System.out.println("ESTADISTICAS FINALES");
						vistaP.imprimirEstadisticas(j1);  //Hecho por Mauro
					}
                    vistaP.imprimirFinal(); //Hecho por Mauro
                   break;

                case 2:
                    do {
                        System.out.println("Introduce el usuario:");
                        usuario = Leer.dato();
                        System.out.println("Introduce la contraseña:");
                        contrasena = Leer.dato();
                        vc.imprimirComprobacionMod(cm.comprobarContrasenaYUsuario(m, contrasena, usuario)); //Hecho por Mauro
                    } while (!cm.comprobarContrasenaYUsuario(m, contrasena, usuario)); //Hecho por Mauro

                    do {
                    	vistaP.imprimirMenu3(); //Hecho por Mauro
                        opcion = Leer.datoInt();

                        switch (opcion) {
                            case 1:
                                vp.mostrarTodasPreguntas(lista.getLista()); //Hecho por Pedro
                                break;

                            case 2:
                                do {
                                    System.out.println("1. Cambiar usuario");
                                    System.out.println("2. Cambiar contraseña");
                                    System.out.println("3. Volver atrás");
                                    opcion = Leer.datoInt();

                                    switch (opcion) {
                                        case 1:
                                        	do {    
                                        		System.out.println("Nuevo nombre de usuario:");
                                        		usuarioNew = Leer.dato();     
											} while (usuarioNew.equals(""));
                                        	cm.modificarUsuario(m, usuarioNew); //Hecho por Mauro
                                        	vistaP.imprimirCambios();  //Hecho por Mauro
                                        	break;

                                        case 2:
                                           do {
                                        	   System.out.println("Nueva contraseña:");
                                               contrasena = Leer.dato();
                                           	} while (contrasena.equals(""));
                                        	
                                            cm.modificarContrasena(m, contrasena); //Hecho por Mauro
                                            vistaP.imprimirCambios();  //Hecho por Mauro
                                            break;

                                        case 3:
                                            System.out.println("Volviendo atrás...");
                                            break;

                                        default:
                                            System.out.println("Opción no válida.");
                                            break;
                                    }
                                } while (opcion != 3);
                                break;

                            case 3:
                            	if (contadorPreguntas >= lista.getLista().length) {
                            		System.out.println("No se pueden añadir más preguntas");
                            	}else {
                            		do {
            							
                                    	System.out.println("Indica el enunciado de la pregunta:");
                                        pregunta = Leer.dato();
                                        System.out.println("Indica la primera respuesta:");
                                        respuesta1 = Leer.dato();
                                        System.out.println("Indica la segunda respuesta:");
                                        respuesta2 = Leer.dato();
                                        System.out.println("Indica la tercera respuesta:");
                                        respuesta3 = Leer.dato();
                                        do {
                                        	System.out.println("Indica la respuesta correcta:");
                                            respuestaCorrecta = Leer.dato();
        								} while (!respuestaCorrecta.equals(respuesta1) && !respuestaCorrecta.equals(respuesta2) && !respuestaCorrecta.equals(respuesta3)); //Hecho por Pedro
                                        
                                       } while (pregunta.equals("") || respuesta1.equals("") || respuesta2.equals("")  || respuesta3.equals("") || respuestaCorrecta.equals(""));
                                      	Px = new Preguntas(pregunta, respuesta1, respuesta2, respuesta3, respuestaCorrecta, false);
                            			cP.agregarPregunta(contadorPreguntas,Px ); //Hecho por Mauro
                                        contadorPreguntas++;
                                        vistaP.imprimirCambios(); //Hecho por Mauro
                            	}
                            	
                            	
                                break;

                            case 4:
                            	do {
                            		do { 
                            			System.out.println("Número de la pregunta a actualizar:");
                            			preguntaActuliazar = Leer.datoInt();
										
									} while (preguntaActuliazar < 1 || preguntaActuliazar > contadorPreguntas);
                            		
                                     System.out.println("Indica el enunciado de la pregunta:");
                                     pregunta = Leer.dato();
                                     System.out.println("Indica la primera respuesta:");
                                     respuesta1 = Leer.dato();
                                     System.out.println("Indica la segunda respuesta:");
                                     respuesta2 = Leer.dato();
                                     System.out.println("Indica la tercera respuesta:");
                                     respuesta3 = Leer.dato();
                                     System.out.println("Indica la respuesta correcta:");
                                     respuestaCorrecta = Leer.dato();
								} while (pregunta.equals("") || respuesta1.equals("") || respuesta2.equals("")  || respuesta3.equals("") || respuestaCorrecta.equals("")); //Hecho Por pedro
                            	Px= new Preguntas(pregunta, respuesta1, respuesta2, respuesta3, respuestaCorrecta, false);	
                                cP.actualizarPregunta(preguntaActuliazar - 1, Px); //Hecho por Mauro
                                break;

                            case 5:
                                System.out.println("Nueva cantidad del bote:");
                                cantMod = Leer.datoDouble();
                                cD.modificarDinero(dn, cantMod); //Hecho por Pedro
                                break;

                            case 6:
                                System.out.println("Saliendo del menú de administración...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (opcion != 6);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
        	vistaP.imprimirDespedida();
    }
}
