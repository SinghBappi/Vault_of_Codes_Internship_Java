import java.util.Scanner;

public class Main {

    // Shifts a single character by the given amount (Caesar-style shift)
    private static char ShiftChar(char ch, int shift) {

        // Uppercase A–Z
        if (ch >= 'A' && ch <= 'Z') {
            int base = 'A';
            int offset = ch - base;
            int newOffset = (offset + shift + 26) % 26;   // wrap-around
            return (char) (base + newOffset);
        }

        // Lowercase a–z
        else if (ch >= 'a' && ch <= 'z') {
            int base = 'a';
            int offset = ch - base;
            int newOffset = (offset + shift + 26) % 26;   // wrap-around
            return (char) (base + newOffset);
        }

        // Non-alphabetic characters remain unchanged
        return ch;
    }

    // Applies shifting to each character in the string
    private static String TextShift(String text, int shift) {
        shift = shift % 26;  // normalize shift
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            result.append(ShiftChar(ch, shift));
        }
        return result.toString();
    }

    // Reads a valid shift value from the user
    private static int readShift(Scanner sc) {
        while (true) {
            System.out.println("Enter Shift number (example: 1, 2, 3, 4, 5):");

            if (sc.hasNextInt()) {
                int s = sc.nextInt();
                sc.nextLine(); // clear buffer
                return s;
            }

            System.out.println("Invalid input. Please enter a number.");
            sc.nextLine(); // clear invalid input
        }
    }

    // Displays the main menu
    private static void printMenu() {
        System.out.println("\n===== Text Encoder & Decoder =====");
        System.out.println("1. Encode a message");
        System.out.println("2. Decode a message");
        System.out.println("3. Change shift number");
        System.out.println("4. Exit");
        System.out.print("Choose an option (1–4): ");
    }

    // Encodes text using positive shift
    public static String encode(String text, int shift) {
        return TextShift(text, shift);
    }

    // Decodes text by reversing the shift
    public static String decode(String text, int shift) {
        return TextShift(text, -shift);
    }

    public static void main(String[] args) {
        /*
        *  System.out.println("Hello, World !");
//        char abc = ShiftChar('A',2);
//        System.out.println(abc);
//        String abc = TextShift("Hello",2);
//        System.out.println(abc);
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Encode–Decode Program!");

        int shift = readShift(sc);
        boolean running = true;

        while (running) {
            printMenu();
            String choice = sc.nextLine().trim();

            switch (choice) {

                case "1":
                    System.out.println("Enter message to encode:");
                    String toEncode = sc.nextLine();
                    System.out.println("Encoded Message: " + encode(toEncode, shift));
                    break;

                case "2":
                    System.out.println("Enter message to decode:");
                    String toDecode = sc.nextLine();
                    System.out.println("Decoded Message: " + decode(toDecode, shift));
                    break;

                case "3":
                    shift = readShift(sc);
                    System.out.println("Shift updated to: " + shift);
                    break;

                case "4":
                    System.out.println("Bye Bye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        }

        sc.close();
    }
}

/*
*
* Output
*
*
* "C:\Program Files\Eclipse Adoptium\jdk-21.0.9.10-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.4\lib\idea_rt.jar=61628" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\bappi\OneDrive\Desktop\Emergency\java\Vaults_of_Codes_Encode_Decode\out\production\Vaults_of_Codes_Encode_Decode Main
Welcome to encode decode program !
Enter Shift number(example = 1,2,3,4,5):
3

===== Text Encoder & Decoder =====
1. Encode a message
2. Decode a message
3. Change shift number
4. Exit
Choose an option (1-4): 1
Enter message to enter:
Hello World
Encoded Message:Khoor Zruog

===== Text Encoder & Decoder =====
1. Encode a message
2. Decode a message
3. Change shift number
4. Exit
Choose an option (1-4): 2
Enter a message  to decode:

Decoded message:

===== Text Encoder & Decoder =====
1. Encode a message
2. Decode a message
3. Change shift number
4. Exit
Choose an option (1-4): 2
Enter a message  to decode:
Khoor Zruog
Decoded message:Hello World

===== Text Encoder & Decoder =====
1. Encode a message
2. Decode a message
3. Change shift number
4. Exit
Choose an option (1-4): 4
Bye Bye !

Process finished with exit code 0

* */
