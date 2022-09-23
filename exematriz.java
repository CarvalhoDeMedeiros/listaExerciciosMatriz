package primeirojava;
import java.util.Scanner;

public class exematriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int linha, coluna;
		
		System.out.println("Digite a quantidade de liinhas");
		linha = leitor.nextInt();
		System.out.println("Digite a quantidade de colunas");
		coluna = leitor.nextInt();
		
		int[][]matriz = new int[linha][coluna]; // adicionando linahs e colunas a matriz
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				//System.out.print(matriz[i][j]);
				
				//System.out.println("Digite os valores [ "+i+","+j+"]" );
				//matriz[i][j] = leitor.nextInt();
			}
		}
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				
				System.out.print(matriz[i][j] +" ");
				
			}
			System.out.println();
		}
	}

}

