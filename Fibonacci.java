// A recursive definition of fibonacci
// Author: Sean Foo

class Fibonacci {
	
	private static int fibonacci(int i) {
		if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    return 1;
		}
		return fibonacci(i-1) + fibonacci(i-2);
	}
	
	public static void main(String args[]) {
		System.out.println("fibonacci(1): " + fibonacci(1));
		System.out.println("fibonacci(2): " + fibonacci(2));
		System.out.println("fibonacci(3): " + fibonacci(3));
		System.out.println("fibonacci(4): " + fibonacci(4));
		System.out.println("fibonacci(5): " + fibonacci(5));
		System.out.println("fibonacci(6): " + fibonacci(6));
		System.out.println("fibonacci(7): " + fibonacci(7));
		System.out.println("fibonacci(8): " + fibonacci(8));
		System.out.println("fibonacci(9): " + fibonacci(9));
		System.out.println("fibonacci(10): " + fibonacci(10));
	}
	
}
