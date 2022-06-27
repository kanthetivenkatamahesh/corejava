package demo;

public class primitivedatatypes {
     //INTEGER\\
	public static void main(String[] args) {
		System.out.println("......INTEGER.....");
    int a =10;
    int b =34;
    int c =a+b;
    System.out.println(c);
    {
     int value1=56;
     float value2=5.5f;
     double value3=9d/6d;
         System.out.println("@@@@@@ FLOAT @@@@@@");
     System.out.println("value 1 =" +value1);
     System.out.println("value 2 =" +value2);
     System.out.println("value 3 =" +value3);
     {
	   boolean var=true;
	   System.out.println("******BOOLEAN******");
	   System.out.println("value is var:" +var);
	   {
		  char var1= 1234;
		   System.out.println("var");
		   {
	            String var2=new String("i love basketball");
	            System.out.println("****STRING*****");
	            System.out.println("print var2:" +var2);
		   }
	      }
         }      
       }     
     }
   }