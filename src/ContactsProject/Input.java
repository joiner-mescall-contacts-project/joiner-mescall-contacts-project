package ContactsProject;

import java.util.Scanner;

    public class Input {
        private Scanner myScanner;

        public Input(){
            myScanner = new Scanner(System.in);
            //String userInput = myScanner.next();
        }

        public String getString() {
            //System.out.println("Enter a String");
            return myScanner.next();
        }
}
