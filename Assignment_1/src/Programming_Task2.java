
public class Programming_Task2 {
	     static String getColourByID(int ID)
		    {
		        System.out.println("The sheep's fur colour is ");
		        if(isDivisibleThree(ID)){
	              return  "black";
		        }else if(isDivisibleFive(ID)){
	               return "brown";
	            }else if(isPrime(ID)){
	                  return "lucky";
	            }else {
	                return "white";
	            }
		    
		    }
		    static boolean isPrime(int num){
		        int i,flag=0;
	            for(i=2;i<=num/2;i++)    
	            {    
	               if(num%i==0)    
	               {
	                 flag=1;    
	                 break;    
	                }    
	            }    
	           return (((flag==0)&&(num!=1)) ?true :false);
		    }
		    
		    static boolean isDivisibleThree(int num){
	            return ((num%3 == 0) ?true :false);
		    }
		    static boolean isDivisibleFive(int num){
	            return ((num%5 == 0) ?true :false);
		    }
	   public static void main(String[] args) {		
			java.util.Scanner scan = new java.util.Scanner(System.in);
			System.out.println("Please enter the ID of a sheep");
	        int ID = scan.nextInt();
	        
			System.out.println(getColourByID(ID));
		}
	
}
