
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main exp1 = new Main();
		int n;
		int m;
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите n и m:");
		n = in.nextInt();
		m = in.nextInt();
		System.out.println(exp1.circle(n, m));
		}
	
	public String circle (int n, int m) {
		String result = "";
		int[] arr = new int[n];
		for (int i = 0; i < n; i ++) {
			arr[i] = i + 1;
		}
		int i = 0;
		while (true) {
			result += arr[i];
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