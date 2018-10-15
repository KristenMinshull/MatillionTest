public class TaskOne {
	public static void main(String[] args) {
		String s1 = "D23W8MCCIZQOP9"; // First given string from scenario
		String s2 = "D236862CEZQOPS"; // Second given string from scenario
		compareStrings(s1,s2);
	}
	
	public static int compareStrings(String s1, String s2) {
		int count = 0;
		try {
			for (int i = 0; i < s1.length(); i++) { // loops until last char of first given string
				if (s1.charAt(i) != s2.charAt(i)) {
					count++; // adds one to count of mismatched characters
				}
			}
		} catch (StringIndexOutOfBoundsException e) { // catches Exception of case where String lengths don't match
			System.out.println("The given Strings have difference lengths");
		}
		return count; // return number of String character differences
	}

}
