package org.example;

import java.util.Scanner;
import java.io.Console;

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
        System.out.println("Hello" +" "+scanner.nextLine()+"!!!.."+smiling+ "  " +
                "Welcome to KidsTalkTechnology"+ greeting);
        System.out.println("What is your surname");
        newLogger.setName(scanner.nextLine());
        System.out.println("Enter your valid Id Number");
        newLogger.setId_Number(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your guardian's full name");
        newLogger.setGuardian_Name(scanner.nextLine());
        System.out.println("Enter your guardian's contact details");
        newLogger.setGuardian_Contact_Details(Integer.parseInt(scanner.nextLine()));

        System.out.println("Thank you for your feedback " + smiling);
        System.out.println("Press YES to proceed and learn more about us");
        newLogger.getYes(scanner.nextLine());
        String booksEmoji = "\uD83D\uDCDA";
        String computerEmoji = "\uD83D\uDCBB";
        String laptopEmoji= "\uD83D\uDCBB";

        System.out.println("KidsTalkTechnology is about helping children at their early stage of life to start learning about Technology.\n"+
                "For the past years, technology has played a huge role in changing lives of many, from communication ,transport ,healthcare and connectivity.\n"+
                "Technology has enhanced our lives for the better and it has transformed the world!!!...."+booksEmoji+""+computerEmoji+""+computerEmoji+"\n"+
                "Since we live in an age where technology has transformed the world and the reality of children’s lives.\n"+
                "We owe it to our children to help support them to get the best start in the space life of digital tools.\n"+
                "As AutoKidsMachinery we have seen the gap over the past few years and decided to help the young minds to grasp and learn more about Technology.\n");

        TopicsList topicsList = new TopicsList();
        topicsList.addTopic("Basics of Coding");
        topicsList.addTopic("Concepts used in Coding");
        topicsList.addTopic("Languages used in Coding");

        System.out.println(topicsList.getTopic(0));
        System.out.println(topicsList.getTopic(1));
        System.out.println(topicsList.getTopic(2));
    }
}