package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class AddNew{
    private static final String contactFilePath = "data/contacts.txt";

    public static void addContact(String name, String number) throws IOException {

        ContactsFileCreation.getContactNameList().add(name);
        ContactsFileCreation.getContactNumberList().add(number);
        //System.lineSeparator() - separates lines like /n but ensures it works for all systems
        Files.write(Paths.get(contactFilePath), (name + System.lineSeparator() + number + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
    }
}
