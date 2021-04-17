
package com.example;
import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        System.out.println("Here is some codes of traffic light's color:");
        System.out.println("1: red \n2: green \n3: yellow");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your code as current traffic light's color");
        int input = sc.nextInt();
        String output;
        switch (input) {
            case 1:
                output = "The next traffic light is green";
                break;
            case 2:
                output = "The next traffic light is yellow";
                break;
            case 3:
                output = "The next traffic light is red";
                break;
            default:
                output = "You put invalid color!";
        }
        System.out.println(output);
    }
}

/*  Implement practice 5-2 (TrafficLightChecker)
    using switch statement and ensure the program alert users
    if they’ve entered any invalid value
 */
/*
red-green-yellow pattern
(using if decision statement)
1.  Have the user enter the value for the currentColor
2.  Compute the next color stop light based on the currentColor
3.  Alert the user for any invalid value of color

Expected Output:
a. Enter a color code
    1
    Next Traffic Light is green
b. Enter a color code
    3
    Next Traffic Light is red
c. Enter a color code
    0
    Invalid color
d. Enter a color code
    4
    Invalid color
 */