
public class Test {
	public static int Conversion(int temperature,int choice) {
		switch (choice) {
		case 1:
			temperature = (temperature * 9/5) + 32;
			break;
		case 2:
			temperature = (temperature - 32) * 5/9;
			break;
		}
		return temperature;
	}
	public static int MonthlyPayment(int principal,int rate,int year) {
		int n = 12 * year; 
		int r = rate/(12 * 100);
		int payment = (principal + r) /1 +(int)Math.pow(n,(r/n));
		return payment;

	}
	public static int DayOfWeek(int day, int month , int year) {
		int y = year-(14-month)/12;
		int x = y+y/4-y/100+y/400;
		int m = month + 12 *((14-month)/12)-2;
		int d = (day + x + 31*m /12)%7;

		return d;
	}

	public static void DecToBinary(int n)
	{

		int[] binaryNum = new int[1000];


		int i = 0;
		while (n > 0) 
		{

			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}


		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNum[j]);
		}
	
	}
 

}