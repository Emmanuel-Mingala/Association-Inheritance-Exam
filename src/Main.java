import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void displayMenu() {
		System.out.println("Choose an action:");
		System.out.println("1. Create a student");
		System.out.println("2. Create a staff");
		System.out.println("3. Create a book");
		System.out.println("4. Create an author");
		System.out.println("Choice: ");
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List<Student> studentRecord = new ArrayList<Student>();
		List<Staff> staffRecord = new ArrayList<Staff>();
		List<Book> books = new ArrayList<Book>();
		List<Author> authors = new ArrayList<Author>();
		
		displayMenu();
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			createStudent(books);
			break;
		case 2:
			createStaff();
			break;
		case 3:
			createBook();
			break;
		case 4:
			createAuthor();
			break;
		default:
			System.out.println("Invalid input.");
		}
		

	}
	
	public static void createStudent(List<Book> books) {
		int option = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter address: ");
		String address = sc.nextLine();
		System.out.print("Enter program: ");
		String program = sc.nextLine();
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		System.out.print("Enter fee: ");
		double fee = sc.nextDouble();
		System.out.println("Choose book: ");
		if (!books.isEmpty()) {
			for (int i=0; i<books.size(); i++) {
				System.out.println((i+1) + ". "+ books.get(i));
			}
			option = sc.nextInt();
		}
		else {
			System.out.println("No books");
			System.out.println("Create books first [OK]");
			sc.next();
			return;
		}
//		books.get(option-1);
		Student s = new Student(/*name, address, year, program, fee, books*/);
		
	}
	public static void createStaff() {
		
	}
	public static void createBook() {
		
	}
	public static void createAuthor() {
		
	}

}
