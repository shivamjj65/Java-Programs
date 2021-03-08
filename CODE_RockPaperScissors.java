package com.programs;
import java.util.Scanner;
import java.util.Random;

public class CODE_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Press 1 for Rock, 2 for Paper, 3 for Scissors");
        int choice= sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have chosen Rock");
                int r1 = rand.nextInt(3);
                if (r1==1){
                    System.out.println("Computer has chosen Rock, Its a TIE");
                }
                else if (r1==2){
                    System.out.println("Computer has chosen Paper, You LOSE");
                }
                else{
                    System.out.println("Computer has chosen Scissor, You WIN");
                }
                break;
            case 2:
                System.out.println("You have chosen Paper");
                int r2 = rand.nextInt(3);
                if (r2==1){
                    System.out.println("Computer has chosen Rock, You WIN");
                }
                else if (r2==2){
                    System.out.println("Computer has chosen Paper, Its a TIE");
                }
                else{
                    System.out.println("Computer has chosen Scissor, You LOSE");
                }
                break;
            case 3:
                System.out.println("You have chosen Scissor");
                int r3 = rand.nextInt(3);
                if (r3==1){
                    System.out.println("Computer has chosen Rock, You LOSE");
                }
                else if (r3==2){
                    System.out.println("Computer has chosen Paper, You WIN");
                }
                else{
                    System.out.println("Computer has chosen Scissor, Its a TIE");
                }
                break;
            default:
                System.out.println("invalid input");
                break;
        }

    }
}
