package SuffleGame;

import java.util.Scanner;

public class Suffle {
    public static void main(String[] args) {
        String answer,c, pick;
        System.out.println("--------------------------------welcome to shuffle game-------------------------------");
        Scanner sc = new Scanner(System.in);
        int[] array = { 1, 0, 1 };
        System.out.println("guess where the 0 is?");
        do {
            System.out.println("are you ready to play? y/n");
            answer = sc.nextLine();
            while (!(answer.equalsIgnoreCase("y")) && !(answer.equalsIgnoreCase("n"))) {
                System.out.println("invalid entry, please enter y or n");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("pick 1, 2, or 3 ");
                pick = sc.nextLine();
            }
            if (!(pick.equalsIgnoreCase("1")) && !(pick.equalsIgnoreCase("2"))&& !(pick.equalsIgnoreCase("3"))) {
                System.out.println("invalid entry, please enter 1 or 2 or 3");
                pick = sc.nextLine();
            }
            if (array[Integer.parseInt(c) - 1] == 0) {
                System.out.println("Good guess!");
            }else{
                System.out.println("sorry!!! wrong guess");
            }
            System.out.println("do you want to try again? y/n");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("go back to are you ready to play?");
            }else{
                System.out.println("see you next time!");
            }

        }

    }



}
