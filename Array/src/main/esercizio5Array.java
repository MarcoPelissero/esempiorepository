package main;
import java.util.Scanner;
public class esercizio5Array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Scrivi un programma che:

			Chieda all'utente di inserire un array di 8 numeri interi.
			Calcoli la somma degli elementi che si trovano in posizione pari (indice 0, 2, 4, ecc.).
			Stampi il risultato.*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci 8 cifre: ");
		int array[]=new int[8];
		int somma=0;
		
		for (int i=0;i<array.length;i++){
			array[i]=scanner.nextInt();
		}
			/*for(int i:array) {
				System.out.println(i+" ");
			}*/
			for(int i=0;i<array.length;i+=2) {
				somma=array[i]+somma;
				
				
				
			
			}System.out.println(somma);
				
				
					
				
				
		}
		
		

	}


