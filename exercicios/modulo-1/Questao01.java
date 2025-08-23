/* Programa que leia dois valores inteiros e apresente o resultado da diferença dos dois */

public class Questao01 {
	// método que inicia o execução do aplicativo Java
	public static void main(String[] args) {
		// Declaração de variáveis 
		
		int n1, n2;
		
		// Capturando dados
		
		System.out.println("Digite o primeiro número: ");
		
		n1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o segundo número: ");
		
		n2 = Integer.parseInt(System.console().readLine());
		
		// Tratando e exibindo dados
		
		if (n1 == n2) {
			System.out.println("Os números são iguais:  0   ");
		} else {
			System.out.println("Os números não são iguais");
		}
	} // fim do método que inicia o aplicativo Java
} // fim da class Questao01