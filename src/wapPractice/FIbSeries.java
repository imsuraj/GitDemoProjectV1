package wapPractice;

public class FIbSeries {

	
	static int a= 0, b = 1, c;
	public static void main(String[] args) {
		
		System.out.print(a+" "+b);
		FIbSeries fb = new FIbSeries();
		fb.printFiB(10);
		

	}
	
	
	void printFiB(int n) {
		
		if(n>1) {
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b=c;
			printFiB(n-1);
		}
		
		
	}

}
