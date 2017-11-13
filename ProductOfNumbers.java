
public class ProductOfNumbers {
	public static int[] arrayProduct(int[] input) {
		int product;
		int[] result = new int[input.length];
		
		for (int i=0; i < input.length; i++) {
			product = 1;
			for (int j=0; j < input.length; j++) {
				if (i != j) {
					product *= input[j];
				}
			}
			result[i] = product;
		}
		return result;
	}
	
	public static int[] arrayProductN(int[] input) {
		if (input.length < 2) {
			throw new IllegalArgumentException("Array length should be atleast 2");
		}
		
		int[] productForward = new int[input.length];
		int[] productBackward = new int[input.length];
		
		int product = 1;
		for (int i=0; i < input.length; i++) {
			productForward[i] = product;
			product *= input[i]; 
		}
		
		product = 1;
		for (int j=input.length-1; j >= 0; j--) {
			productBackward[j] = product * productForward[j];
			product *= input[j];
		}
		return productBackward;
	}
	
	public static void main(String args[]) {
		int[] input = {1, 7, 3, 4};
		int[] input1 = {1,2,3};
		int[] output = arrayProduct(input);
		int[] output1 = arrayProductN(input1);
		
		for (int i=0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		
		System.out.println();
		
		for (int i=0; i < output1.length; i++) {
			System.out.println(output1[i]);
		}
	}
}
