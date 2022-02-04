package com.company;

import java.util.Scanner;

public class If {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ile masz lat?");
            int age = scanner.nextInt();

            if(age >=65){
                System.out.println("jestes emerytem");
            } else {
                System.out.println("jestes osoba aktywna zawodowo");
            }


            System.out.println("koniec działa programu");
        }
    }

