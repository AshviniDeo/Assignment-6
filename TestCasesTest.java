import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

@SuppressWarnings({ "unused" })
public class TestCasesTest extends Test {

	@org.junit.Test
	public void testConversion() {
		int temperature = Test.Conversion(96,2);
		Assert.assertEquals(35, temperature);
	}
   @org.junit.Test
   public void testMonthlyPayment() {
	   int payment = Test.MonthlyPayment(5000, 5,12 );
	   Assert.assertEquals(8235, payment);
   }
   

@org.junit.Test
public void testDayofWeek() {
	   int day = Test.DayOfWeek(27, 7,1995);
	   Assert.assertEquals(4, day);
}

@org.junit.Test
public void testDecToBinary() {
	TestCasesTest obj = new TestCasesTest();
	Test.DecToBinary(17);     
	Assert.assertTrue(true);
}
}
