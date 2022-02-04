package com.company;
    import java.util.Scanner;

    public class ArrayList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj liczbę.");
            int i = scanner.nextInt();

            int[] table = new int[i];

            for (i = 0; i < table.length; i++) {
                table[i] = i+1;
                System.out.println("Liczba w tablicy stojaca na indeksie "
                        + i + " jest rowna: " + table[i]);
            }
        }
    }

