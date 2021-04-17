/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        System.out.println("Here is some codes of traffic light's color:");
        System.out.println("1: red \n2: green \n3: yellow");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your code as current traffic light's color");
        int input = sc.nextInt();
        String output;
        if (input == 1) {
            output = "The next traffic light is green";
        } else if (input == 2) {
            output = "The next traffic light is yellow";
        } else if (input == 3) {
            output = "The next traffic light is red";
        } else {
            output = "You enter an invalid color!";
        }
        System.out.println(output);
    }
}
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