package exercicio;

public class Emprestimo {

	public static void calcular(double quantiaEmprestada, int parcelas) {
		double taxaInicial = 1.1;
		System.out.println("O valor final de " + quantiaEmprestada + " após " + parcelas + " parcelas é " + quantiaEmprestada*(taxaInicial*parcelas));
		

	}

}
