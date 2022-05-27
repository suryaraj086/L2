import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {

	public int maxSum(int[] arr) {
		Arrays.sort(arr);
		String out = "";
		int sum = 0, msum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			msum = Math.max(msum, sum);
			if (sum < 0) {
				sum = 0;
			}
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				out += arr[j];
				System.out.println("combinations are " + out);
			}
//			System.out.println("combinations are " + out);
			out = "";
		}
		System.out.println(out);
		return msum;
	}

	public static void main(String[] args) {
		MaxSum mObj = new MaxSum();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length");
		int length = scan.nextInt();
		System.out.println("Enter the elements");
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The output is " + mObj.maxSum(arr));
		scan.close();
	}

}
