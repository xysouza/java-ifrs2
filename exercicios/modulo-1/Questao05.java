public class Questao05 {
	public static void main(String[] args) {
		// Declarando variáveis
		int n1, n2, n3, n4, teste;
		
		// Capturando dados
		System.out.println("Digite o primeiro valor inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o segundo valor inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o terceiro valor inteiro: ");
		n3 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o quarto valor inteiro: ");
		n4 = Integer.parseInt(System.console().readLine());
		
		
		// Manipulando e retorno dos dados		
		if ((n1 % 2 == 0) || (n1 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.", n1);
		} else if ((n2 % 2 == 0) || (n2 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.", n2);
		} else if ((n3 % 2 == 0) || (n3 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.", n3);
		} else if ((n4 % 2 == 0) || (n4 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.", n4);
		} else {
			System.out.println("Os valores informados não são divisíveis por 2 ou 3.");
		} 
	}
}