package com.company;

    import java.util.Scanner;

    public class ForLoop {
        public static void main(String[] args) {
            System.out.println("Pobierz liczbę: ");
            Scanner scanner = new Scanner(System.in);

            int liczba = scanner.nextInt();
            for (int i = liczba; i >= 0; i--) {
                System.out.println("Wybuch za " + i);
            }
        }
    }

