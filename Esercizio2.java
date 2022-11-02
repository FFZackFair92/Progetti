package lezione6Adecco;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numeroUtente ;
		int nonMultipli= 0;
			do {
			
			System.out.println("Inserisci");
			numeroUtente = key.nextInt();
			if(numeroUtente%3!=0 && numeroUtente<20)
				nonMultipli++;	
		} 
		while (numeroUtente< 20);
			if(nonMultipli>0)
				System.out.println("no");
			else
				System.out.println("si");
		
	}
	
	
}