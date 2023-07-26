package com.qa.classes;

public class Runner {


    public static void main(String[] args) {
        Person p1 = new Person(); // will instantiate a Person object

        p1.setName("Jordan");
        p1.setAge(29);
        p1.setHairColour("black");
        p1.setJob("Trainer");

//        int i;
//        System.out.println(i);

        Person p2 = new Person(); // will instantiate a Person object
        p2.setName("Andy");
        p2.setAge(Integer.MIN_VALUE);
        p2.setHairColour("brown");
        p2.setJob("Trainer");

        p1.intro();
        p2.intro();
        Person p3 = p2;
        p3.intro();
        p3.setName("Andy M");
        p2.intro();
        p3.intro();

        p3 = null;
        p2.intro();
        p3.intro();

        p3 = new Person("Aswene", 24, "Black", "Trainer");
        p3.intro();
    }
}
