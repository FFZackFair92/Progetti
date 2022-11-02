package lezione6Adecco;
import java.util.Random;
import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("ciao scegli un numero");
		int index=0;
		int numeroUtente=key.nextInt() ;
			if(numeroUtente>36) {
		
			System.err.println("devi inserire un valore massimo di 36");
			System.out.println("inserisci nuovamente");
			numeroUtente= key.nextInt();
		}
		else {	
		Random dadi= new Random();
		int dado1 = dadi.nextInt(36) + 1;

		System.out.println(dado1);
		if(dado1==numeroUtente)
			System.out.println("hai vinto");
		else
			System.out.println("hai perso");

		}
	}
}
