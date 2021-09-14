package second;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public int Code() {
		Random rand = new Random();
		int number = rand.nextInt(999999);
		return number;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CouponNumber obj = new CouponNumber();
		
		System.out.println("Enter number of coupon : ");
		int coupon = sc.nextInt();
		for(int i = 1; i <= coupon; i++) {
			int check = obj.Code();
		  if(check != obj.Code()) {
			System.out.println(i +".Code for coupon :" + obj.Code() );
			
		  }
			
		}
		sc.close();
	}

}
