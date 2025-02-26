package tryReadFilesBufferedReaderAndFilesReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileP {

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\charl\\eclipse-workspace\\testeJava\\arquivos\\poem";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("Could not locate file");
		}catch (IOException e) {
			System.out.println("Something went wrong");
		}
	}

}
