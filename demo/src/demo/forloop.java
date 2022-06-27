package demo;

public class forloop {

	public static void main(String[] args) {
		{
			int number=6;
			boolean iseven =true;
			for(int h =2;h<number/2;h++)
			{
			if(number % h==0)
			{
				iseven=false;
			}
			if(iseven==true)
			{
				System.out.println("THE NUMBER IS EVEN");
				
			}
			else
			{
				System.out.println("THE NUMBER IS NOT EVEN");
				
				
			}
				
			}
			
			
			
			
		}
	}

}
