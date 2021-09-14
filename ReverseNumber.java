package second;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to reverse :");
		int number = scanner.nextInt();
		int sum = 0;
		int remain = 0;
		while(number != 0) {
		remain = number%10;
		sum = (sum * 10) + remain;
		number = number/10;
		}
		System.out.println("Reverse Number is : " + sum);
		scanner.close();

	}

}
