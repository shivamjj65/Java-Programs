/*
created a class Game to guess a number given by user
- There is one constructor to generate a random number
- takeUserInput() to take a number as input from user
- isCorrectNumber() to check number entered by the user
- getAns and setAns to show result
 */

package com.programs;
import java.util.Scanner;
import java.util.Random;

class Game{
    public int no;
    public int NoOfGuesses;
    public int ipno;
    public int getNoOfGuesses() {
        return NoOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }

    Game(){
    Random rand = new Random();
    this.no = rand.nextInt(100);
    }

    void takeUserInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        ipno = sc.nextInt();
    }

    boolean isCorrectNumber()
    {
        if (ipno == no){
            System.out.println("Yes you guessed right");
            return true;
        }
        else if (ipno<no){
            System.out.println("Too less");
        }
        else if (ipno>no){
            System.out.println("Too large");
        }
        return false;
    }

}

public class CODE_GuessANumber {
    public static void main(String[] args) {
    Game g = new Game();
    boolean b = false;
    while (!b) {
        g.takeUserInput();
        b = g.isCorrectNumber();
    }
    }
}
