/**
 * 
 */
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Task1 exp1 = new Task1();
		//System.out.println(exp1.circle(100, 15));
		int n;
		int m;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите n и m:");
		n = in.nextInt();
		m = in.nextInt();
		//System.out.println("n = " + n);
		//System.out.println("m = " + m);
		System.out.println(exp1.circle(n, m));
		}
	
	public String circle (int n, int m) {
		String result = "";
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = i + 1;
		}
		/*for (int i : arr) {
			System.out.print(i);
		}
		System.out.println("");*/
		int i = 0;
		while (true) {
			result += arr[i];
			//System.out.println("i = " + i);
			//System.out.println(result);
			if (i + m - 1 < n) {
				i += (m - 1);
			}
			else {
				i = m + i - n - 1;
			}
			if (arr[i] == arr[0]) {
				break;
			}
		}
		return result;
	}
 
}