import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws {

			public static void main(String[] args) throws FileNotFoundException {
				
				Throws obj = new Throws();
				obj.readFromFile();

			}

			void readFromFile() throws FileNotFoundException {
				FileInputStream fis = new FileInputStream("c:\\temp\\tes.txt");
			}

		

}
