import java.io.File;
import java.io.IOException;

public class MyFile1Create {
	public static void main(String args[]) {
		File obj=new File ("C:\\\\javaSL\\\\java-fsd\\\\Practice-project-03\\\\src\\\\Myfile1.txt");
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