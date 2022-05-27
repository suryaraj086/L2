
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
import java.util.Scanner;

public class Pairs {

	public boolean countDifferencePairs(int[] arr, int val) {
		// List<String> list = new ArrayList<String>();
		// Map<Integer, Integer> map = new HashMap<>();
		// String out = "";
		for (int i = 0; i < arr.length; i++) {
			int temp = Math.abs(val - arr[i]);
			if (contains(arr, temp)) {
				return true;
			}
		}
		return false;
	}

	public boolean contains(int[] arr, int val) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pairs pObj = new Pairs();
		System.out.println("Enter the length");
		int length = scan.nextInt();
		int[] arr = new int[length];
		for (int i = 0; i < length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the value");
		int val = scan.nextInt();
		System.out.println(pObj.countDifferencePairs(arr, val));
		scan.close();
	}

}
