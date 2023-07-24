package com.qa.classes;

public class Person {

    // instance variables
    private String name;

    private int age = 1;

    private String hairColour;

    private String job;

    // default constructor - provided by java if you dont create your own
    public Person() {
        super();
    }
    // overloaded my constructor so I can create a blank person or a full one


    public Person(String name, String hairColour, String job) {
        this(name, 0, hairColour, job); // calls another constructor to save on repeating logic
    }

    public Person(String name) {
        super();
        this.setName(name);
    }
//    public Person(String job) { // cant have two methods with the same signature

    // Method used to generate instances of a class
    public Person(String name, int age, String hairColour, String job) {
        super();
        this.setName(name);
        this.setAge(age);
        this.setHairColour(hairColour);
        this.setJob(job);
    }

    public void intro() {
        System.out.println("Hello, my name is " + name + " and I am a " + age + " years old " + job + " with " + hairColour + " hair.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) {
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
