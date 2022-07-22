import java.io.File;

public class DeleteDemo {

	public static void main(String[] args) {
		File obj=new File("D:\\Myfile.txt");
		if(obj.delete()) {
			System.out.println(obj+" Got Deleted.");
		}
		else {
			System.out.println("File not deleted.");
		}
	}

}
