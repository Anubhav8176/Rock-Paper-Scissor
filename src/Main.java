import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1: Store all the options player has in the game.
        HashMap<Integer, String> options = new HashMap<>();

        options.put(1, "Rock");
        options.put(2, "Paper");
        options.put(3, "Scissors");
        options.put(4, "Exit");

        boolean game = true;

        while(game){

            System.out.println("<====WELCOME TO GAME!!====>");
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            //Task 2. Show all the options user have.
            System.out.println("Select the option from the below!!");
            for(int i=0; i<4; i++){
                String userReference;
                if (i==0)userReference = "Rock!";
                else if(i==1)userReference = "Paper!";
                else if(i==2)userReference = "Scissors!";
                else userReference = "Exit";
                System.out.println((i+1)+": "+userReference);
            }

            //Task 3. Let user and computer make their choices.
            int userChoice = sc.nextInt();
            System.out.println("You choosed: " + options.get(userChoice));

            int computerChoice = random.nextInt(1, 3);
            System.out.println("Computer choosed: " + options.get(computerChoice));

            //Task 4. Compare the choices.
            boolean userWin = true, flag = false;
            if (userChoice == 1){
                if (computerChoice == 1){
                    System.out.println("The Match is drawn!!");
                    flag = true;
                } else if (computerChoice == 2) {
                    userWin = false;
                }
            }else if (userChoice == 2){
                if (computerChoice == 2){
                    System.out.println("The Match is drawn!!");
                    flag = true;
                } else if (computerChoice == 3) {
                    userWin = false;
                }
            }else if (userChoice == 3){
                if (computerChoice == 3){
                    System.out.println("The Match is drawn!!");
                    flag = true;
                } else if (computerChoice == 1) {
                    userWin = false;
                }
            }else{
                flag = true;
                game = false;
            }

            if (!flag){
                if (userWin){
                    System.out.println("Yay!! You won!!");
                }else {
                    System.out.println("Oops!! You loose!!");
                }
            }

            System.out.println("==============================");
        }


    }
}