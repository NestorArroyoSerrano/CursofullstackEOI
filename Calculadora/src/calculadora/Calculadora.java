package calculadora;

public class Calculadora {

	private int num1;
	private int num2;
	
	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
		
	}
	
	public int sumar() {
		int resultado = num1+ num2;
		return resultado;
		
	}
	
	public int restar() {
		int resultado = num1 - num2;
		return resultado;
	}
	public int multiplicar() {
		int resultado = num1 * num2;
		return resultado;
	}
	public int dividir() {
		int resultado = num1/num2;
		return resultado;
	}
	
}
