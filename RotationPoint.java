
public class RotationPoint {
	public static int findRotationIndex(String[] dictionary) {
		final String firstWord = dictionary[0];
		
		int floorIndex = 0;
		int ceilingIndex = dictionary.length - 1;
		
		while (floorIndex < ceilingIndex) {
			int guessIndex = floorIndex + ((ceilingIndex - floorIndex)/2);
			
			if (dictionary[guessIndex].compareTo(firstWord) >= 0) {
				floorIndex = guessIndex;
			} else {
				ceilingIndex = guessIndex;
				}
			if (floorIndex + 1 == ceilingIndex) {
				break;
			}
		}
		return ceilingIndex;
	}
	
	public static void main(String[] args) {
		String[] words = new String[] {
				    "ptolemaic",
				    "retrograde",
				    "supplant",
				    "undulate",
				    "xenoepist",
				    "asymptote",  // <-- rotates here!
				    "babka",
				    "banoffee",
				    "engender",
				    "karpatka",
				    "othellolagkage",
				};
		int rotationPoint = findRotationIndex(words);
		System.out.println("Rotation point of the input dictionary is " +rotationPoint);
	}
}
