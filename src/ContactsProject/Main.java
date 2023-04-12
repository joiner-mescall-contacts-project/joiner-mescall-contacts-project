package ContactsProject;


import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //creates FILE and PATH
        ContactsFileCreation.ContactsFileCreate();







        Scanner myScanner = new Scanner(System.in);
        Scanner searchScanner = new Scanner(System.in);
        Scanner deleteScanner = new Scanner(System.in);

        //menu


        int menuNum = 0;
        while (menuNum != 5) {
            System.out.printf("%nEnter an option (1, 2, 3, 4 or 5): %n1. Show All Contacts%n2. Add new contact%n3. Search for a Contact%n4. Delete a contact%n5. Close Menu%n");

            menuNum = myScanner.nextInt();

            switch (menuNum) {
                case 1:
                    // Show ALL Contacts
                    System.out.println("Showing All Contacts");
                    ShowAll.showAllContacts();
                    break;
                case 2:
                    // ADD new Contact
                    System.out.println("Adding New Contact");

                    myScanner.nextLine();

                    System.out.println("Enter Name to add: ");
                    String userName = myScanner.nextLine();


                    System.out.println("Enter phone number to add: ");
                    String userNum = myScanner.nextLine();

                    AddNew.addContact(userName, userNum);
                    break;
                case 3:
                    System.out.println("Searching Contact");
                    String search = searchScanner.nextLine();
                    NameSearch.searchContact(search);
                    break;
                case 4:
                    System.out.println("Deleting Contact");
                    String deleteInput = deleteScanner.nextLine();
                    DeleteContact.deleteContact(deleteInput);

                    break;
                case 5:
                    System.out.println("Thank You...GoodBye!");
                    break;
                default:
                    System.out.println("This was not a valid input. Try Again!");
                    break;
            }

        }



        int day = 4;
        switch (day) {
            case 1:
                System.out.println("");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                break;
            case 6:
                System.out.println("");
                break;

        }
// Outputs "Thursday" (day 4)
    }
}
