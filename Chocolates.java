import java.util.*;
class Chocolates{
	
	// Method to find remainder and quotient and returning an array
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int remainder = number%divisor;
		int quotient = number/divisor;
		return new int[]{remainder, quotient};
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of chocolates: ");
		int chocolates = sc.nextInt();
		System.out.print("Enter the number of children: ");
		int children = sc.nextInt();
		
		
		//Calling the method and displaying answer
		int[] result = findRemainderAndQuotient(chocolates, children);
		
		System.out.print("The number of chocolates each child will get and remaining is "+result[0]+" & "+result[1]);
	}
}