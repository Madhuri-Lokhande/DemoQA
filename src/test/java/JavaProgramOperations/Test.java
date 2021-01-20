package JavaProgramOperations;

public class Test {

	public static void main(String[] args) {
		try {
			int a = divide(4, 2);
			System.out.println(a);
			int b = divide(4, 0);
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("error 1");
		}

	}

	public static int divide(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch (Exception e) {
			System.out.println("error 2");
		}

		return result;
	}
}
