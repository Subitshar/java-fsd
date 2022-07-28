import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n********************************************************\n");
		System.out.println("\tWelcome to Virtual Repository");
		System.out.println("\t               -Developed by SUBITSHA R \n");
		System.out.println("*********************************************************");
		optionsSelection();
	}

	private static void optionsSelection() {
		String[] arr = { "\n1. Retrieving the file names in ascending order", "2. Business level operations",
				"3. Option to close the application" };

		int arr1[] = { 1, 2, 3 };
		int len = arr1.length;
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}

		List<String> Myfolder = new LinkedList<>();
		Myfolder.add(toLower("SUBi.txt"));
		Myfolder.add(toLower("SuBa.dox"));
		System.out.println("\nEnter the Choice \t");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		for (int i = 1; i <= len; i++) {
			if (choice == i) {
				switch (choice) {
				case 1:
					System.out.println("\nThe files are sorted by ascending order ");
					sortFile(Myfolder);
					optionsSelection();
					break;
				case 2:
					Subquary(Myfolder);
					break;
				case 3:
					closeapp();
					break;

				default:
					System.out.println("You have made an invalid choice!");
					break;

				}
			}
		}
	}

	private static void closeapp() {
		System.out.println("Application closed successfully........Thank you!!");
	}

	private static String toLower(String string) {
		string = string.toLowerCase();
		return string;
	}

	private static void sortFile(List<String> myfolder) {
		Collections.sort(myfolder);
		System.out.println(myfolder);
	}

	private static void Subquary(List<String> myfolder) {
		String subarr[] = { "\n1. Add a file to the existing directory list",
				"2. Delete a user specified file from the existing directory list",
				"3. Search a user specified file from the main directory",
				"4. Option to navigate back to the main context" };
		for (int j = 0; j < 4; j++) {
			System.out.println(subarr[j]);
		}
		int c, n;
		System.out.println("\nEnter the sub choice value:");
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		boolean value;
		String file;
		for (int i = 1; i <= 4; i++) {
			if (c == i) {
				switch (c) {
				case 1:
					System.out.println("Enter the number of file you want add");
					n = sc.nextInt();
					for (int k = 0; k < n; k++) {
						System.out.println("Enter the file name to add the directory");
						file = sc.next();
						myfolder.add(toLower(file));
					}
					System.out.println("\nAfter enter the file the folder contain :\n" + myfolder);
					Subquary(myfolder);
					break;
				case 2:
					System.out.println("\nEnter the file name want to delete:");
					file = sc.next();
					value = myfolder.remove(toLower(file));
					if (value) {
						System.out.println("\nThe file deleted successfully");
						System.out.println("\nAfter delete the file the folder contain :\n" + myfolder);
					} else {
						System.out.println("\nThe file not found");
					}
					Subquary(myfolder);
					break;
				case 3:
					System.out.println("\nEnter the file to want to search:");
					file = sc.next();
					value = myfolder.contains(toLower(file));
					if (value) {
						System.out.println("\nThe file is found.");
					} else {
						System.out.println("\nThe file not founded.");
					}
					Subquary(myfolder);
					break;
				case 4:
					optionsSelection();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					break;
				}
			}

		}
	}
}
