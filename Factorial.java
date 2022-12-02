interface Fact {
	public abstract int fact(int n);
}

public class Factorial implements Fact {

	public static void main(String[] args) {
		/*
		 * Fact fo=(int n)->{ if(n==1 || n==0) return 1; else{ return n*(n)->{ (n-1); };
		 * } }; fo.fact(5);
		 * 
		 * }
		 */
		Fact fo = new Factorial();
		int res = fo.fact(5);
		System.out.println(res);
	}

	public int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * fact(n - 1);

	}
}
