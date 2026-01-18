package Practice;
import java.util.Scanner;
import java.util.Random;
public class RockPaperSecissor {
    public static void main(String[] args) {
        
        //ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock", "paper", "secissors"};
        String Playerchoice;
        String Computerchoice;
        String playAgain ="Yes";
        do{
            System.out.print("Enter your choice (Rock, Paper, secissors): ");
        Playerchoice = scanner.nextLine().toLowerCase();
        
        if(!Playerchoice.equals("rock")&&
           !Playerchoice.equals("paper")&&
           !Playerchoice.equals("secissors")){
            System.out.println("Invalid Choice!");
            continue;
        }

        Computerchoice = choice[random.nextInt(3)];
        System.out.println("Computers Choice is: " + Computerchoice);

        if(Playerchoice.equals(Computerchoice)){
            System.out.println("Its a Tie!");
        }
        else if(Playerchoice.equals("rock")&&Computerchoice.equals("secissors")
                || Playerchoice.equals("paper")&&Computerchoice.equals("rock")
                ||Playerchoice.equals("secissors")&&Computerchoice.equals("paper")){
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Lose!");
        }
        System.out.println("Play Again? (yes/no)");
        playAgain = scanner.nextLine().toLowerCase();

        }while(playAgain.equals("no"));
        
        System.out.println("Thank You for Playing!");
        
        scanner.close();
    }
}