package sacnner_pkg;

import java.util.Scanner;

public class Calculator2 {

	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the details..");
		Calculator1 obj = new Calculator1();
		Scanner r = new Scanner(System.in);
		int x1 = r.nextInt();
		int x2 = r.nextInt();
		int x3 = r.nextInt();
		int x4 = r.nextInt();
		int x5 = r.nextInt();
		int x6 = r.nextInt();
		
		int mul = obj.mul(x1, x2);
		int sub = obj.sub(mul, x3);
		int sum = obj.sum(sub, x4);
		int sub2 = obj.sub(sum, x5);
		int div = obj.divide(sub2, x6);
		
		System.out.println("Final result is : " + div);
	}
	
}
