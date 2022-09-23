package primeirojava;
import java.util.Scanner;

class QuestoesSimples {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome \n");
		String nome = leitor.nextLine();
		//System.out.println(nome);
		
		System.out.println("Digite sua idade \n");
		int idade = leitor.nextInt();
		//System.out.println(idade);
		
		System.out.println("Digite sua altura \n");
		double altura = leitor.nextDouble();
		
	}

}
