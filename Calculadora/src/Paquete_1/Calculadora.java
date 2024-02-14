	package Paquete_1;
	
	import java.util.Scanner;
	
	public abstract class Calculadora{
		Scanner leer = new Scanner (System.in);
		double numero1, numero2;
		int opcion = 0;
		double angulo, radian;
		
		int seguirOperando = 0;
	    double siguienteNumero = 0;
	    
	    
		public Calculadora(){	
		}
		
		public abstract double menu();
		
		public void seleccionarCalculadora() {
			
			int opcion=0;
			
			
			do {
			System.out.println("-- BIENVENIDO, ¿CUÁL CALCULADORA QUIERES USAR? -- ");
			System.out.println();
			System.out.println("1. CALCULADORA BÁSICA: ");
			System.out.println("2. CALCULADORA CIENTÍFICA: ");
			System.out.println("3. SALIR");
			System.out.print("ELIJA UNA OPCIÓN: ");
			opcion = leer.nextInt();
			
			System.out.println();
		
			
			switch (opcion) {
			case 1:
				System.out.println("---- CALCULADORA BÁSICA ----");
				CalculadoraBasica objBasica = new CalculadoraBasica();
				objBasica.menu();
				break;
				
			case 2:
				System.out.println("---- CALCULADORA CIENTÍFICA ----");
				CalculadoraCientifica objCientifica = new CalculadoraCientifica();
				objCientifica.menu();
				break;
			
			case 3:
				System.out.println("SALIENDO DEL PROGRAMA... BUEN DÍA JOVEN");
				break;
				
			default: 
				System.out.println("ERROR, POR FAVOR VUELVA A INTENTARLO");
			}
			}while(opcion < 1 || opcion > 3);
		}
		
			
		
		
	}

