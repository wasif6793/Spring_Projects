package org.wasif;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    public void compile() {
        System.out.printf("Compile Laptop");
    }
}
