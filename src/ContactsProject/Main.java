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


                    boolean nameExist = true;
                    while(nameExist) {
                        System.out.println("Enter Name to add, or type in 'back' to return to the main menu.");
                        String userName = myScanner.nextLine();


                        // if statement that checks for copies
                        if (ContactsFileCreation.getContactNameList().contains(userName)) {
                            nameExist = true;
                            System.out.println("That Name Already Exists!");
                            System.out.println("Try Again!");
                        } else if (userName.equalsIgnoreCase("") || userName.length() <= 1) {
                            System.out.println("Not a valid Name.");
                        } else if (userName.equalsIgnoreCase("back")) {
                            System.out.println("Returning to main menu...");
                            nameExist = false;
                        } else {
                            boolean numValid = true;
                            while(numValid) {
                                System.out.println("Enter phone number for " + userName + ": ");
                                String userNum = myScanner.nextLine();
                                if (userNum.length() == 7 || userNum.length() == 10 || userNum.length() == 11) {
                                    AddNew.addContact(userName, userNum);
                                    System.out.println("You Have added '" + userName + "' with a phone number of '" + userNum + "'.");
                                    numValid = false;
                                    nameExist = false;
                                } else {
                                    System.out.println("Invalid Number.");
                                    System.out.println("Enter in a number either 7, 10, or 11 numbers long. (no symbols)");
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    //search contacts
                    System.out.println("Searching Contact");
                    String search = searchScanner.nextLine();
                    NameSearch.searchContact(search);
                    break;
                case 4:
                    //delete method
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
    }
}
