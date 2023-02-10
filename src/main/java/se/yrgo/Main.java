package se.yrgo;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("knut was here");
	System.out.println("david was here");
<<<<<<< HEAD
	System.out.println("and here also");
=======
        System.out.println("rasmus was here");

        odourGenerator hello = new odourGenerator();
        System.out.print("\nYou smell like ");
        System.out.print(hello.giveMeASmell(ThreadLocalRandom.current().nextInt(10)));
        System.out.print(" today, good sir!");
        for (int i = 0; i < 100; i++) {
            System.out.println("RASMUS WAS HERE AGAIN!!!");
        }
        System.out.println("rwh");
        System.out.println("rwh");
	System.out.println("send me fucking main");
>>>>>>> e164e17d544340306d4f1d134c4ace6637614f44
    }
}
