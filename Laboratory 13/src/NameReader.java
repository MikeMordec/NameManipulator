import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class NameReader {

	public static void main(String[] args) {
		File file = new File("names.dat");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] names = line.split(" ");
				List<String> namesArray = Arrays.asList(names);
				for (String name : namesArray) {
					System.out.print(name + " ");
				}
				System.out.println();
				List<String> noDupsList = new ArrayList<String>(new HashSet<String>(namesArray));
				Collections.sort(noDupsList);
				for (String name : noDupsList) {
					System.out.print(name + " ");
				}
				System.out.println();
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}

}
