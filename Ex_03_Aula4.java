package br.com.newton.lp.exercicio;

import java.util.Scanner;

	public class Ex_03 {
	
		public static void main(String[] args) { 
	
		Scanner ler = new Scanner (System.in);
	
		int numVogal = 0;
		String frase;
	
		System.out.println("Digite um frase: ");
			frase=ler.nextLine();

			if(frase.contains("a") || frase.contains("A"))
				numVogal++;
	
			if(frase.contains("e") || frase.contains("E"))
				numVogal++;
	
			if(frase.contains("i") || frase.contains("I"))
				numVogal++;
			
			if(frase.contains("o") || frase.contains("O"))
				numVogal++;
	
			if(frase.contains("u") || frase.contains("U"))
				numVogal++;
	
		System.out.println("A quantidade de vogais na frase é: " + numVogal);
	
	}
}



