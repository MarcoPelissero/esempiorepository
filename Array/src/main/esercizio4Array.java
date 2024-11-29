package main;

public class esercizio4Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] numeri = { { 1, 2, 3, 0 }, { 4, 5, 6, 10, 15 }, { 7, 8, 9,  } };
		/*
		 * System.out.print(numeri[0][0]); System.out.print(numeri[0][1]);
		 * System.out.println(numeri[0][2]); System.out.print(numeri[1][0]);
		 * System.out.print(numeri[1][1]); System.out.println(numeri[1][2]);
		 * System.out.print(numeri[2][0]); System.out.print(numeri[2][1]);
		 * System.out.print(numeri[2][2]);
		 */
		for (int i = 0; i < numeri.length; i++)
		{
			for (int j = 0; j < numeri[i].length; j++)
			{

				System.out.print(numeri[i][j] + " ");
			}

			System.out.println("");
		}

	}

}

