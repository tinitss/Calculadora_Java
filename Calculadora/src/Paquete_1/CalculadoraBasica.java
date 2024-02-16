package Paquete_1;

public class CalculadoraBasica extends Calculadora{

	@Override
	public double menu() {
		
	Operacion operacion = new Operacion();
	
    int opcion=0;
    

    System.out.println("Operaciones disponibles:");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. Multiplicar");
    System.out.println("4. Dividir");
    System.out.println("5. Raiz cuadrada");
    System.out.println("6. Potencia al cuadrado");
    System.out.println("7. Porcentaje");
    System.out.println("8. Salir");
    System.out.println();

    while (opcion < 1 || opcion > 8) {
        System.out.print("Seleccione una opcion: ");
        opcion = leer.nextInt();
        System.out.println();

        if (opcion < 1 || opcion > 8) {
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
            System.out.println("-----> USTED HA DECIDIDO SALIR DE LA CALCULADORA BÁSICA --");
            System.out.println();
            System.out.println();
            
            do {	
        	    System.out.println("¿ DESEA UTILIZAR NUEVAMENTE ALGUNA CALCULADORA ?");
        	    System.out.println("1. SI");
        	    System.out.println("2. NO");
        	    System.out.print("SELECCIONE UNA OPCIÓN:");
        	    opcion = leer.nextInt();
        	    System.out.println();
        	    
        	    if(opcion < 1 || opcion > 2) {
        	    	System.out.print("OPCION INVALIDA, VUELVA A INTENTARLO: ");
        	        seguirOperando = leer.nextInt(); 
        	    }
        	    }while(opcion < 1 || opcion > 2);
        	    
        	    	switch(opcion) {
        	    	case 1: 
        	    		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        	    		calculadoraCientifica.seleccionarCalculadora();
        	    		return operacion.getResultadoInicial();
        	    		
        	    	case 2:
        	    		System.out.println("----->---> OK JOVEN, RECUERDE QUE SU RESULTADO FINAL ES: " + operacion.getResultadoInicial());
        	    		return operacion.getResultadoInicial();
        	    	}
            break;
    }
    
    int seguirOperando = 0;
    double siguienteNumero = 0;
    

    do {
    	System.out.println();
    	System.out.println();
        System.out.println("¿ DESEA SEGUIR OPERANDO CON EL ÚLTIMO RESULTADO ?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.println();
        System.out.print("SELECCIONE UNA OPCIÓN: ");
        seguirOperando = leer.nextInt();

        while (seguirOperando < 1 || seguirOperando > 2) {
            System.out.print("OPCION INVALIDA, VUELVA A INTENTARLO: ");
            seguirOperando = leer.nextInt(); 
        }

        
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
            System.out.println("8. Salir");
            System.out.println();

            System.out.print("Seleccione una opcion: ");
            opcion = leer.nextInt();
            System.out.println();

            
                if (opcion < 1 || opcion > 8) {
                    System.out.println("OPCION INVÁLIDA, PORFA VUELVA A INTENTARLO");
                    System.out.println();
                }
            }while (opcion < 1 || opcion > 8);

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
                	System.out.println("-----> USTED HA DECIDIDO SALIR DE LA CALCULADORA BÁSICA --");
                    System.out.println("SU ÚLTIMO RESULTADO ES: " + operacion.getResultadoInicial());
                    System.out.println();
                    
                    do {	
                	    System.out.println("¿ DESEA UTILIZAR NUEVAMENTE ALGUNA CALCULADORA ?");
                	    System.out.println("1. SI");
                	    System.out.println("2. NO");
                	    System.out.print("SELECCIONE UNA OPCIÓN:");
                	    opcion = leer.nextInt();
                	    System.out.println();
                	    
                	    if(opcion < 1 || opcion > 2) {
                	    	System.out.print("OPCION INVALIDA, VUELVA A INTENTARLO: ");
                	        seguirOperando = leer.nextInt(); 
                	    }
                	    }while(opcion < 1 || opcion > 2);
                	    
                	    	switch(opcion) {
                	    	case 1: 
                	    		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
                	    		calculadoraCientifica.seleccionarCalculadora();
                	    		return operacion.getResultadoInicial();
                	    		
                	    	case 2:
                	    		System.out.println("----->---> OK JOVEN, RECUERDE QUE SU RESULTADO FINAL ES: " + operacion.getResultadoInicial());
                	    		return operacion.getResultadoInicial();
                	    	}
                    break; 	
            }
        
        }

    } while (seguirOperando == 1);
    
    System.out.println();
    System.out.println("-----> HAS DECIDIDO NO SEGUIR OPERANDO, GRACIAS POR USAR LA CALCULADORA. TU ÚLTIMO RESULTADO FUE: " + operacion.getResultadoInicial());
    System.out.println();
    
    do {	
	    System.out.println("¿ DESEA UTILIZAR NUEVAMENTE ALGUNA CALCULADORA ?");
	    System.out.println("1. SI");
	    System.out.println("2. NO");
	    System.out.print("SELECCIONE UNA OPCIÓN:");
	    opcion = leer.nextInt();
	    System.out.println();
	    
	    if(opcion < 1 || opcion > 2) {
	    	System.out.print("OPCION INVALIDA, VUELVA A INTENTARLO: ");
	        seguirOperando = leer.nextInt(); 
	    }
	    }while(opcion < 1 || opcion > 2);
	    
	    	switch(opcion) {
	    	case 1: 
	    		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
	    		calculadoraCientifica.seleccionarCalculadora();
	    		return operacion.getResultadoInicial();
	    		
	    	case 2:
	    		System.out.println("----->---> OK JOVEN, RECUERDE QUE SU RESULTADO FINAL ES: " + operacion.getResultadoInicial());
	    		return operacion.getResultadoInicial();
	    	}
    
    double resultado = 0;
    return resultado;
}
	
}

