package demo;

public class Demooperators {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int c =a+b;
		System.out.println("the value is c:" +c);
		{
        int x =a++;
        System.out.println("the vaue is x:" +x);
        {
        	int y =++a;
        	System.out.println("the value is y:" +y);
        	{
        		int z=--b;
        		System.out.println("the value is z:" +z);
        		{
        			int k=a^b;
        			System.out.println("the value is k:" +k);
        			{
        		    	int v=a&b;
        		    	System.out.println("the value is v:" +v);
        		    }
        		}
        		
        	}
        }
		}  
	}

}
