package ContactsProject;

import java.util.List;
import java.util.Scanner;

public class AddNew extends Main{
    List<String> contactsNameList = ContactsFileCreation.getContactNameList();
    List<String> contactsNumberList = ContactsFileCreation.getContactNumberList();


    System.out.println("Enter name/number");
    Scanner myScanner = new Scanner(System.in);
    String user = myScanner.nextLine();


    contactsNameList.add(user);
    user = myScanner.nextLine();
    contactsNumberList.add(user);


}
