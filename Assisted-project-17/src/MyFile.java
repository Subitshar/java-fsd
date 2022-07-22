import java.io.File;
import java.io.IOException;

public class MyFile {
	public static void main(String args[]) {
		File obj=new File ("D:\\Myfile.txt");
		try {
			if(obj.createNewFile()) {
				System.out.println("File created "+obj.getName());
			}
			else {
				System.out.println("File already Exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}
}
