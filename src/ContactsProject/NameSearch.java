package ContactsProject;

import java.util.List;

public class NameSearch extends Main{

    public static void searchContact(String searchName) {
        boolean contactNameFound = false;
        for (int i = 0; i < ContactsFileCreation.getContactNameList().size(); i++) {
            if (ContactsFileCreation.getContactNameList().get(i).equalsIgnoreCase(searchName)) {
<<<<<<< HEAD
                System.out.printf("%n%s: %s%n", ContactsFileCreation.getContactNameList().get(i), ContactsFileCreation.getContactNumberList().get(i));
=======
                System.out.printf("Name | Phone Number%n-------------------");
                System.out.printf("%n%s | %s", ContactsFileCreation.getContactNameList().get(i), ContactsFileCreation.getContactNumberList().get(i));
>>>>>>> 48459ae2922ba8985ee508b60b188c521afd6a35
                contactNameFound = true;
            }
        }
        if (!contactNameFound) {
            System.out.printf("%n%s not found%n", searchName);
        }
    }
}
