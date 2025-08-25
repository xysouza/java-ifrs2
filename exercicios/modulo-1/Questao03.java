public class Questao03 {
	public static void main(String[] args) {
		// Declarando variáveis
		double a, b, c, delta;
		
		// Capturando dados
		System.out.println("Digite o primeiro valor numérico: ");
		a = Double.parseDouble(System.console().readLine());
		
		System.out.println("Digite o segundo valor numérico: ");
		b = Double.parseDouble(System.console().readLine());
		
		System.out.println("Digite o terceiro valor numérico: ");
		c = Double.parseDouble(System.console().readLine());
		
		// Manipulando dados
		delta = (b * b) - (4 * a * c);
		
		if (delta < 0) {
			// Retorno dos dados após processamento
			System.out.println("A equação não possui raízes reais.");
		} else if (delta > 0) {
			// Retorno dos dados após processamento
			System.out.println("A equação possui duas raízes reais");
		} else if (delta == 0) {
			// Retorno dos dados após processamento
			System.out.println("A equação possui uma única raiz real.");
		}
		
	}
}