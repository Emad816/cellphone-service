package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone phone1 = new CellPhone();

        //prompting to enter cell phone info and setting it
        System.out.print("What is the serial number? ");
        phone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); //clears the leftover enter press

        System.out.print("What model is the phone? ");
        phone1.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        phone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        phone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone1.setOwner(scanner.nextLine());


    }
}
