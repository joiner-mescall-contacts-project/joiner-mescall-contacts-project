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

public class ContactsFileCreation {

    private static final String contactFilePath = "data/contacts.txt";
    private static List<String> contactsNameList = new ArrayList<>();
    private static List<String> contactsNumberList = new ArrayList<>();

    public static void ContactsFileCreate() throws IOException {
        String newDirectory = "data";
        Path filePath = Paths.get(contactFilePath);
        //adds the file if it doesn't exist
        if (Files.notExists(Path.of(newDirectory))) {
            Files.createDirectory(Path.of(newDirectory));
            Files.createFile(filePath);
        }

        // Read the Files existing information
        List<String> lines = Files.readAllLines(filePath);


        // looping by two since the name and number make one person and the for loop can be used to
        // call or pull on a certain this inside
        for (int i = 0; i < lines.size(); i += 2) {
            contactsNameList.add(lines.get(i));
            contactsNumberList.add(lines.get(i + 1));
        }

    }

    public static List<String> getContactNameList() {
        return contactsNameList;
    }

    public static List<String> getContactNumberList() {
        return contactsNumberList;
    }

}
