package tryReadFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
	

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\charl\\eclipse-workspace\\testeJava\\arquivos\\numbers";
		
		try {
		      File myObj = new File(filePath);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
