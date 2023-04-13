package ContactsProject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowAll {
    public static void showAllContacts() throws IOException {
        String pipe = "|";
        System.out.printf("|-----------------------------------|----------------------------------|%n");
        System.out.printf("%-15s%-20s%-15s%-20s%s\n",pipe, "Name", pipe, "Phone number", pipe);
        System.out.printf("|----------------------------------|----------------------------------|%n");

        List<String> formattedNumbersList = new ArrayList<>();

        for (int i = 0; i < ContactsFileCreation.getContactNameList().size(); i++) {
            String phoneNumber = ContactsFileCreation.getContactNumberList().get(i);
            String newNumber = "";
            if (phoneNumber.length() == 10) {
                //replace said number with a copy of itself but with hyphens at certain indexes
                newNumber = phoneNumber.substring(0, 0) + "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);
                formattedNumbersList.add(newNumber);
            } else if (phoneNumber.length() == 11) {
                newNumber = phoneNumber.substring(0,0) + "+" + phoneNumber.substring(0,1) + "-" + phoneNumber.substring(1, 4) + "-" + phoneNumber.substring(4,7) + "-" + phoneNumber.substring(7);
                formattedNumbersList.add(newNumber);
            } else if (phoneNumber.length() == 7) {
                newNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3);
                formattedNumbersList.add(newNumber);
            }
        }

        // display the contacts using the formatted phone numbers list
        for (int i = 0; i < ContactsFileCreation.getContactNameList().size(); i++) {
            System.out.printf("%-15s%-20s%-15s%-20s%s\n", pipe, ContactsFileCreation.getContactNameList().get(i), pipe, formattedNumbersList.get(i), pipe);
        }

        System.out.printf("|----------------------------------|----------------------------------|%n");
    }
}
