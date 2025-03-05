import java.util.*;
class RemainderQuotient{
	
	// Method to find remainder and quotient and returning an array
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int remainder = number%divisor;
		int quotient = number/divisor;
		return new int[]{remainder, quotient};
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.print("Enter the divisor: ");
		int divisor = sc.nextInt();
		
		
		//Calling the method and displaying answer
		int[] result = findRemainderAndQuotient(number, divisor);
		
		System.out.print("The remainder and quotient is "+result[0]+" & "+result[1]);
	}
}