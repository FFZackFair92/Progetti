package lezione6Adecco;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
				Scanner key = new Scanner(System.in);
				
				int numeroUtente ;
				int numeriInseriti=0;
				int somma=0;
				
				do {					
					System.out.println("Inserisci");
					numeroUtente = key.nextInt();
					if (numeroUtente!=0) {
						somma += numeroUtente;
					    numeriInseriti++;
					}
				}
				while (numeroUtente != 0);
				System.out.println(somma);
				System.out.println(numeriInseriti);
				System.out.println("la media è "+ Double.valueOf(somma/(double)numeriInseriti));
			}
}

