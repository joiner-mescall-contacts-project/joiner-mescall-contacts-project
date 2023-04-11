package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class ShowAll{

    public static void showAllContacts(){
        Path contactPath = Paths.get("data", "contacts.txt");
        List<String> contactList = null;
        try {
            contactList = Files.readAllLines(contactPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(contactList);
    }
}
