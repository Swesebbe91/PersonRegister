package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PersonRegister personLista = new PersonRegister();
        boolean ison = true;
        //Skapa en meny som löper till menyval 3;
        //1. Lägg till en person
        //2. Skriv ut listan
        //3. avsluta


        while (ison) {
            System.out.printf("Välj ett menyval %n" +
                    "[1] Lägg till en studerande person%n" +
                    "[2] Lägg till en anställd person%n" +
                    "[3 Skriv ut listan%n" +
                    "[4] Avsluta%n");

            int input = scan.nextInt();

            switch (input) {
                case 1: {

                    System.out.println("Ange ditt namn: ");
                    String name = scan.next();
                    System.out.println("Ange din adress: ");
                    String adress = scan.next();
                    System.out.println("Ange ditt telefonnummer: ");
                    String telefonnummer = scan.next();
                    System.out.println("Ange ditt personnummer: ");
                    String personnummer = scan.next();
                    System.out.println("Ange lån: ");
                    int lån =0;
                    boolean itirating = true;
                    while(itirating) {
                    String inputer = scan.next();
                        try {
                        lån = Integer.parseInt(inputer);
                        itirating = false;
                    }

                    catch (Exception m) {
                        System.out.println("hej");
                        System.out.println("Du matade inte in ett tal!");
                        System.out.println("Skriv in ett nytt tal");

                    }
                    }
                    Student s = new Student(name, adress, telefonnummer, personnummer, lån);
                    personLista.addPerson(s);
                    break;

                }

                case 2: {
                    System.out.println("Ange ditt namn: ");
                    String name = scan.next();
                    System.out.println("Ange din adress: ");
                    String adress = scan.next();
                    System.out.println("Ange ditt telefonnummer: ");
                    String telefonnummer = scan.next();
                    System.out.println("Ange ditt personnummer: ");
                    String personnummer = scan.next();
                    System.out.println("Ange lön: ");
                    int lön = scan.nextInt();
                    Anställd a = new Anställd(name, adress, telefonnummer, personnummer, lön);
                    personLista.addPerson(a);
                    break;
                }

                case 3: {
                personLista.printLista();
                break;
                }
                /*
                case 4: {
                    System.out.println("Välj en person du vill lägga till studielån på");
                    String input = scan.nextLine();

                }
                */




                case 4: {
                    System.out.println("Du har valt att avsluta programmet, hejdå! ");
                    ison = false;
                }
            }



        }
        /*
        System.out.println(a.toString());
        System.out.println("Hur mycket vill du höja ditt lån med?");
        int input = scan.nextInt();
        s.studieskuld(input);
        System.out.println(s.toString());

        System.out.println("Hur mycket ska sätts in på lönekonto? ");
        input = scan.nextInt();
        System.out.println(a.sättInLön(input));
        System.out.println(a.toString());
        */

    }
}
