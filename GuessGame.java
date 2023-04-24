import java.util.Random; 
import java.util.Scanner;

class Game{
    public int number ;  
    public int inputNumber; 
    public int noOfGuesses=0; 

    Game(){
        Random rand = new Random();
        number = rand.nextInt(100); 
    }

    void takeUserInput(){
        System.out.println("Please Guess the Number As You Want");
        Scanner sc = new Scanner(System.in);;
        inputNumber= sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Congratulation! You Guess the right number %d\nYou Guessed it in %d attempt", number,noOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too low...");
        }
        else if (inputNumber>number){
            System.out.println("Too High...");
        }
        return false;
    }
}

class guessgame {
    public static void main(String[] args) {

        Game g =new Game();
        boolean b= false;
        System.out.println("Welcome to the Number Guessing Game");
        while(!b){ 
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
    }
}
