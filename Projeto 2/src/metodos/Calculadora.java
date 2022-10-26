package metodos;

public class Calculadora {

	public static void soma(double a, double b) {
		double c = a + b;
		System.out.println("A soma de " + a + " + " + b + " resulta em " + c);

	}
	public static void subtracao(double a, double b) {
		double c = a - b;
		System.out.println("A subtração de " + a + " - " + b + " resulta em " + c);
	}
	public static void multiplicacao(double a, double b) {
		double c = a * b;
		System.out.println("A multiplicação de " + a + " * " + b + " resulta em " + c);
	}
	public static void divisao(double a, double b) {
		double c = a / b;
		System.out.println("A divisão de " + a + "/" + b + " resulta em " + c);
	}
}
