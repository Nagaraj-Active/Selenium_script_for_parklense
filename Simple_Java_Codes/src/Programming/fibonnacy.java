package Programming;

public class fibonnacy 
{  
	  
     public static void main(String[] args)
     {
		int fab=0;
		int fab1=1;
		int fin=0;
		for(int i=10;i>=0;i--)
		{
			fin=fab+fab1;
			fab=fab1;
			fab1=fin;
		System.out.println(fin);			
		}
	 }                     
}
