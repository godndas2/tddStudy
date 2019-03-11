
public class StringCalculator {

	public String[] split(String text) {
		
		// Null 처리
		if (text == null) {
			return new String[]{};
		} 
		
		return text.split(",|\n");
	}

	public int[] toInt(String[] val) {
		
		if (val == null) {
			return new int[]{};
		}
		
		int[] nums = new int[val.length];
		for (int i = 0; i < val.length; i++) {
			nums[i] = Integer.parseInt(val[i]);
		}
		return nums;
	}

}
