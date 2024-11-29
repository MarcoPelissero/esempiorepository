package main;

import java.util.Scanner;

public class Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num[] = { 5, 10, 15, 20, 25 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci numero: ");
		int numero = scanner.nextInt();
		boolean caso = false;
		for (int i = 0; i < num.length; i++)
		{
			if (numero == num[i])
			{
				System.out.println(i);
				caso = true;

			}

		}
		if (caso == false)
		{
			System.out.print("Numero non trovato");
		}
		scanner.close();
	}

}
