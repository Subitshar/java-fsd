import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("D:\\Myfile.txt");
			obj.write("Hello wold....Welcome to Java programming......");
			obj.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
