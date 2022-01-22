
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.isInCircle(args[0],args[1]);
	}
	
	public void isInCircle (String f1, String f2) throws Exception  {
		FileReader fr1 = new FileReader(f1);
		Scanner scan1 = new Scanner(fr1);
		FileReader fr2 = new FileReader(f2);
		Scanner scan2 = new Scanner(fr2);
		float x0;
		float y0;
		float x1;
		float y1;
		float r;
		float l;
		x0 = scan1.nextFloat();
		y0 = scan1.nextFloat();
		r = scan1.nextFloat();
		fr1.close();
		while(scan2.hasNextLine()) {
			x1 = scan2.nextFloat();
			y1 = scan2.nextFloat();
			l = (float) Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
			if (l == r) {
				System.out.println(0);
			}
			if (l < r) {
				System.out.println(1);
			}
			if (l > r) {
				System.out.println(2);
			}
		}
		fr1.close();
		fr2.close();
		scan1.close();
		scan2.close();
	}
}
