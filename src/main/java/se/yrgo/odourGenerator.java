package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class odourGenerator {
    private static List<String> odours = new ArrayList<>();

    public odourGenerator(){
        odours.add("banana");
        odours.add("sweat");
        odours.add("fried egg");
        odours.add("coding basement");
        odours.add("freddy mercury");
        odours.add("corpse");
        odours.add("blodpudding");
        odours.add("flower");
        odours.add("worm");
        odours.add("honey");
    }
    public static String giveMeASmell(int randomIntBelow10){
        return odours.get(randomIntBelow10);
    }
}
