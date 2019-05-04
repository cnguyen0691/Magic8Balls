package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> balls = new ArrayList<>();
        balls.add("It is certain");
        balls.add("It is decidedly so");
        balls.add("Without a doubt");
        balls.add("Yes definitely");
        balls.add("You may rely on it");
        balls.add("As I see it, yes");
        balls.add("Most likely");
        balls.add("Outlook good");
        balls.add("Yes");
        balls.add("Signs point to yes");
        balls.add("Reply hazy try again");
        balls.add("Ask again later");
        balls.add("Better not tell you now");
        balls.add("Cannot predict now");
        balls.add("Concentrate and ask again");
        balls.add("Don't count on it");
        balls.add("My reply is no");
        balls.add("My sources say no");
        balls.add("Outlook not so good");
        balls.add("Very doubtful");


        while (true) {
            System.out.println("Ask question: ");
            String question = input.next();

            if (question.equalsIgnoreCase("Q")) {
                System.out.println("Thank you. Have a good day!");
                break;
            }
            for (int i = 0; i < balls.size(); i++) {
                if (!question.equalsIgnoreCase("q")){

                }
            }
            System.out.println(randItems(balls));

        }

    }


        public static String randItems(ArrayList<String>itemList){
            Random rand = new Random();
            String randItems= itemList.get(rand.nextInt(itemList.size()));
            return randItems;
        }
}
