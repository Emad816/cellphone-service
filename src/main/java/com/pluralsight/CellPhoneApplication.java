package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1, cellPhone2;
        cellPhone1 = new CellPhone();
        cellPhone2 = new CellPhone();

        //added cellphone 2 info for example
        cellPhone2.setOwner("sidra");
        cellPhone2.setPhoneNumber("347-445-0345");
        cellPhone2.setCarrier("at&t");
        cellPhone2.setModel("Iphone 14 pro");
        cellPhone2.setSerialNumber(8674321);

        //prompting to enter cell phone info and setting it
        System.out.print("What is the serial number? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); //clears the leftover enter press

        System.out.print("What model is the phone? ");
        cellPhone1.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine());

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone2.getPhoneNumber());

        scanner.close();
    }

    public static void display(CellPhone phone) {
        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
