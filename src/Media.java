import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1b1;
		double n2b1;
		double n3b1;
		double n4b1;
		double n1b2;
		double n2b2;
		double n3b2;
		double n4b2;
		double mediaPrimeiroBimestre = 0;
		double mediaSegundoBimestre = 0;
		double mediaSemestral = 0;
		double notaFaltante = 0;
		Scanner recebe = new Scanner(System.in);
		
		System.out.println("Digite a nota da prova do 1º bimestre: ");
		n1b1 = recebe.nextDouble();
		System.out.println("Digite a nota do projeto do 1º bimestre: ");
		n2b1 = recebe.nextDouble();
		System.out.println("Digite a nota da lista de exercícios do 1º bimestre: ");
		n3b1 = recebe.nextDouble();
		System.out.println("Digite a nota das moocs do 1º bimestre: ");
		n4b1 = recebe.nextDouble();
		System.out.println("Digite a nota da prova do 2º bimestre: ");
		n1b2 = recebe.nextDouble();
		System.out.println("Digite a nota do projeto do 2º bimestre: ");
		n2b2 = recebe.nextDouble();
		System.out.println("Digite a nota da lista de exercícios do 2º bimestre: ");
		n3b2 = recebe.nextDouble();
		System.out.println("Digite a nota das moocs do 2º bimestre: ");
		n4b2 = recebe.nextDouble();
		
		mediaPrimeiroBimestre = ((n1b1 * 3) + (n2b1 * 3) + (n3b1 * 2) + (n4b1 * 3)) / 11;		
		mediaSegundoBimestre = ((n1b2 * 3) + (n2b2 * 3) + (n3b2 * 2) + (n4b2 * 3)) / 11;
		mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre) / 2;
		notaFaltante = 10 - mediaSemestral;
		
		if(mediaSemestral >= 8) {
			System.out.printf("Parabéns. você está aprovado, sua Média Semestral foi: %.1f %n", (mediaSemestral));
		} else {
			System.out.printf("Você está reprovado, sua Média Semestral foi: %.1f %n", (mediaSemestral));
			System.out.printf("Você precisa de %.1f para passar" ,(notaFaltante));
		}

	}

}
