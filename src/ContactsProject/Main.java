package ContactsProject;


import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ContactsFileCreation.ContactsFileCreate();
        List<String> contactsNameList = ContactsFileCreation.getContactNameList();
        ShowAll.showAllContacts();

        //Input input = new Input();
        Scanner myScanner = new Scanner(System.in);
        String user = myScanner.nextLine();

        contactsNameList.add(user);

        System.out.println(contactsNameList);
        //nameSearch method

        //addNew method
//        Input userInput = new Input();
//        List<String> contactsNameListTwo = Arrays.asList(userInput);
//        List<String> contactsNumberListTwo = Arrays.asList(userInput);
//        Files.write(
//                Paths.get("./data", "contacts.text"),
//                Arrays.asList(contactsNameListTwo)
//        )




        //showAll method

        //deleteContact method
    }
}
