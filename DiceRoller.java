import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int noOfDice = 0;
        int total=0;

        System.out.print("Enter the No. of Dice to Roll: ");
        noOfDice = scanner.nextInt();

        if(noOfDice > 0){
            for(int i = 0; i < noOfDice; i++){
                int roll = random.nextInt(1,7);
                PrintDie(roll);
                System.out.println("You Rolled: " + roll);
                total += roll;
            }
            System.out.print("Total: "+ total);
        }
        else{
            System.out.println("No. of Dice cannot be NEGATIVE!");
        }
        scanner.close();
    } 
    
        static void PrintDie(int roll){
            String Die1 ="""
                     -------
                    |       |
                    |   ●   |
                    |       |
                     -------
                    """;
            String Die2 ="""
                     -------
                    |     ● |
                    |       |
                    | ●     |
                     -------
                    """;
            String Die3 ="""
                     -------
                    |     ● |
                    |   ●   |
                    | ●     |
                     -------
                    """;
            String Die4 ="""
                     -------
                    | ●   ● |
                    |       |
                    | ●   ● |
                     -------
                    """;
            String Die5 ="""
                     -------
                    | ●   ● |
                    |   ●   |
                    | ●   ● |
                     -------
                    """;
            String Die6 ="""
                     -------
                    | ●   ● |
                    | ●   ● |
                    | ●   ● |
                     -------
                    """;

            switch(roll){
                case 1 -> System.out.println(Die1);
                case 2 -> System.out.println(Die2);
                case 3 -> System.out.println(Die3);
                case 4 -> System.out.println(Die4);
                case 5 -> System.out.println(Die5);
                case 6 -> System.out.println(Die6);
                default -> System.out.println("Invalid Roll");
            }
        }
}
