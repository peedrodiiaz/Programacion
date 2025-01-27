package Ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nMoviles=0, tam, op, seleccionVendido, seleccionNuevo, nMvendidos=0,index = 0;
		String marca, modelo, buscarModelo,cambiar;
		boolean vendido, nuevo;
		double precioUni, descuento=0;
		Movil lista[];	
		System.out.println("Bienvenido al programa");
		System.out.println();
		System.out.println("Indica cuántos moviles hay en la tienda");
		tam=Leer.datoInt();
		lista= new Movil [tam];
		Vendedor v;
		
			for (int i = 0; i < lista.length; i++) {
				System.out.println("Indica la marca del movil");
				marca=Leer.dato();
				System.out.println("Indica el modelo del movil");
				modelo=Leer.dato();
				System.out.println("Indica si está vendido. (1.Si 2.No)");
				seleccionVendido=Leer.datoInt();
				if (seleccionVendido==1) {
					vendido=true;
					nMvendidos++;
					
				}else {
					vendido=false;
				}
				System.out.println("Indica si el movil es nuevo (1. Si 2. No)");
				seleccionNuevo=Leer.datoInt();
				if (seleccionNuevo==1) {
					nuevo=true;
				}else {
					nuevo=false;
				}
				
				System.out.println("Indica el precio del movil");
				precioUni=Leer.datoDouble();	
			
				lista[nMoviles]=new Movil(marca, modelo, vendido, nuevo, precioUni);
				nMoviles++;
				
				System.out.println("Indica el descuento para los moviles de segunda mano");
				descuento=Leer.datoDouble();
			}
			
			v=new Vendedor(nMvendidos, lista);
			
		do {
			
			System.out.println("1. Número de moviles sin vender");
			System.out.println("2. Precio final segunda mano");
			System.out.println("3. Cambiar su movil por uno nuevo");
			System.out.println("4. Dinero conseguido con la venta");
			System.out.println("5. Listar moviles");
			
			System.out.println("Indica una opción");
			op=Leer.datoInt();
			
			switch (op) {
			case 1:
				System.out.println("Quedan sin vender "+v.movilesSinVender());
				
				break;
			case 4:
				System.out.println("Una vez se hayan vendido todos los moviles, se habrá conseguido"+v.cuentaTotal(descuento));
				break;
			case 2:
				System.out.println("Indica a que modelo le quieres ver su precio final");
				buscarModelo=Leer.dato();
				System.out.printf("El precio unitario del modelo %s es de %.2f\n",buscarModelo,v.devolverPrecioUni(buscarModelo,descuento));
			case 3:
				System.out.println("Seleccione el modelo que desea cambiar");
				cambiar=Leer.dato();
				index = v.buscarModelo(cambiar);
				System.out.println("Indica la marca del movil");
				marca=Leer.dato();
				System.out.println("Indica el modelo del movil");
				modelo=Leer.dato();
				System.out.println("Indica si está vendido. (1.Si 2.No)");
				seleccionVendido=Leer.datoInt();
				if (seleccionVendido==1) {
					vendido=true;
					
				}else {
					vendido=false;
				
				}
				System.out.println("Indica si el movil es nuevo (1. Si 2. No)");
				seleccionNuevo=Leer.datoInt();
				if (seleccionNuevo==1) {
					nuevo=true;
				}else {
					nuevo=false;
				}
				
				System.out.println("Indica el precio del movil");
				precioUni=Leer.datoDouble();
				
				
				
				lista[index] = new Movil(marca, modelo, vendido, nuevo, precioUni);
				v.cambiarMovil(index,lista[index]);
				 
				
			
				//v.cambiarMovil(v.buscarModelo(cambiar), v.nuevaMarca(marca, v.buscarModelo(cambiar)), v.nuevoModelo(modelo, v.buscarModelo(cambiar)), v.nuevoVendido(vendido, v.buscarModelo(cambiar)), v.nuuevoNuevo(nuevo, v.buscarModelo(cambiar)), 
					//	v.nuevoPrecioUni(precioUni, v.buscarModelo(cambiar)));
				
			case 5:
				v.listarMoviles(lista);
			
				
			default:
				break;
			}
			
			
			
		} while (op!=0);
		
		
		
		
		
		
		
	}

}
