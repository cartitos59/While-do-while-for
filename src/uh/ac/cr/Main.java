package uh.ac.cr;

import java.util.Scanner;
public class Main<decision> {

    public static void main(String[] args) {

        //TODO- Create a new class and call it IterativeControl.

        //Do the next operation on the new class created.

        //1- Todo. Ask user how many time he wants to print hello world on screen.
            //1.1- Todo. Print Hello world as many times as user defined. Use a while structure.
        int i=1;//variable de control
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese cuantas veces desea imprimir Hello World.");
        int manytimes1 = scanner1.nextInt();
        while (i<=manytimes1)
        {
            System.out.println("Hello World");
            i++;
        }

            //1.2- Todo. Print Hello world as many times as user defined. Use a for structure.
        System.out.println("-----------------------------");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese cuantas veces desea imprimir Hello World.");
        int manytimes2 = scanner2.nextInt();
        for (i = 1; i<=manytimes2; i++) //toda la estructura del for
        {
            System.out.println("Hello World");
        }

        //2- Todo Print hello world and ask the user if he wants to print hello again using a Do while structure.
        System.out.println("-----------------------------");
        System.out.println("Hello World");
        int user;//declarar desicio de usuario
        do {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("¿Desea imprimir Hello world? 1)SI; 2)NO");
            user = scanner3.nextInt();

        }
        while (user==2);
        {
            System.out.println("Hello World");
        }

        //3- Todo ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.
        Scanner entrada = new Scanner (System.in);
        int n1, n2, result, opcionNun; boolean op = true;
        while (op) {
            System.out.println("******");
            System.out.println("menu");
            System.out.println("1. continuar");
            System.out.println("2. detener");
            opcionNun = entrada.nextInt();
            if (opcionNun == 2) {
                System.out.println("finalizo");
                break;
            } else {
                switch (opcionNun) {
                    case 1:
                        System.out.println("Hello mundo");
                        break;

        //Do all the code needed for the previous items on the class created. Use main just to call the methods.
    }
}}}}
