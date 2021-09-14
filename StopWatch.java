package second;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("StopWatch");
		double start = 0.0;
		double stop = 0.0;
		while(true) {
			System.out.println("Press : 1.Start,2.Stop,3.quit");
			int number = sc.nextInt();
			
			switch (number) {
			   case 1:
				 if(start == 0) {
					start = System.currentTimeMillis();
					break;
				 }else {
					 System.out.println("Already started..");
					 break;
				 }
				
			   case 2:
				     if(start != 0) {
				     stop = System.currentTimeMillis();
				     double elapsedTime = stop - start /1000.0;
						System.out.println("Elapsed Time is :" + elapsedTime);
				       start = 0.0; stop = 0.0;elapsedTime = 0.0;
				       break;
				     }else
				     {
				    	 System.out.println("First Start watch..");
				     }
						break;
				 
			   case 3:
				break;
				default:
					
			}
			
			
			
		}
		
		
	}

}
