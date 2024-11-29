package main;

public class esercizio6Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*
		 * Descrizione: Scrivi un programma che trovi tutti gli elementi duplicati in un
		 * array di numeri interi.
		 * 
		 * Requisiti:
		 * 
		 * Dichiarare un array di numeri interi (esempio: {4, 3, 2, 7, 8, 2, 3, 1}).
		 * Identificare gli elementi che compaiono più di una volta. Stampare gli
		 * elementi duplicati.
		 */
		boolean arrayNullo = true;
		int array[] = { 8,3,7, 7, 8, 2, 3, 1 };
		boolean[] valoreIncontrato = new boolean[array.length];
		int[] risultato = new int[array.length];
		int[] zero = new int[array.length];

		for (int i = 0; i < array.length; i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if (array[i] == array[j] && valoreIncontrato[j] == false)
				{
					risultato[i] = array[i];
					valoreIncontrato[i] = true;
					valoreIncontrato[j] = true;

				}
			}
		}
		for (int k=0;k<risultato.length;k++) {
			if (risultato[k] !=zero[k]) {
				arrayNullo=false;
				break;
			}
		}
		if(!arrayNullo) {
			System.out.print("I duplicati saranno: ");
			for (int i=0;i<risultato.length;i++) {
				if (risultato[i] !=0) {
					System.out.print(risultato[i]+" ");
				}
			}
		}

	}

}
