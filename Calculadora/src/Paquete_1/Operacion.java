package Paquete_1;

public class Operacion {

	    private double resultadoInicial;
	    

	    public Operacion() {
	        this.resultadoInicial = resultadoInicial;  
	    }

	    public double getResultadoInicial() {
	        return resultadoInicial;
	    }

	    public double sumar(double numero1, double numero2 ) {
	    	resultadoInicial = numero1 + numero2;
	    	return resultadoInicial;
	    }

	    public double restar(double numero1, double numero2) {
	    	resultadoInicial = numero1 - numero2;
	    	return resultadoInicial;
	    }

	    public double multiplicar(double numero1, double numero2) {
	    	resultadoInicial = numero1 * numero2;
	    	return resultadoInicial;
	    }

	    public double dividir(double numero1, double numero2) {
	        if (numero2 != 0) {
	        	resultadoInicial = numero1 / numero2;
	        } else {
	            System.out.println("Error: No se puede dividir por cero.");
	        }
			return resultadoInicial;
	    }
	    
	    public double raiz_cuadrada(double numero1) {
	    	resultadoInicial = Math.sqrt(numero1);
	    	return resultadoInicial;
	    }
	    

	    public double potencia(double numero1) {
	    	resultadoInicial = Math.pow(numero1, 2);
	    	return resultadoInicial;
	    }
	    
	    public double porcentaje(double numero1, double numeroPorcentual) {
	    	resultadoInicial = numeroPorcentual / 100;
	    	resultadoInicial = numero1 * resultadoInicial;
	    	return resultadoInicial;
	    }
	    
	    public double raiz_cubica(double numero1) {
	    	resultadoInicial = Math.cbrt(numero1);
	    	return resultadoInicial;
	    }
	    
	    public double potencia_cubo(double numero1) {
	    	resultadoInicial = Math.pow(numero1, 3);
	    	return resultadoInicial;
	    }
	    
	    
	    public double seno(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial = Math.sin(anguloEnRadianes);
	    	return resultadoInicial;
	    }
	    
	    public double coseno(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial = Math.cos(anguloEnRadianes);
	    	return resultadoInicial;
	    }
	    
	    public double tangente(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial = Math.tan(anguloEnRadianes);
	    	return resultadoInicial;
	    }
	    
	    public double cotangente(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial =(1/ Math.tan(anguloEnRadianes));
	    	return resultadoInicial;
	    }
	    
	    public double secante(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial =(1/ Math.cos(anguloEnRadianes));
	    	return resultadoInicial;
	    }
	    
	    public double cosecante(double angulo) {
	    	double anguloEnRadianes = Math.toRadians(angulo);
	    	resultadoInicial =(1/ Math.sin(anguloEnRadianes));
	    	return resultadoInicial;
	    }
	    
	    public double arcoTangente(double radian) {
	    	resultadoInicial = Math.atan(radian);
	    	return resultadoInicial;
	    }
	    
}


