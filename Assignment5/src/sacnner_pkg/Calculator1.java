package sacnner_pkg;
//testing
import java.util.Scanner;

public class Calculator1 {
	
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
		
		int sum1 = obj.sum(x1, x2);
		int sum2 = obj.sum(sum1, x3);
		int sub = obj.sub(sum2, x4);
		int divison = obj.divide(sub, x5);
		int mul = obj.mul(divison, x6);
		
		System.out.println("Final result is : " + mul);
	}

}
