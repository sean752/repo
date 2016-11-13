// A recursive definition of factorial
// Author: Sean Foo

class Factorial {
	
	private static int factorial(int i) {
		if (i == 0 || i == 1) {
			return 1;
		}
		return i * factorial(i-1);
	}
	
	public static void main(String args[]) {
		System.out.println("factorial(1): " + factorial(1));
		System.out.println("factorial(2): " + factorial(2));
		System.out.println("factorial(3): " + factorial(3));
		System.out.println("factorial(4): " + factorial(4));
		System.out.println("factorial(5): " + factorial(5));
	}
	
}
