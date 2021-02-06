public class Fibonacci {
//	static int fib(int n) {
//		if(n == 0 || n == 1)return n;
//		return fib(n - 1) + fib(n - 2);
//	}
	
	public static void main(String[] args) {
		for(int i = 1;i <= 7;i++) {
			for(int j = 1;j <= i;j++)System.out.print("*");
			System.out.print('\n');
			for(double y = 0.1;y <= 1.0; y += 0.1)System.out.println(y);
		}
	}
}
