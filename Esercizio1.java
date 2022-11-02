package lezione6Adecco;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		int numeroUtente ;
		int numeroPari= 0;
		
		do {
			
			System.out.println("Inserisci");
			numeroUtente = key.nextInt();
			if (numeroUtente%2==0)
				numeroPari++;			
		} 
		while (numeroUtente != -1);
		System.out.println("i numeri pari sono "+ numeroPari);
	}
	
	
}