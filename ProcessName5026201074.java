
package processingname;

import java.util.Scanner;

public class ProcessName5026201074 {

        public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
                System.out.print("Enter your name: ");
                String name = console.nextLine();
                int space = name.indexOf(" ");
                String firstName = name.substring(0,1);
                String lastName = name.substring(space);

                System.out.println("Your name is: " +lastName+ ", " +firstName+ ".");

    }
}
/* task:    1. Have the user enter a name
            2. Extract the first and last name from the name entered by the user
            3. Use methods of Stringclass to manipulate name as specified:
            4. Display the name to the console
   Expected Output:
        Type your name: Jenny Weaver
        5
        Your name is: Weaver, J.
 */