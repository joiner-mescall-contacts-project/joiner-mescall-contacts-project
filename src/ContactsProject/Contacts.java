package ContactsProject;

import java.util.ArrayList;

abstract class Contacts implements ContactsInterface{
    //person name
    //person number

    private String name;

    private String number;


    //constructor for creating contact name and number
    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }
//getter
    public String getName() {
        return name;
    }
//getter
    public String getNumber() {
        return number;
    }
//setter
    public void setName(String name) {
        this.name = name;
    }
//setter
    public void setNumber(String number) {
        this.number = number;
    }
}
