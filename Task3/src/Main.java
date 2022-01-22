import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.*;

public class Main {

	public static void main(String[] args) throws Exception {
		FileReader fr1 = new FileReader(args[0]);
		FileReader fr2 = new FileReader(args[1]);
		Gson gson = new Gson();
		Result result1 = gson.fromJson(fr1, Result.class);
		Values result2 = gson.fromJson(fr2, Values.class);
		result1.merdge(result2);
		FileWriter writer = new FileWriter(args[0].substring(args[0].lastIndexOf("\\")) + "report.json");
		gson.toJson(result1, writer);
		fr1.close();
		fr2.close();
		writer.close();
	}
	
}



