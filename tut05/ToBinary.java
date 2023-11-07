package tut05;

public class ToBinary {
	public static void main(String[] args) {
		System.out.println(dec2Bin(75));
		decToBin(75);
	}

	public static String dec2Bin(int num) {
		String result = "";
		while (num != 0) {
			if (num % 2 == 0) {
				result = 0 + result;
			} else {
				result = 1 + result;
			}
			num /= 2;
		}
		return result;
	}

	// recursive method
	private static void decToBin(int n) {
		// divide until number reduces to 0
		if (n > 0) {
			decToBin(n / 2); // recursive call with quotient
			System.out.print(n % 2); // print remainder
		}
	}
}
