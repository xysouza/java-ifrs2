public class Questao06 {
	public static void main(String[] args) {
		// Declarando variáveis
		int n1, n2, n3, n4;
		
		boolean encontrou = false;
		
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
			System.out.printf("\nO valor %d é divisível por 2 ou 3.\n", n1);
			encontrou = true;
		} if ((n2 % 2 == 0) || (n2 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.\n", n2);
			encontrou = true;
		} if ((n3 % 2 == 0) || (n3 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.\n", n3);
			encontrou = true;
		} if ((n4 % 2 == 0) || (n4 % 3 == 0)) {
			System.out.printf("O valor %d é divisível por 2 ou 3.\n", n4);
			encontrou = true;
		} if (!encontrou) {
			System.out.println("Os valores informados não são divisíveis por 2 ou 3.\n");
		} 
	}
}