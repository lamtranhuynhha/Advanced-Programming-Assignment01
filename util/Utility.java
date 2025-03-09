public class Utility {

	/**
	 * Test whether a specific number is a prime number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a prime number.
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Test whether a specific number is a square number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a square number.
	 */
	public static boolean isSquare(int num) {
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}


	public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == number || number == 0;
    }

    public static int getFibonacciIndex(int number) {
		if (number == 0) return 0;
		if (number == 1) return 1;
		int a = 0, b = 1, index = 1;
		while (b < number) {
			int temp = b;
			b = a + b;
			a = temp;
			index++;
		}
		return b == number ? index : -1;
	}
}
