package primeirojava;
import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		float media;
		float nota1, nota2, nota3;
		
		System.out.println("Digite suas notas");
		Scanner leitor = new Scanner(System.in);
		
		nota1 = leitor.nextFloat();
		nota2 = leitor.nextFloat();
		nota3 = leitor.nextFloat();
		
		media = (nota1 + nota2 +nota3)/3;
		
		System.out.println("Sua media é "+ media);
		if(media < 6) {
			System.out.println("jumento!");
		}else if(media >=6 && media <=9){
			System.out.println("não fez mais que sua obrigação");
		}else {
			System.out.println("parabens");
		}
	}

}
