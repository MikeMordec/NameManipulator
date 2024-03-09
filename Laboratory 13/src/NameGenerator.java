import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameGenerator {
	public static void main(String[] args) {
		String[] peoples = { "Bob", "Carol", "Ted", "Alice", "Mike", "Jason","Bob", "Steve", "Amanda", "Danielle", "Elizabeth", "Sam", "Howard", "Paige", "Robert" };
		List<String> names = Arrays.asList(peoples);
		
		FileWriter fw;
		try {
			fw = new FileWriter("names.dat", true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i=0; i<10; i++)
			{
				Collections.shuffle(names);
				for (String name : names) 
				{
					bw.write(name + " ");
				}
				bw.write("\n");
			}
			
			bw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}