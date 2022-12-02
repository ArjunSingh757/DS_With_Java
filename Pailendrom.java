class Pailen {
	public int pail(int n) {
		
		int sum = 0;
		while (n != 0) {
			int n1 = n % 10;
			sum = sum * 10 + n1;

			n = n / 10;
		}

		return sum;
	}
}

public class Pailendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pailen po = new Pailen();
		int num=151;
		int res = po.pail(num);
		if(num==res) {
			System.out.println("Pailendrome");
		}else {
			System.out.println("Not Pailendrome");
		}
		
		System.out.println(10 % 2 + " " + 10 / 2);

	}

}
