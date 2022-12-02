class Fib {
	int a = 0, b = 1, c;
	public void fib(int n) {
		System.out.print(a);
		System.out.print(" " + b);
		for (int i = 0; i < n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}
	}
}
interface FibL{
	public abstract void fib(int n);
}
public class FibnocciSeries {
	public static void main(String[] args) {
		Fib obj = new Fib();
		obj.fib(4);
		//FibnocciSeries fo=new FibL();
		FibL fo1=(int n)->{
			int a = 0, b = 1, c;		
			System.out.print(a);
			System.out.print(" " + b);
			for (int i = 0; i < n; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;
			}
		};
		System.out.println("By Lambda Expression");
		fo1.fib(5);
	}
}
