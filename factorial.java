// A recursive definition of factorial
// Author: Sean Foo

class factorial {
	
	private static int fact(int i) {
		if (i == 0 || i == 1) {
			return 1;
		}
		return i * fact(i-1);
	}
	
	public static void main(String args[]) {
		System.out.println("fact(1): " + fact(1));
		System.out.println("fact(2): " + fact(2));
		System.out.println("fact(3): " + fact(3));
		System.out.println("fact(4): " + fact(4));
		System.out.println("fact(5): " + fact(5));
	}
	
}
