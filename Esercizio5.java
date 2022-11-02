package lezione6Adecco;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
				Scanner key = new Scanner(System.in);
				
				String parolaUtente= key.nextLine();
				int index=0;
				boolean vocali=true;
		     	while (index<parolaUtente.length()) {
					char lettera=parolaUtente.charAt(index);
		     		if(!(lettera == 'a' ||
		     		     lettera == 'e' ||
		     		     lettera == 'i' ||
		     		     lettera == 'o' ||
		     		     lettera == 'u' ))
		     			vocali=false;
		     			index+=2;
		     			
		     		}	
	System.out.println("alle posizioni pari ci stanno solo vocali?"+ vocali);

			}
}

/*
 * 
 */
