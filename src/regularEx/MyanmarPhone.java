package regularEx;

import java.util.Scanner;

public class MyanmarPhone {
    private static final String STOP = "0";
    private static final String VALID = "Valid phone number";
    private static final String INVALID = "Not a valid phone number";
    private static final String VALID_PHONE_PATTERN
            = "[09]{3}-[0-9]{3}-[0-9]{4}";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String phoneStr, reply;
        while (true) {
            System.out.print("Phone#: ");
            phoneStr = scanner.next();

            if (phoneStr.equals(STOP)) break;
            if (phoneStr.matches(VALID_PHONE_PATTERN)) {
                reply = VALID;
            } else {
                reply = INVALID;
            }
            System.out.println(phoneStr + ": " + reply + "\n");


        }
    }

}