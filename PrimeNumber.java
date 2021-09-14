package second;

import java.util.Scanner;

public class PrimeNumber {
	public void check(int n) {
		int counter = 0;
		for (int i = 2; i<n;i++) {
			if(n%i == 0 ) {
				counter += 1;
			}
		}
		if(counter > 0) {
			System.out.println(n + " is not a Prime Number");
		}else {
			System.out.println(n + " is a Prime Number");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber();
		System.out.println("Enter number to check Prime or not :");
		int number = scanner.nextInt();
		obj.check(number);
		scanner.close();
		
	}

}
