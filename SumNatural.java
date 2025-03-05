import java.util.*;
class SumNatural{
	public static int sum(int number){
		int add = 0;
		for(int i=1;i<=number;i++){
			add += i;
		}
		
		return add;
	}

	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.print("The sum is "+sum(number));
	}
}