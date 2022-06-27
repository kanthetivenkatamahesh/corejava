package demo;

public class Opreators {

	public static void main(String[] args) {
    int x=100;
    int y=200;
    int z=x+y;
	System.out.println("****ARITHEMETIC****");
	System.out.println("the value is z:" +z);
	{
      int p=34;
      int q=22;
      int r=p++;
      System.out.println("****UNARY INCREMENT POST OPERATOR********");
      System.out.println("the value is r:" +r);
    	  { 
    	     int u=++q;
             System.out.println("*****UNARY INCREMENT PRE POST*****");
             System.out.println("the value is u:" +u);
             {
            	int m=p--; 
                 System.out.println("****UNARY DECREMENT POST OPERATOR*****");
            	 System.out.println("the value is m:" +m);
            	 {
            		 int a=54;
            		 int b=76;
            		 int c=a&b;
            		 System.out.println("****BITWISE AND OPEATOR****");
            	     System.out.println("the value is c:" +c);
            	     {
                       int d=a^b;
                       System.out.println("****BITWISE OR OPEATOR*****");
                       System.out.println("the value is d:" +d);
                       {
                    	   int Q=26;
                    	   Q=(26==Q)?1:0;
                    	   System.out.println("****TERNARY OPERATOR*****");
                    	   System.out.println("the value is Q:" +Q);
                    	   { 
                    		   int h;
                    		   System.out.println("***ASSIGNMENT OPERATOR ****");
                    		   System.out.println(h=6);
                    		   System.out.println(h=h+1);
                    		   System.out.println(h*=5);
                    		   System.out.println(h-=3);
                    	   }
                       }
            	     }
            	 }
             }
    	  }
	}
	}
}
                    		   
                    	   
                    	   
                       
             
            	 