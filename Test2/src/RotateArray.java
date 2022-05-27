import java.util.Scanner;

public class RotateArray {

	public int rotate(int[] arr, int n) throws Exception {
		if (n == 0) {
			throw new Exception("Enter a valid number");
		}
		for (int j = 0; j < n; j++) {
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			System.out.print("Before " + arr[0]);
			arr[0] = temp;
			System.out.println("After " + arr[0]);
		}
		return arr[0];
	}

	public static void main(String[] args) {
		RotateArray obj = new RotateArray();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = scan.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value");
		int val = scan.nextInt();
		try {
			System.out.println("The first element is " + obj.rotate(arr, val));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}

}
