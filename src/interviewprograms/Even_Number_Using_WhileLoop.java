package interviewprograms;

public class Even_Number_Using_WhileLoop {

	
	public static void main(String[] args) {
		
		int i = 1;
		
		while (i<=20)
		{
			if(i%2==0)
			{
				System.out.println("Even Number is:"+i);
				
			}
			i=i+1;
		}
	}
}
