package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddNew extends Main{


    public static void addNewInfo() throws IOException {
        List<String> contactsNameList = ContactsFileCreation.getContactNameList();
        List<String> contactsNumberList = ContactsFileCreation.getContactNumberList();

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter Name to add: ");
        String userName = myScanner.nextLine();
        String userNameInput = userName;

        System.out.println("Enter phone number to add: ");
        String userNum = myScanner.nextLine();
        String userNumInput = userNum;

        contactsNameList.add(userName);
        contactsNumberList.add(userNum);





        Path filePath = Paths.get("./data", "contacts.txt");



//        Files.write(filePath, String.join(System.lineSeparator(), contactsNameList).getBytes());
//
//        Files.write(filePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//
//        Files.write(filePath, String.join(System.lineSeparator(), contactsNumberList).getBytes(), StandardOpenOption.APPEND);
//        Files.write(filePath, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
//
//
//        Files.write(filePath, contactsNameList);
//        Files.write(filePath, contactsNumberList, StandardOpenOption.APPEND);
//        System.out.println("Contact added successfully!");
    }

}
