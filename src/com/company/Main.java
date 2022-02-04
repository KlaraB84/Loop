package com.company;

   import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            int number = 12;
            System.out.println("My first numer: " + number);

            int secondNumber;
            secondNumber = 10;
            System.out.println("My second numer: " +secondNumber);

            String text = "My first string!";
            text += "!!!";
            System.out.println(text);

            boolean logicValue = true;
            System.out.println(logicValue);

            int add = 3;
            add += 2;

            System.out.println(add);

            System.out.println("3 + 2= " + (3 + 2));
            System.out.println("3 * 2= " + 3 * 2);
            System.out.println("3 - 2= " + (3 - 2));
            System.out.println("10 / 2= " +10 / 2);


            int age = 20;
            System.out.println("wartosc age: " + age);
            age++;
            System.out.println("wartosc age zwiekszona: " + age);
            age--;
            System.out.println("wartosc age zmniejszona: " + age);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Jak masz na imie?");
            String name = scanner.nextLine();
            System.out.println("Witaj " + name);

            System.out.println("Prosze podaj pierwszą liczbę");
            int userFirstNumber = scanner.nextInt();


            System.out.println("Prosze podaj druga liczbę");
            int userSecondNumber = scanner.nextInt();

            System.out.println("Wynik ich dodawania to:");
            System.out.println(userFirstNumber + userSecondNumber);


        }
    }