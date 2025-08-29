public class Questao09 {
	public static void main(String[] args) {
		// Declarando variáveis
		double salario;
		
		// Capturando dados
		System.out.println("Digite o valor do seu salário: ");
		salario = Double.parseDouble(System.console().readLine());	
		
		// Manipulando e retorno dos dados		
		if (salario < 5000) {
			double aumento;
			aumento = (salario * 30) / 100;
			System.out.printf("\nO valor %.2f R$ é o seu novo salário com aumento.\nParabéns!", salario + aumento);
		} else {
			System.out.printf("O salário informado é maior que 5.000 R$. \nSem aumento.");
		}
	}
}