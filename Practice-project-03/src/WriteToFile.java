import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter obj=new FileWriter("C:\\\\javaSL\\\\java-fsd\\\\Practice-project-03\\\\src\\\\Myfile1.txt");
			obj.write("Hello world....Welcome to Java programming......Hii how are you?");
			obj.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

}
