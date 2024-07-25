package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetLibrary {

	public static void main(String[] args) {
		TreeSet<String> library = new TreeSet();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("--Library Management System----");
			System.out.println("1. Add a book");
			System.out.println("2. remove a book");
			System.out.println("3. Check if a book exists of not");
			System.out.println("4. Display all books");
			System.out.println("5. to exit");

			System.out.println("Please enter your choice.");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: {
				System.out.println("Enter book name to add.");

				String bookToAdd = sc.nextLine();

				library.add(bookToAdd);
				System.out.println("book has been added to library");
				break;
			}

			case 2: {
				System.out.println("Enter a book name to remove");
				String bookToRemove = sc.nextLine();

				if (library.remove(bookToRemove)) {
					System.out.println(bookToRemove + " has been removed successfully");
					break;
				} else {
					System.out.println("not found in library");
				}
			}
			case 3: {
				System.out.println("Please enter the book name you want to search");
				String SearchBook = sc.nextLine();
				if (library.contains(SearchBook)) {
					System.out.println("Book available");
				} else {
					System.out.println("Book is unavailable");
				}

			}
			case 4: {
				System.out.println(library);
			}
			case 5: {
				System.out.println("out of loop");
				break;
			}

			}
			break;
		}

	}
}
