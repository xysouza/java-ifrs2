public class Exemplo01 {

	public static void main(String[] args){
		
		double n1, n2, n3, n4, res;
		
		System.out.print("Informe a nota do primeiro bimestre: ");
		
		n1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Informe a nota do segundo bimestre: ");
		
		n2 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Informe a nota do terceiro bimestre: ");
		
		n3 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Informe a nota do quarto bimestre: ");
		
		n4 = Double.parseDouble(System.console().readLine());
		
		res = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("Média das notas = %.1f\n", res);
		
		// Implementação da estrutura SE
		if(res >= 7) {
			System.out.println("Aluno aprovado!");
		
			System.out.println("Parabens!");
		} else {
			System.out.println("Aluno reprovado!");
		
			System.out.println("Você deve repetir a matéria.");
		}
	}
}

