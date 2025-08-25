public class Questao04 {
	public static void main(String[] args) {
		// Declarando variáveis
		double a, b, c;
		
		// Capturando dados
		System.out.println("Digite o primeiro valor do lado do triângulo: ");
		a = Double.parseDouble(System.console().readLine());
		
		System.out.println("Digite o segundo valor do lado do triângulo: ");
		b = Double.parseDouble(System.console().readLine());
		
		System.out.println("Digite o terceiro valor do lado do triângulo: ");
		c = Double.parseDouble(System.console().readLine());
		
		// Manipulando dados		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			// Retorno dos dados após processamento
			System.out.println("Os lados formam um triângulo.");
		} else {
			System.out.println("Os valores informados não podem formar um triângulo.");
		}
		
	}
}