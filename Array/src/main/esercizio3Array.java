package main;
import java.util.Scanner;
public class esercizio3Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Inserisci 6 numeri: ");
		Scanner scanner=new Scanner(System.in);
		int array[]=new int[6];
		int array2[]=new int[6];
		for (int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			
			
		}
		for(int i:array)
			System.out.print(i+" ");
		
		for (int i=0;i<array.length;i++) {
			array2[i]=array[(array.length-1)-i];
			
			
			
		}for(int i:array2)
			System.out.print(i+" ");

	}

}
