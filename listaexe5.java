package primeirojava;
import java.util.Random;
public class listaexe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []vrandom = new int [50];
		
		Random rClass = new Random();
		
		for(int i =0;i<vrandom.length;i++) {
			vrandom[i] = rClass.nextInt();
		}
		System.out.println("O vetor é: ");
		
		for(int i=0;i<vrandom.length;i++) {
			System.out.println(vrandom[i]+"");
		}
	}

}
