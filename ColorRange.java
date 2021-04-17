/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        System.out.print("Here is some wavelength of the color \n" +
                         "Violet          380-450 \nBlue            450-495 \n" +
                         "Green           495-570 \nYellow          570-590 \n" +
                         "Orange          590-620 \nRed             620-750 \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your wavelength here");
        double waveLength = sc.nextDouble();
        if (waveLength >= 380 && waveLength < 450) {
            System.out.println("The color is violet");
        } else if (waveLength >= 450 && waveLength < 495 ) {
            System.out.println("The color is Blue");
        } else if (waveLength >= 495 && waveLength < 570) {
            System.out.println("The color is Green");
        } else if (waveLength >= 570 && waveLength < 590 ) {
            System.out.println("The color is Yellow");
        } else if (waveLength >= 590 && waveLength < 620) {
            System.out.println("The color is Orange");
        } else if (waveLength >= 620 && waveLength < 750 ) {
            System.out.println("The color is Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        }
    }
    /*
    ColorWavelength (nm)
    Violet          380-450
    Blue            450-495
    Green           495-570
    Yellow          570-590
    Orange          590-620
    Red             620-750
    (using if statement)
    1.  Prompt the user to enter the wavelength,
        the wavelength should be of type double
    2.  For each range (e.g. 380-450) the number on the left is included in the range,
        but the number on the right is not included in the range
    3.  If the input value is not found on the visible spectrum
        then state that the wavelength is not within the visible spectrum
    4. Expected Output:
        a. Enter a color code
            630
            The color is Red
        b. Enter a color code
            25.0
            The entered wavelength is not a part of the visible spectrum
        c. Enter a color code
            750.5
            The entered wavelength is not a part of the visible spectrum
     */
