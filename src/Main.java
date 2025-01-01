//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        Random random = new Random();
        String[] names = {"talya","betty","keliy","yolia","paola","maily","bella","neomi","annie","golda"};
        String secretWorld = names[random.nextInt(0,10)];
        String userChoice;
        String feedback="";
        boolean isWinner = false;
        for (int i=0;i<6;i++){
            do{
                System.out.println("Please enter a word in length 5");
                userChoice = scanner.nextLine();
            }while (userChoice.length()!=5);
            if (userChoice.equals(secretWorld)){
                isWinner = true;
                break;
            }else {
                for (int j=0;j<secretWorld.length();j++){ //array[o] //string.charAt(0)
                    if (secretWorld.charAt(j)==userChoice.charAt(j)){
                        feedback = feedback + "G";
                    } else if (secretWorld.contains(userChoice.charAt(j)+"")) {
                        feedback = feedback + "Y";
                    }else {
                        feedback = feedback + "_";
                    }
                }
                System.out.println(feedback);
                feedback="";
            }
        }

        if (isWinner==true){
            System.out.println("Winner ");
        }else {
            System.out.println("you lose and the secret word" +secretWorld);
        }
    }
}
