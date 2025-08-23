public class Questao02 {
		// método que inicia execução do aplicativo Java
		public static void main(String[] args) {
			// Declarando variáveis
			int n1;
			
			// Capturando dados
			System.out.println("Digite um número inteiro: ");
			
			n1 = Integer.parseInt(System.console().readLine());
			
			// Tratando dados
			
			if ( n1 > 1 && n1 < 9 ) {
				System.out.println("O valor está dentro da faixa permitida");
			} else {
				System.out.println("O valor está fora da faixa permitida");
			}
		}
}