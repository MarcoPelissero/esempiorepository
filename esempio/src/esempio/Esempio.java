package esempio;

import java.util.Scanner;

public class Esempio {

	public static void main(String[] args) {
		// Dichiarazione e inizializzazione variabili
		int costobasic = 10;
		int minutibasic = 50;
		double extrabasic = 0.20;
		int costostandard = 20;
		int minutistandard = 150;
		double extrastandard = 0.15;
		int costopremium = 30;
		int minutipremium = 300;
		double extrapremium = 0.10;
		int basic = 1;
		int standard = 2;
		int premium = 3;
		//input cliente
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci il piano tariffario desiderato(basic(1),standard(2),premium(3)): ");
		int piano = scanner.nextInt();
		System.out.print("Quanti minuti hai utilizzato questo mese?");
		int min = scanner.nextInt();
		//calcolo piano basic
		if (piano == basic) {
			if (min > minutibasic) {
				int minextra = min - minutibasic;
				double costoextra = minextra * extrabasic;
				double prezzo = costobasic + costoextra;
				System.out.print("Costo totale: " + prezzo + "euro. Hai superato il limite di " + minextra + " minuti");

			} else {
				System.out.print("costo totale: " + costobasic + " euro");

			}
			//calcolo piano standard
		} else if (piano == standard) {
			if (min > minutistandard) {
				int minextra = min - minutistandard;
				double costoextra = minextra * extrastandard;
				double prezzo = costostandard + costoextra;
				System.out.print("Costo totale: " + prezzo + "euro. Hai superato il limite di " + minextra + " minuti");
			} else {
				System.out.print("costo totale: " + costostandard + " euro.Non hai superato i minuti inclusi");
			}
			//calcolo piano premium
		} else if (piano == premium) {
			if (min > minutipremium) {
				int minextra = min - minutipremium;
				double costoextra = minextra * extrapremium;
				double prezzo = costopremium + costoextra;
				System.out.print("Costo totale: " + prezzo + "euro. Hai superato il limite di " + minextra + " minuti");
			} else {
				System.out.print("costo totale: " + costopremium + " euro.Non hai superato i minuti inclusi");
			}
		}else {
			System.out.print("Inserisci piano tariffario adeguato");
		}
		scanner.close();
	}

}

