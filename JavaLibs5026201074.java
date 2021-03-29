
import javax.swing.*;

public class JavaLibs5026201074 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Hello, please fill the next 10 questions",
                "Oracle Academy Survey",
                1);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "What is your name?",    //message
                "Question 1",            //title
                3,                       //message type, 0=X, 1=!, 2=?, 3=?
                null,                    //icon
                null,                    //selectionValues
                "Answer here");           //initial selectVal

        String [] acceptableValues  = {"man", "woman"};  //bentuk opsi
        String input2 = (String) JOptionPane.showInputDialog( null,
                "Hi " +input1+ ", are you a man or woman?",
                "Question 2",
                3,
                null,
                acceptableValues,
                acceptableValues[1]);

        String input3 = (String) JOptionPane.showInputDialog(null,
                "How old are you?",
                "Question 3",
                3,
                null,
                null,
                "Type here");
        int input03 = Integer.parseInt(input3);

        String [] option01  = {"good", "normal", "not good"};
        String input4 = (String) JOptionPane.showInputDialog( null,
                "As a " +input03+ " years old " +input2+ ", what do you think about your life so far?",
                "Question 4",
                3,
                null,
                option01,
                option01[1]);

        String input5 = (String)JOptionPane.showInputDialog(null,
                "What is your resolution for next 5 year, as " +(input03+5)+ " years old " +input2+ "?",
                "question 5",
                1,
                null,
                null,
                "Type here");

        String input6 = (String) JOptionPane.showInputDialog(null,
                "What is your favorite between 0 and 1?",
                "Question 6",
                3,
                null,
                null,
                "Answer here");
        double input06 = Double.parseDouble(input6);

        double x = 2*input06;

        String [] option02  = {"sunset", "sunrise"}; //bentuk opsi
        String input7 = (String) JOptionPane.showInputDialog( null,
                "Do you prefer a sunset or sunrise?",
                "Question 7",
                3,
                null,
                option02,
                option02[1]);

        String input8 = (String)JOptionPane.showInputDialog(null,
                "What is your favorite snacks, " +input1+ "?",
                "Question 8",
                3,
                null,
                null,
                "Answer here");

        String input9 = (String)JOptionPane.showInputDialog(null,
                "What genre of movie do you like, " +input1+ "?",
                "Question 1",
                2,
                null,
                null,
                "Type here");

        String [] option03  = {"car", "motorcycle"};
        String input10 = (String) JOptionPane.showInputDialog( null,
                "Do you prefer riding with a car or a motorcycle?",
                "Question 10",
                3,
                null,
                option03,
                option03[1]);

        JOptionPane.showMessageDialog(null,
                "Hello, I am " +input1+ " and I am a " +input03+ " years old " +input2+ ". " + "\n" +
                        "So far I think my life is " +input4+ ", " + "and I have a plan to " +input5+ "\n" +
                        "about next 5 years. I also love about " +input7+ ", " +input8+ ", and " +input9+ "\n" +
                        "movie. I have a favorite decimal number, and the twice of its number is " +x+ ".\n" +
                        "And also, I am very love to have a ride with a " +input10+ ".",
                "The Summary",
                1);
    }
}
/* Your program must also do the following:
•Accept at least 1 input, to be parsed as a String done
•Do math with at least 1 double input
 */