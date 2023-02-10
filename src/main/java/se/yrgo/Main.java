package se.yrgo;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("knut was here");
	System.out.println("david was here");
        System.out.println("rasmus was here");

        odourGenerator hello = new odourGenerator();
        System.out.print("\nYou smell like ");
        System.out.print(hello.giveMeASmell(ThreadLocalRandom.current().nextInt(10)));
        System.out.print(" today, good sir!");
    }
}
