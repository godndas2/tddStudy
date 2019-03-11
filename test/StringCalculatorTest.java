import org.junit.Assert;

import junit.framework.TestCase;

public class StringCalculatorTest extends TestCase {
	
		private StringCalculator cal; // refactoring 을 위해 field로 빼준다. cal 마우스 오른쪽 - refactor - convert ..
		
		@Override
		protected void setUp() throws Exception {
			cal = new StringCalculator();
		}

		public void testSplit() throws Exception{
		
		String[] result = cal.split("1");
		Assert.assertArrayEquals(new String[] {"1"}, result); // 1만 있을 때
		
		result = cal.split("");
		Assert.assertArrayEquals(new String[] {""}, result); // 빈 값일 때

		result = cal.split(null);
		Assert.assertArrayEquals(new String[] {}, result); // null일 때 -> NPE 발생
	}

		public void testSplitWhenComma() throws Exception{
			
			String[] result = cal.split("1,2,3");
			Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
		}

		public void testSplitWhenNewLine() throws Exception{
			
//			StringCalculator cal = new StringCalculator();
			String[] result = cal.split("1\n2\n3");
			Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
		}

		public void testSplitWhenLineComma() throws Exception{
			
//			StringCalculator cal = new StringCalculator();
			String[] result = cal.split("1,2\n3");
			Assert.assertArrayEquals(new String[] {"1","2","3"}, result);
		}
		
		// String 문자열을 int로  
		public void testToInt() throws Exception{
			int[] result = cal.toInt(new String[] {"1","2"});
			Assert.assertArrayEquals(new int[]{1,2}, result);

			result = cal.toInt(new String[] {});
			Assert.assertArrayEquals(new int[]{}, result);
			
			result = cal.toInt(null);
			Assert.assertArrayEquals(new int[]{}, result); // NPE 발생
			
			
		}
}
