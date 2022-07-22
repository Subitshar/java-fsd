
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

	public static void main(String[] args) {
		BufferedWriter b=null;
		String append="\nThe world is Beautiful";
				try {
					b=new BufferedWriter(new FileWriter(new File("C:\\\\javaSL\\\\java-fsd\\\\Practice-project-03\\\\src\\\\Myfile1.txt"),true));
					b.write(append);
					System.out.println("The file append Successfully.");
					b.close();
				}
				catch(FileNotFoundException e) {
					System.out.println("The file not found");
				}
				catch (IOException e) {
					System.out.println("An error accured");
					e.printStackTrace();
				}
		}
}
