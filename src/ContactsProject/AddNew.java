package ContactsProject;

public class AddNew extends Main{
    Input userInput = new Input();
    Contacts newContact = new Contacts("String name", "String number") {
        //overriding name
        @Override
        public String getName() {
            return super.getName();
        }

        //overriding number
        @Override
        public String getNumber() {
            return super.getNumber();
        }


    };
}
