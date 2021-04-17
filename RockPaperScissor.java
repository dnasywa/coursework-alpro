
package com.example;

import java.util.*;

public class RockPaperScissor {

    public static String admin () {
        Random rps = new Random();
        int output = rps.nextInt(3) + 1;
        String adminMove;
        if (output == 1) {
            adminMove = "rock";
        } else if (output == 2) {
            adminMove = "paper";
        } else { adminMove = "scissor";
        }
        return adminMove;
    }
    public static String user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose between rock, paper, and scissor");
        return sc.nextLine();
    }
}
/*
String userMove;
        if (input.equalsIgnoreCase("rock")) {
            userMove = "1";
        } else if (input.equalsIgnoreCase("paper")) {
            userMove = "2";
        } else {
            userMove = "3";
        }
 */
/*
package com.example;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random num = new Random();
        int rps = num.nextInt(3);
        System.out.println(rps);

        // gimana bikin if nya??
    }
}
*/