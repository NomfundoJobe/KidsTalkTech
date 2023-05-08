package org.example;

import java.util.Scanner;

public class Details {
    public static void main(String...ARGS) {
        System.out.println("___-------___-------___-------___--------___");
        System.out.println("   |   Welcome to AutoKidsMachinery   |");
        String smiling = "\uD83D\uDE0D";
        String greeting = "\uD83D\uDE07";
        System.out.println("   |   Home of KidsTalkTechnology     |");
        System.out.println("___-------___-------___-------___--------___");
        NewLogger newLogger = new NewLogger();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.println("Hello" +" "+ scanner.nextLine()+" " +
                "Welcome to KidsTalkTechnology"+smiling +greeting);
        System.out.println("What is your surname");
        newLogger.setName(scanner.nextLine());
        System.out.println("Enter your valid Id Number");
        newLogger.setId_Number(scanner.nextLine());
        System.out.println("Enter your guardian's full name");
        newLogger.setGuardian_Name(scanner.nextLine());
        System.out.println("Enter your guardian's contact details");
        newLogger.setGuardian_Contact_Details(Integer.parseInt(scanner.nextLine()));

        System.out.println("Thank you for your feedback " + smiling);
                "Now get to know more about KidsTalkTechnology");

        TopicsList topicsList = new TopicsList();
        topicsList.addTopic("Basics of Coding");
        topicsList.addTopic("Concepts used in Coding");
        topicsList.addTopic("Languages used in Coding");

        System.out.println(topicsList.getTopic(0));
        System.out.println(topicsList.getTopic(1));
        System.out.println(topicsList.getTopic(2));

    }


}