package ContactsProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddNew{
    private static final String contactFilePath = "data/contacts.txt";
//1-123-456-7890
    public static void addContact(String name, String number) throws IOException {
        // if the number meets this set of requirements
//        if(number.length() == 10) {
//            //replace said number with a copy of itself but with hyphens at certain indexes
//            String newNumber = number.substring(0, 3) + "-" + number.substring(3, 6) + "-" + number.substring(6);
//            ContactsFileCreation.getContactNumberList().add(newNumber);
//        } else if(number.length() == 11) {
//            String newNumber = "(" + number.substring(0,1) + ")" + number.substring(1, 4) + "-" + number.substring(4,7) + "-" + number.substring(7);
//            ContactsFileCreation.getContactNumberList().add(newNumber);
//        } else if(number.length() == 7) {
//            String newNumber = "###-" + number.substring(0, 3) + "-" + number.substring(3);
//            ContactsFileCreation.getContactNumberList().add(newNumber);
//        }
        // Add the new contact to the file





        ContactsFileCreation.getContactNameList().add(name);
        ContactsFileCreation.getContactNumberList().add(number);
        //System.lineSeparator() - separates lines like /n but ensures it works for all systems
        Files.write(Paths.get(contactFilePath), (name + System.lineSeparator() + number + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
    }

}
