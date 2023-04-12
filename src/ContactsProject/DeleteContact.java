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
    private static final String contactFilePath = "data/contacts.txt";
    private static List<String> contactsNameList = new ArrayList<>();
    private static List<String> contactsNumberList = new ArrayList<>();

    public static void deleteContact(String name) throws IOException {

        // Load the existing contacts
        loadContacts();


        // Find the index of the contact with the given name
        int index = contactsNameList.indexOf(name);
        if (index == -1) {
            // Contact not found
            System.out.println("Contact not found.");
            return;
        }

        // Remove the name and number from their respective lists
        contactsNameList.remove(index);
        contactsNumberList.remove(index);

        // Rewrite the file with the updated contact list
        saveNewContacts();

        System.out.println("Contact deleted successfully.");
    }

    private static void loadContacts() throws IOException {
        //clearing duplication of contacts
        contactsNameList.clear();
        contactsNumberList.clear();
        Path filePath = Paths.get(contactFilePath);

        // Read the Files existing information
        List<String> lines = Files.readAllLines(filePath);

        // looping by two since the name and number make one person and the for loop can be used to
        // call or pull on a certain this inside
        for (int i = 0; i < lines.size(); i += 2) {
            contactsNameList.add(lines.get(i));
            contactsNumberList.add(lines.get(i + 1));
        }
    }

    private static void saveNewContacts() throws IOException {
        // Combine the names and numbers into a single list of strings
        List<String> lines = new ArrayList<>();
        for (int i = 0; i < contactsNameList.size(); i++) {
            lines.add(contactsNameList.get(i));
            lines.add(contactsNumberList.get(i));
        }

        // Write the list to the file
        Path filePath = Paths.get(contactFilePath);
        Files.write(filePath, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

}