package AtividadePoo;

public class DecimalNumber {


	static int inteiro(double numero) {
		int parteInteira = (int) numero;

		return parteInteira;
	}

	static double decimal(double numero) {
		double parteDecimal = numero - (int) numero;

		return parteDecimal;
	}

	public static void main(String[] args) {		
		double numero = 12.458;

		System.out.println("Parte inteira > " + inteiro(numero));
		System.out.println("Parte decimal > " + decimal(numero));
	}
}