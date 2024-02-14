package Paquete_1;

public class CalculadoraCientifica extends Calculadora{
	
	@Override
	public double menu() { 

		Operacion operacion = new Operacion();
		
		System.out.println("Operaciones disponibles:");
	    System.out.println("1. Sumar");
	    System.out.println("2. Restar");
	    System.out.println("3. Multiplicar");
	    System.out.println("4. Dividir");
	    System.out.println("5. Raiz cuadrada");
	    System.out.println("6. Potencia al cuadrado");
	    System.out.println("7. Porcentaje");
	    System.out.println("8. Raiz cúbica");
	    System.out.println("9. Potencia al cubo");
	    System.out.println("10. Seno");
	    System.out.println("11. Coseno");
	    System.out.println("12. Tangente");
	    System.out.println("13. Cotangente");
	    System.out.println("14. Secante");
	    System.out.println("15. Cosecante");
	    System.out.println("16. ArcoTangente");
	    System.out.println("17. Salir");
	    System.out.println();
	    
	    while (opcion < 1 || opcion > 16) {
	        System.out.print("Seleccione una opcion: ");
	        opcion = leer.nextInt();
	        System.out.println();

	        if (opcion < 1 || opcion > 16) {
	            System.out.println("OPCION INVALIDA, VUELVA A INTENTARLO");
	        }
	    }
	    
	    switch (opcion) {
	    
	    case 1:
            System.out.println("-----> USTED SELECCIONÓ SUMA --");
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            numero1 = leer.nextDouble();
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            numero2 = leer.nextDouble();
            operacion.sumar(numero1, numero2);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;

        case 2:
            System.out.println("-----> USTED SELECCIONÓ RESTA --");
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            numero1 = leer.nextDouble();
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            numero2 = leer.nextDouble();
            operacion.restar(numero1, numero2);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;

        case 3:
            System.out.println("-----> USTED SELECCIONÓ MULTIPLICACIÓN --");
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            numero1 = leer.nextDouble();
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            numero2 = leer.nextDouble();
            operacion.multiplicar(numero1, numero2);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;

        case 4:
            System.out.println("-----> USTED SELECCIONÓ DIVISIÓN --");
            System.out.print("INGRESE EL PRIMER NUMERO: ");
            numero1 = leer.nextDouble();
            System.out.print("INGRESE EL SEGUNDO NUMERO: ");
            numero2 = leer.nextDouble();
            operacion.dividir(numero1, numero2);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
        
        case 5:
        	System.out.println("-----> USTED SELECCIONÓ RAIZ CUADRADA --");
            System.out.print("INGRESE EL NÚMERO BASE: ");
            numero1 = leer.nextDouble();
            operacion.raiz_cuadrada(numero1);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
    	
        case 6:
            System.out.println("-----> USTED SELECCIONÓ POTENCIA AL CUADRADO --");
            System.out.print("INGRESE EL NÚMERO BASE: ");
            numero1 = leer.nextDouble();
            operacion.potencia(numero1);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
            
        case 7:
            System.out.println("-----> USTED SELECCIONÓ PORCENTAJE --");
            System.out.print("INGRESE EL NÚMERO BASE: ");
            numero1 = leer.nextDouble();
            System.out.print("INGRESE EL PORCENTAJE: ");
            numero2 = leer.nextDouble();
            operacion.porcentaje(numero1, numero2);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
	    
	    case 8: 
	    	System.out.println("-----> USTED SELECCIONÓ RAIZ CÚBICA --");
            System.out.print("INGRESE EL NÚMERO BASE: ");
            numero1 = leer.nextDouble();
            operacion.raiz_cubica(numero1);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
            
	    case 9:
            System.out.println("-----> USTED SELECCIONÓ POTENCIA AL CUBO --");
            System.out.print("INGRESE EL NÚMERO BASE: ");
            numero1 = leer.nextDouble();
            operacion.potencia_cubo(numero1);
        	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
            break;
	    
	    case 10:
	    	System.out.println("-----> USTED SELECCIONÓ SENO --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("EL SENO ES: "  + operacion.seno(angulo));
	    	break;
	    	
	    case 11:
	    	System.out.println("-----> USTED SELECCIONÓ COSENO --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("EL COSENO ES: "  + operacion.coseno(angulo));
	    	break;
	    	
	    case 12:
	    	System.out.println("-----> USTED SELECCIONÓ TANGENTE --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("LA TANGENTE ES: "   + operacion.tangente(angulo));
	    	break;
	    	
	    case 13:
	    	System.out.println("-----> USTED SELECCIONÓ COTANGENTE --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("LA CONTANGENTE ES: "  + operacion.cotangente(angulo));
	    	break;
	    	
	    case 14:
	    	System.out.println("-----> USTED SELECCIONÓ SECANTE --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("LA SECANTE ES: "  + operacion.secante(angulo));
	    	break;
	    	
	    case 15:
	    	System.out.println("-----> USTED SELECCIONÓ COSECANTE --");
	    	System.out.print("INGRESE EL ANGULO: "); 
	    	angulo = leer.nextDouble();
	    	System.out.println("LA COSECANTE ES: "  + operacion.cosecante(angulo));
	    	break;
	    	
	    case 16:
	    	System.out.println("-----> USTED SELECCIONÓ ARCOTANGENTE --");
	    	System.out.print("INGRESE LOS RADIANES: "); 
	    	radian = leer.nextDouble();
	    	System.out.println("EL ARCO TANGENTE ES: "  + operacion.arcoTangente(radian));
	    	break;
	    	
	    case 17:
            System.out.println("-----> USTED HA DECIDIDO SALIR DE LA CALCULADORA CIENTÍFICA --");
            System.out.println();
            System.out.println();
            System.out.println();
            seleccionarCalculadora();
            break;
	    }
		
	    int seguirOperando = 0;
	    double siguienteNumero = 0;
	    

	    do {
	    	do {
	    		
	    	
	    	System.out.println();
	    	System.out.println();
	        System.out.println("¿ DESEA SEGUIR OPERANDO ?");
	        System.out.println("1. SI");
	        System.out.println("2. NO");
	        System.out.println();
	        System.out.print("SELECCIONE UNA OPCIÓN: ");
	        seguirOperando = leer.nextInt();

	        if(seguirOperando < 1 || seguirOperando > 2) {
	        	System.out.print("OPCION INVALIDA, VUELVA A INTENTARLO: ");
	            seguirOperando = leer.nextInt(); 
	        }
	    	}while (seguirOperando < 1 || seguirOperando > 2);
	            
	        if (seguirOperando == 1) {
	        	System.out.println();
	            System.out.println();
	        
	            do {
	            	System.out.println("Operaciones disponibles:");
	        	    System.out.println("1. Sumar");
	        	    System.out.println("2. Restar");
	        	    System.out.println("3. Multiplicar");
	        	    System.out.println("4. Dividir");
	        	    System.out.println("5. Raiz cuadrada");
	        	    System.out.println("6. Potencia al cuadrado");
	        	    System.out.println("7. Porcentaje");
	        	    System.out.println("8. Raiz cúbica");
	        	    System.out.println("9. Potencia al cubo");
	        	    System.out.println("10. Seno");
	        	    System.out.println("11. Coseno");
	        	    System.out.println("12. Tangente");
	        	    System.out.println("13. Cotangente");
	        	    System.out.println("14. Secante");
	        	    System.out.println("15. Cosecante");
	        	    System.out.println("16. Salir");
	        	    System.out.println();

	            System.out.print("Seleccione una opcion: ");
	            opcion = leer.nextInt();
	            System.out.println();
	            
	            if (opcion < 1 || opcion > 16) {
                    System.out.println("OPCION INVÁLIDA, PORFA VUELVA A INTENTARLO");
                    System.out.println();
                }
            }while (opcion < 1 || opcion > 16);
	            
	            
	            switch (opcion) {
                case 1:
                    System.out.println("-----> USTED SELECCIONÓ SUMA --");
                    System.out.print("INGRESE EL SIGUIENTE NUMERO: ");
                    siguienteNumero = leer.nextDouble();
                    operacion.sumar(operacion.getResultadoInicial(), siguienteNumero);
                    System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
                    break;

                case 2:
                    System.out.println("-----> USTED SELECCIONÓ RESTA --");
                    System.out.print("INGRESE EL SIGUIENTE NUMERO: ");
                    siguienteNumero = leer.nextDouble();
                    operacion.restar(operacion.getResultadoInicial(), siguienteNumero);
                    System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
                    break;

                case 3:
                    System.out.println("-----> USTED SELECCIONÓ MULTIPLICACIÓN --");
                    System.out.print("INGRESE EL SIGUIENTE NUMERO: ");
                    siguienteNumero = leer.nextDouble();
                    operacion.multiplicar(operacion.getResultadoInicial(), siguienteNumero);
                    System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
                    break;

                case 4:
                    System.out.println("-----> USTED SELECCIONÓ DIVISIÓN --");
                    System.out.print("INGRESE EL SIGUIENTE NUMERO: ");
                    siguienteNumero = leer.nextDouble();
                    operacion.dividir(operacion.getResultadoInicial(), siguienteNumero);
                    System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
                    break;
                    
                case 5:
                    System.out.println("-----> USTED SELECCIONÓ RAIZ CUADRADA --");
                    System.out.println("LA RAÍZ CUADRADA DE: " + operacion.getResultadoInicial() + " ES: " + operacion.raiz_cuadrada(operacion.getResultadoInicial()));
                    break;
                
                case 6:
                	System.out.println("-----> USTED SELECCIONÓ POTENCIA AL CUADRADO --");
                    System.out.println("LA POTENCIA AL CUADRADO DE: " + operacion.getResultadoInicial() + " ES: " + operacion.potencia(operacion.getResultadoInicial()));
                    break;
                
                case 7:
                	System.out.println("-----> USTED SELECCIONÓ PORCENTAJE --");
                	System.out.println("INGRESE EL PORCENTAJE QUE DESEA CALCULAR: ");
                	numero2 = leer.nextDouble();
                	operacion.porcentaje(operacion.getResultadoInicial(), numero2);
                	System.out.println("SU RESULTADO ES: " + operacion.getResultadoInicial());
                    break;
                    
                case 8: 
                	System.out.println("-----> USTED SELECCIONÓ RAIZ CÚBICA --");
                	System.out.println("LA RAÍZ CÚBICA DE: " + operacion.getResultadoInicial() + " ES: " + operacion.raiz_cubica(operacion.getResultadoInicial()));
                    break;
                    
                case 9:
                	System.out.println("-----> USTED SELECCIONÓ POTENCIA AL CUBO --");
                    System.out.println("LA POTENCIA AL CUBO DE: " + operacion.getResultadoInicial() + " ES: " + operacion.potencia_cubo(operacion.getResultadoInicial()));
                    break;
                    
                case 10:
                	System.out.println("-----> USTED SELECCIONÓ SENO--");
                	System.out.println("LA SENO DE: " + operacion.getResultadoInicial() + " ES: " + operacion.seno(operacion.getResultadoInicial()));
                	break;
                	
                case 11:
                	System.out.println("-----> USTED SELECCIONÓ COSENO--");
                	System.out.println("LA COSENO DE: " + operacion.getResultadoInicial() + " ES: " + operacion.coseno(operacion.getResultadoInicial()));
                	break;
                	
                case 12:
                	System.out.println("-----> USTED SELECCIONÓ TANGENTE--");
                	System.out.println("LA TANGENTE DE: " + operacion.getResultadoInicial() + " ES: " + operacion.tangente(operacion.getResultadoInicial()));
                	break;
                	
                case 13:
                	System.out.println("-----> USTED SELECCIONÓ COTANGENTE--");
                	System.out.println("LA COTANGENTE DE: " + operacion.getResultadoInicial() + " ES: " + operacion.cotangente(operacion.getResultadoInicial()));
                	break;
                	
                case 14:
                	System.out.println("-----> USTED SELECCIONÓ SECANTE--");
                	System.out.println("LA SECANTE DE: " + operacion.getResultadoInicial() + " ES: " + operacion.secante(operacion.getResultadoInicial()));
                	break;
                	
                case 15:
                	System.out.println("-----> USTED SELECCIONÓ COSECANTE--");
                	System.out.println("LA COSECANTE DE: " + operacion.getResultadoInicial() + " ES: " + operacion.cosecante(operacion.getResultadoInicial()));
                	break;
                	
                case 16:
                	System.out.println("-----> USTED HA DECIDIDO SALIR DE LA CALCULADORA BÁSICA --");
                    System.out.println("SU ÚLTIMO RESULTADO ES: " + operacion.getResultadoInicial());
                    break; 	
            }
        
        }

    } while (seguirOperando == 1);
    
    System.out.println();
    System.out.println("-----> HAS DECIDIDO NO SEGUIR OPERANDO, GRACIAS POR USAR LA CALCULADORA. TU ÚLTIMO RESULTADO FUE: " + operacion.getResultadoInicial());
    
		
		
		
		double resultado = 0;
	    return resultado;
		
	}
	

}
