
package com.example;

import java.util.Random;

public class ComputeMethods5026201074 {

        public double fToC (double degreesF){
            return 5/9.0*(degreesF - 32);
        }
        public double hypotenuse (int a, int b){
            return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        }
        public int roll (){
            Random rndmDice = new Random();
            int rollingDice1 = rndmDice.nextInt(6) + 1;
            int rollingDice2 = rndmDice.nextInt(6) + 1;
            return rollingDice1 + rollingDice2;
        }
    }

/*
    define this 3 methods:  public  double fToC (double degreesF)
                            public  double hypotenuse (int a, int b)
                            public int roll ()
    converts fahrenheit to celcius C=5/9*(F-32)
    compute hypotenuse using given side length c^2 = a^2 + b^2
    Simulate the rolling of two 6-sided dice and display their sum
 */