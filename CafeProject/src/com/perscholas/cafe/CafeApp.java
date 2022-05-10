package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {

        Product coffee = new Product("coffee", 3.5, "tasty");
        Product espresso = new Product("espresso", 4.5, "hot");
        Product cappuccino = new Product("cappuccino", 5.5, "extra tasty");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the quantity of coffe?");
        int coffeeNumber = sc.nextInt();

        System.out.println("What is the quantity of expresso?");
        int espressoNumber = sc.nextInt();

        System.out.println("What is the quantity of cappuccino?");
        int cappuccinoNumber = sc.nextInt();

        sc.close();

        coffee.setQuantity(coffeeNumber);
        espresso.setQuantity(espressoNumber);
        cappuccino.setQuantity(cappuccinoNumber);

        System.out.println();

    }

}