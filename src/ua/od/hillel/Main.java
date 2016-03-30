package ua.od.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int amount = 0;
        double result = 0;
        String levelService;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of the check");
        amount = scanner.nextInt();
        System.out.println("Enter the quality of service");
        levelService = scanner.next();
        switch (levelService) {
            case "terrible":
                result = amount;
                break;
            case "poor":
                result=amount+amount*0.05;
                break;
            case "good":
                result=amount+amount*0.1;
                break;
            case "great":
                result=amount+amount*0.15;
                break;
            case "excellent":
                result=amount+amount*0.2;
                break;
        }
        System.out.println("The sum you should leave: " +result);
    }
}
