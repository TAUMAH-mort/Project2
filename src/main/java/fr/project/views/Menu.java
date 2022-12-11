package fr.project.views;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome in the STARTUP MENU\n");
        System.out.println("Please enter number 1 if you want to go into the Presentation Layer\n");
        System.out.println("Please enter number 2 if you want to go into the Service Layer\n");
        System.out.println("Please enter number 3 if you want to go into the Data Storage Layer (Repository)\n");
        System.out.println("Enter your number : ");
        int choice = sc.nextInt();
        System.out.println("You have selected the following number : " +choice+"\n");
        if (choice == 1){
            System.out.println("Welcome in the Presentation Layer\n");
        }
        if(choice ==2){
            System.out.println("Welcome in the Service Layer\n");
        }
        if(choice ==3){
            System.out.println("Welcome in the Data Storage Layer (Repository)\n");
        }
    }
}
