public class Questao10 {
	public static void main(String[] args) {
		// Declarando variáveis
		double valor1, valor2, valor3;
		double peso1, peso2, peso3;
		double media_Ponderada;
		
		// Capturando dados
		peso1 = 2;
		peso2 = 3;
		peso3 = 5;
		
		System.out.println("Digite a nota do trabalho de laboratório: ");
		valor1 = Double.parseDouble(System.console().readLine());

		System.out.println("Digite a nota da avaliação semestral: ");
		valor2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Digite a nota do exame final: ");
		valor3 = Double.parseDouble(System.console().readLine());	
		
		// Manipulando e retorno dos dados	
		media_Ponderada = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3);
		char conceito; 
		if ((media_Ponderada >= 8) && (media_Ponderada <= 10)) {
			conceito = 'A';
			System.out.printf("\nO valor da média ponderada é %.1f.\nO conceito de sua nota é %c.\nParabéns!", media_Ponderada, conceito);
		} else if ((media_Ponderada >= 7) && (media_Ponderada < 8)){
			conceito = 'B';
			System.out.printf("\nO valor da média ponderada é %.1f.\nO conceito de sua nota é %c.\nParabéns!", media_Ponderada, conceito);
		} else if ((media_Ponderada >= 6) && (media_Ponderada < 7)){
			conceito = 'C';
			System.out.printf("\nO valor da média ponderada é %.1f.\nO conceito de sua nota é %c.\nParabéns!", media_Ponderada, conceito);
		} else if ((media_Ponderada >= 5) && (media_Ponderada < 6)){
			conceito = 'D';
			System.out.printf("\nO valor da média ponderada é %.1f.\nO conceito de sua nota é %c.\nParabéns!", media_Ponderada, conceito);
		} else if ((media_Ponderada >= 0) && (media_Ponderada < 5)){
			conceito = 'E';
			System.out.printf("\nO valor da média ponderada é %.1f.\nO conceito de sua nota é %c.", media_Ponderada, conceito);
		} else {
			System.out.println("Você digitou algo errado.");
		}
	}
}