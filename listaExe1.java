package primeirojava;
import java.util.Scanner;
public class listaExe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		float valor = 1000;
		double saldo;
		double correcao = .001;
		
		saldo = valor*correcao;
		System.out.println(saldo);
	}

}
