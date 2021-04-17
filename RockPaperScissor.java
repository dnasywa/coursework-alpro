
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

// + main class
/*
public class Main {
    public static void movement() {
        String userMove = RockPaperScissor.user
        String adminMove = RockPaperScissor.admin
        System.out.println("The computer's choose " +userMove);
        
        String score;
        if (userMove==adminMove) {
            score = "It is draw";
        } else if (userMove == rock && adminMove == scissor || userMove == scissor && adminMove == paper || userMove == paper && adminMove == rock {
            score = "You lose!";
        } else {
            score = "You win!";
        } System.out.println(score)
    }
} 
*/
