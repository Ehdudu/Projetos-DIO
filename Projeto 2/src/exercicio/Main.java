package exercicio;

public class Main {

	public static void main(String[] args) {
		// Calculadora
		System.out.println("Exercício Calculadora");
		Calculadora.soma(3, 9);
		Calculadora.subtracao(50,-100);
		Calculadora.multiplicacao(2, 2);
		Calculadora.divisao(10, 3);
		
		// Mensagem
		Mensagem.enviaMensagem(11);
		Mensagem.enviaMensagem(15);
		Mensagem.enviaMensagem(19);
		Mensagem.enviaMensagem(40);
		
		// Emprestimo
		Emprestimo.calcular(1000, 2);
	}

}
