package main;

public class esercizioArray
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num1[]= {1,3,5};
		int num2[]= {2,4,6};
		int num3[]= new int[num1.length+num2.length];
		
		//indici per gli array
		int i =0, j =0,k=0;
		
		
		//eseguiamo calcolo array3
		while (i<num1.length && j <num2.length) {
			if(num1[i]<num2[j]) {
				num3[k++]=num1[i++];
			}else {
				num3[k++]=num2[j++];
			}
		}
		//aggiungiamo elementi da array1
		while(i<num1.length) {
			num3[k++]=num1[i++];
		}
		
		//aggiungiamo elementi da array2
		while(j<num2.length) {
			num3[k++]=num2[j++];
		}
		//stampiamo il risultato
		System.out.print("Array unito: ");
		for (int num : num3) {
			System.out.println(num + " ");
		}
		
		
		
			
		}
		

	}


