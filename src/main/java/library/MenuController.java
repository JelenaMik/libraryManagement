package library;

import javax.swing.*;
import java.util.Scanner;

public class MenuController {
    LibraryController libraryController = new LibraryController();



    Scanner scanner = new Scanner(System.in);

    public void start() {
        this.showOptions();
        this.handleUserChoice();
        start();

    }

    private void showOptions() {
        System.out.println(
                """
                    1. Add a book to library
                    2. List all the books in library
                    3. 
                    4. 
                    5. 
                    6. Exit
                    """

        );
    }
    private void handleUserChoice(){
        System.out.println("Choose an option: ");
        String userChoice = scanner.nextLine();
        switch (userChoice){
            case "1":
                libraryController.addBookToLibrary();
                break;
            case "2":
                libraryController.viewAllBooks();
                break;
            case "3":

                break;
            case "4":

                break;
            case "5":

                break;
            case "6":
                System.exit(0);
                break;

        }
    }


}
