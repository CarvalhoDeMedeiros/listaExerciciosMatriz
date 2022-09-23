package primeirojava;
import java.util.Scanner;
public class porra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ler os dados do teclado
        int i, j;
        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = leitor.nextInt();
            }

        }
        for (i = 0; i < 3; i++) {
            
            
            for (j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println();
        }
//somar diagnonal principal
        int diagonalP = 0;
        for (i=0; i<3; i++){
            for (j=0; j<3; j++){
               if (i==j){
                  diagonalP = diagonalP + (matriz[i][j]); 
               } 
               
            }
        }
        
        	int diagS = 0;
        	for(i=0;i<3;i++){
        		for(j=3-1;j>=0;j--) {
        			diagS = diagS + (matriz[i][j]);
        			i++;
        		}
        	}
        	
        	int elemAcima=0;
        	int elemAbaixo=0;
        	
        	for(i=0;i<3;i++) {
        		for(j=0;j<3;j++) {
        			if(i<j) {
        				elemAcima = elemAcima + (matriz[i][j]);
        			}else if (i>j){
        				elemAbaixo = elemAbaixo + (matriz[i][j]);
        			}
        		}
        	}
        	System.out.println("Essa é o valor da diagonal princiapal: "+diagonalP);
        	System.out.println("Diagonal principal: "+ diagonalP + "e Diagonal Secundaria: "+ diagS);
        	System.out.println("elemento acima: "+elemAcima);
        	System.out.println("Elementos Abaixo: "+elemAbaixo);
    }

}


