
public class ReverseWords {
	public static String reverseWord(String word) {
		char[] input = word.toCharArray();
		reverseChars(input, 0, input.length - 1);
		
		int startIndex = 0;
		for (int i=0; i <= input.length; i++) {
			if (i == input.length || input[i] == ' ') {
				reverseChars(input, startIndex, i - 1);
				startIndex = i + 1;
			}
		}
		return new String(input);
	}
	
	public static void reverseChars(char[] input, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			char temp = input[startIndex];
			input[startIndex] = input[endIndex];
			input[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	
	public static void main(String args[]) {
		String word = "Satish Varma is awesome coder";
		String result = reverseWord(word);
		
		for (int i=0; i < result.length(); i++) {
			System.out.print(result.charAt(i));
		}
	}
}