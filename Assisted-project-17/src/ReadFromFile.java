import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile {

	public static void main(String[] args) {
		File obj=new File("D:\\Myfile.txt");
		try {
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
				System.out.println(data);
				}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error accurred.");
			e.printStackTrace();
		}
	}

}
