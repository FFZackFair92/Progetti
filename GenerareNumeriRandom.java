package lezione6Adecco;
import java.util.Random;

public class GenerareNumeriRandom {

	public static void main(String[] args) {

		Random dadi= new Random();
		int dado1 = dadi.nextInt(6) + 1;
		int dado2 = dadi.nextInt(6) + 1;
		System.out.println(dado1);
		System.out.println(dado2);
		if(dado1+dado2==7)
			System.out.println("hai vinto");
		else
			System.out.println("hai perso");

	}

}
