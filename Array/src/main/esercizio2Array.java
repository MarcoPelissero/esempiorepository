package main;
import java.util.Arrays;
import java.util.Scanner;
public class esercizio2Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Chieda all'utente di inserire un array di 6 numeri.
		Crei un nuovo array che contenga gli elementi in ordine inverso rispetto al primo.
		Stampi il nuovo array.*/
		System.out.println("Inserisci 1 numero: ");
		Scanner scanner=new Scanner(System.in);
		int cifra1=scanner.nextInt();
		int cifra2=scanner.nextInt();
		int cifra3=scanner.nextInt();
		int cifra4=scanner.nextInt();
		int cifra5=scanner.nextInt();
		int cifra6=scanner.nextInt();
		
		int array[]=new int[6];
		array[0]=cifra6;
		array[1]=cifra5;
		array[2]=cifra4;
		array[3]=cifra3;
		array[4]=cifra2;
		array[5]=cifra1;
		
		for(int i:array)
		System.out.print(i+" ");
		scanner.close();
				
			
		

	}

}
