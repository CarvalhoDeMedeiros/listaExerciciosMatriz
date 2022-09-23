package primeirojava;

import java.util.Scanner;

public class listaexe4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leitor = new Scanner(System.in);
	 int []vetor = new int [10];
	 int cont = 0;
	 
	// exercicio 1: declarar vetor
	 for(int i = 0;i<10;i++) {
		 int num = leitor.nextInt();
		 vetor[i] = num; 
	 }
	 for(int i = 0; i<10;i++) {
		 System.out.print("["+vetor[i]+"]");
	 }
	 
	 //exercicio 2: verificar se numero ta dentro do vetor
	 System.out.println("Digite um valor");
	 int valor = leitor.nextInt();
	 int contS = 0;
	 int valorAqui=0;
	 
	 for(int i = 0;i<10;i++) {
		 
		 if(vetor[i]==valor) {
			 contS++;
			 valorAqui = vetor[i];
		 }
	 }
	 if(contS!=0) {
		 System.out.println("O valor existem edntro do vetor: "+ valorAqui);
	 }else {
		 System.out.println("O valor não existe dentro do vetor");
	 }
	 
	 // exercicio 3: ler vetor de 10 e armazenar pares e impares em vetores separados
	 
	 
	 int []vimpar = new int [10];
	 int []vpar = new int [10];
	 
	 for(int i=0;i<10;i++) {
		 if(vetor[i]%2==0) {
			 vpar[i]=vetor[i];
		 }else {
			 vimpar[i]=vetor[i];
		 }
	 }
	 //declarando vetores par e impar
	 for(int i=0;i<10;i++) {
		 
		 System.out.print("["+vimpar[i]+"]");
	 }
	 System.out.println("");
	 
	 for(int i=0;i<10;i++) {
		 
		 System.out.print("["+vpar[i]+"]");
	 }
	 
	}

	
}


