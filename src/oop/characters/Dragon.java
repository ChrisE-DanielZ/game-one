package oop.characters;

public class Dragon extends Enemy{

    public Dragon() {
        super(200, 100, 500, 1000, 1500);
    }

    public void fly() {
        System.out.println("Flying");
    }

    public void attack() {
        System.out.println("Breathe fire!");
    }



}
