import java.util.*;
class SmallestLargest{
	
	//Method finding which one of them is largest adn smallest and returning array
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = number1;
		int largest = number1;
		
		if(number2<smallest){
			smallest = number2;
		}
		else if(number3<smallest){
			smallest = number3;
		}
		
		if(number2>largest){
			largest = number2;
		}
		else if(number3>largest){
			largest = number3;
		}
		
		
		return new int[]{smallest, largest};
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = sc.nextInt();
		System.out.print("Enter second number: ");
		int second = sc.nextInt();
		System.out.print("Enter third number: ");
		int third = sc.nextInt();
		
		//Calling method and displaying reult
		int[] result = findSmallestAndLargest(first, second, third);
		System.out.println("The smallest among three is "+result[0]);
		System.out.println("The largest among three is "+result[1]);
		
	}
}