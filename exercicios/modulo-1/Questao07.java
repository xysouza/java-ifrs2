public class Questao07 {
	public static void main(String[] args) {
		// Declarando variáveis
		int n1, n2, n3;
		
		// Capturando dados
		System.out.println("Digite o primeiro valor inteiro: ");
		n1 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o segundo valor inteiro: ");
		n2 = Integer.parseInt(System.console().readLine());
		
		System.out.println("Digite o terceiro valor inteiro: ");
		n3 = Integer.parseInt(System.console().readLine());		
		
		// Manipulando e retorno dos dados		
		if (n1 > n2 && n1 > n3) {
			System.out.printf("\nO valor %d é o maior valor informado.\n", n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.printf("O valor %d é o maior valor informado. \n", n2);
		} else if (n3 > n1 && n3 > n2) {
			System.out.printf("O valor %d é o maior valor informado. \n", n3);
		} else {
			System.out.println("Existem valores iguais.");
		}
	}
}