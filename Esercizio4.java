package lezione6Adecco;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
				Scanner key = new Scanner(System.in);
				
				int numeroUtente ;
				boolean alternati= true;
				int index=0;
				
				do {					
					System.out.println("Inserisci");
					numeroUtente = key.nextInt();
					
					if (index%2==0) {
					    if (numeroUtente %2 != 0)
					    	alternati=false;
					    
					}else {
						if (numeroUtente%2==0)
						alternati=false;		
					}
					index++;
				}
				while (numeroUtente != 0);
				System.out.println("la stringa dei tuoi numeri è " + alternati );

			}
}
