package com.company;

import java.util.Scanner;

public class DoWhile {

            public void main(String[] args) {
            System.out.println("Pobierz liczbe: ");
            Scanner scanner = new Scanner(System.in);

            int liczba = scanner.nextInt();

            do {
                System.out.println("Bomba wybuchnie za " + liczba);
                liczba--;
            } while (liczba >= 1);
        }
    }
