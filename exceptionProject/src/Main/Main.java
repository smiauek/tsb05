package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws CustomExceptionFile {
		
		// Checked exception
//		FileNotFoundException
		File myFile = new File("text.txt");		
		try {
			FileReader fr = new FileReader(myFile);
			
			int[] num = {1,2,3,4};
			System.out.println(num[1]);
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		} finally {
			System.out.println("Everything works");
		}

		
		
		
	}

}
