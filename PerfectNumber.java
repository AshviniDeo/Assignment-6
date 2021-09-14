package second;

import java.util.Scanner;

public class PerfectNumber {
	public void check(int n) {
		int counter = 0;
		System.out.println(n + " Divisor are :");
		for(int i = 1; i<n; i++) {
			if(n%i == 0) {
				System.out.print(i + "+");
				counter += i;
			}
			
			
		}
		System.out.println();
		
		if(counter == n) {
			System.out.println(n + " is Perfect number.");
			
		}else {
			System.out.println(n + " is not a perfect number");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PerfectNumber obj = new PerfectNumber();
		System.out.println("Enter number to check Perfect number :");
		int number = scanner.nextInt();
		obj.check(number);
		scanner.close();
	}

}
