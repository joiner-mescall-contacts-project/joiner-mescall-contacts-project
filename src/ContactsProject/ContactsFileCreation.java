package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ContactsFileCreation {

public static void ContactsFileCreate () throws IOException {
        String newDirectory = "data";
        String newFile = "data/contacts.txt";

        if (Files.notExists(Path.of(newDirectory))) {
            Files.createDirectory(Path.of(newDirectory));
            Files.createFile(Path.of(newFile));
        } else {
            System.out.println("Path already exists in project.");
        }
        List<String> contactsNameList = Arrays.asList("Austin", "Marc", "Thomas");
        List<String> contactsNumberList = Arrays.asList("850-483-3849", "484-338-3203", "394-392-9303");

        Path filePath = Paths.get("./data", "contacts.txt");

        Files.write(filePath, contactsNameList);
        Files.write(filePath, contactsNumberList, StandardOpenOption.APPEND);
    }
}
