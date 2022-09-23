package primeirojava;

import java.util.Scanner;

public class exe1 {
	public static void main(String[] args) {
	float gastoTotal, gastoTrismeste, media;
	float janeiroGasto = 15000;
	float fevereiroGasto = 23000;
	float marçoGasto = 17000;
	
	gastoTotal = janeiroGasto + fevereiroGasto + marçoGasto;
	media = (janeiroGasto + fevereiroGasto + marçoGasto)/3;
	
	System.out.println("O gasto total foi: "+gastoTotal+" e a media foi: "+ media);
	}
}
