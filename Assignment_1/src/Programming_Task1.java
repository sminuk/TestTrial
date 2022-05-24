
public class Programming_Task1 {
	 static int herdDivisors(int sheep)
	    {
	        int count =(sheep>0)?1:0;/*to include the given number as given number will be always its divisor
	                                  Also if given number is 0 ,output will be 0*/
	      
	        for(int i = 1; i<=sheep/2; i++) {  //reduces number of loops checks as sheep/2 is used
            if(sheep % i == 0) { //if remainder is 0 means number is fully divisible by i
              count++;
            }
	        }
	        System.out.println("Theno.of possibilities to divide herd ");
	      return count;
	    }
	
	public static void main(String[] args) {		
		java.util.Scanner scan = new java.util.Scanner(System.in);
	    System.out.println("Please enter the the amount of sheep that are currently in the herd");
     int sheep = scan.nextInt();
     
		System.out.println(herdDivisors(sheep));
	}
}
