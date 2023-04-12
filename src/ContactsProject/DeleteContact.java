package ContactsProject;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class DeleteContact {
    //array list to replace the deleted item
    private static List<String> deleteItem = new ArrayList<>();
    //variable for connecting to file
    private static final String contactFilePath = "data/contacts.txt";
    public static void deleteContact(String deleteName) throws IOException {
        boolean contactNameFound = false;
        for (int i = 0; i < ContactsFileCreation.getContactNameList().size(); i++) {
            if (ContactsFileCreation.getContactNameList().get(i).equalsIgnoreCase(deleteName)) {

                //selecting item to be deleted: contact name
                ContactsFileCreation.getContactNameList().remove(deleteName);
                ContactsFileCreation.getContactNumberList().remove(i +1);

                //read
                //manipulate
                //rewrite

                //filling delete array
                deleteItem.add("DELETE");

                //rewriting to file without the selected contact
                Files.write(Paths.get(contactFilePath),ContactsFileCreation.getContactNameList());

                System.out.println(deleteName + " deleted");
                contactNameFound = true;
            }
        }
        if (!contactNameFound) {
            System.out.printf("%n%s not found", deleteName);
        }
    }
}



