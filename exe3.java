package primeirojava;
import java.util.Scanner;
public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite sua idade");
		
		idade = leitor.nextInt();
		
		if(idade <= 18) {
			System.out.println("parabens");
		}else {
			System.out.println("Volte quando tiver 18 anos");
		}
	}

}
