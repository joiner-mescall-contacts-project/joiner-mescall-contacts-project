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


        // ADD new Contact
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Name to add: ");
        String userName = myScanner.nextLine();

        System.out.println("Enter phone number to add: ");
        String userNum = myScanner.nextLine();

        AddNew.addContact(userName, userNum);


        // Show ALL Contacts
        ShowAll.showAllContacts();

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
