import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you," +
                "\n you see two caves. In one cave, the dragon is friendly" +
                "\n and will share his treasure with you. The other dragon" +
                "\n is greedy and hungry and will eat you on sight." +
                "\n Which cave will you go into? (1 or 2)");

        boolean validation = false;
        String input = "";
        while (!validation) {
            input = sc.next();
            try {
                Integer.parseInt(input);
                validation = true;
                if (validation = true) {
                    if (Integer.parseInt(input) == 1 || Integer.parseInt(input) == 2){
                        validation = true;
                    } else {
                        System.out.println("Please choose options 1 or 2.");
                        validation = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Caught Exception: Invalid Choice");
                validation = false;
            }


        }
        if (Integer.parseInt(input) == 1) {
            System.out.println("You approach the cave..." +
                    "\n It is dark and spooky..." +
                    "\n A large dragon jumps out in front of you! He opens his jaws and..." +
                    "\n He gobbles you up!");

        }
        else if (Integer.parseInt(input) == 2) {
            System.out.println("You approach the cave..." +
                    "\n It is dark and spooky..." +
                    "\n A large dragon jumps out in front of you! He opens his jaws and..." +
                    "\n Spits out treasure! Just for you!");
        } else {
            System.out.println("Pick an actual option.");
        }

    }

}


