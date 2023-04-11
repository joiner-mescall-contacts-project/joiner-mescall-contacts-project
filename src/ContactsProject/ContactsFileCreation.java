package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactsFileCreation {

    private static List<String> contactsNameList =new ArrayList<>(Arrays.asList("Austin", "Marc", "Thomas"));
    private static List<String> contactsNumberList = new ArrayList<>(Arrays.asList("850-483-3849", "484-338-3203", "394-392-9303"));


public static void ContactsFileCreate () throws IOException {
        String newDirectory = "data";
        String newFile = "data/contacts.txt";

        if (Files.notExists(Path.of(newDirectory))) {
            Files.createDirectory(Path.of(newDirectory));
            Files.createFile(Path.of(newFile));
        } else {
            System.out.println("Path already exists in project.");
        }


        Path filePath = Paths.get("./data", "contacts.txt");

        Files.write(filePath, contactsNameList);
        Files.write(filePath, contactsNumberList, StandardOpenOption.APPEND);
    }

    public static List<String> getContactNameList(){
        return contactsNameList;
    }

    public static List<String> getContactNumberList(){
        return contactsNumberList;
    }
}
