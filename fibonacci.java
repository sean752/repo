// A recursive definition of fibonacci
// Author: Sean Foo

class fibonacci {
	
	private static int fib(int i) {
		if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    return 1;
		}
		return fib(i-1) + fib(i-2);
	}
	
	public static void main(String args[]) {
		System.out.println("fib(1): " + fib(1));
		System.out.println("fib(2): " + fib(2));
		System.out.println("fib(3): " + fib(3));
		System.out.println("fib(4): " + fib(4));
		System.out.println("fib(5): " + fib(5));
		System.out.println("fib(6): " + fib(6));
		System.out.println("fib(7): " + fib(7));
		System.out.println("fib(8): " + fib(8));
		System.out.println("fib(9): " + fib(9));
		System.out.println("fib(10): " + fib(10));
	}
	
}
