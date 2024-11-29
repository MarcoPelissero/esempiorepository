package esempio;

public class quadrato
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*String txt="*****\n*\t*\n*\t*\n*****";
		System.out.println(txt);*/
		int line;
		for( line=1;line<=5;line++) {
			if(line==1 || line==5) {
				System.out.println("* * * * *");
			}else {
				System.out.println("*\t*");
			}
		}
		

	}

}
