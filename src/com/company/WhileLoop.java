package com.company;

    import java.util.Scanner;

        public class WhileLoop {

            public static void main(String[] args) {
                System.out.println("Pobierz liczbe: ");
                Scanner scanner = new Scanner(System.in);
                int liczba = scanner.nextInt();

                while (liczba >= 0) {
                    System.out.println("Wybuch za " + liczba);
                    liczba--;
                }
            }
        }


