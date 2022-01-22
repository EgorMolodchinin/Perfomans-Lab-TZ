import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Main m = new Main();
		System.out.println(m.howMuchToEqul(args[0]));
	}

	public int howMuchToEqul (String file) throws Exception {
		ArrayList <Integer> nums = new ArrayList<Integer>();	
		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner(fr);
		float aver = 0;
		int temp = 0;
		int result = 0;
		while (scan.hasNextLine()) {
			temp = scan.nextInt();
			nums.add(temp);
			aver += temp;
		}
		aver = Math.round(aver/nums.size());
		for (int i = 0; i < nums.size(); i++) {
			result += Math.abs(nums.get(i) - aver);
		}
		fr.close();
		scan.close();
		return result;
	}
}
