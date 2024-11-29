package esempio;

import java.util.Scanner;

public class esercizio
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
		System.out.print("Inserisci numero: ");
		 numero=scanner.nextInt();
		
		}while (numero < 0);
			for (int i = 1; i <= 10; i++) {
			System.out.println(numero * i);
		}
		scanner.close();

	}
}

