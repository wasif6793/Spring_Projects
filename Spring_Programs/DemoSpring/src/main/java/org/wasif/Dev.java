package org.wasif;


public class Dev {
    private Computer comp;

    private int age = 19;

    public Dev() {
        System.out.println("Dev Constructor");
    }


//    public Dev(int age) {
//        this.age = age;
//        System.out.println("Dev 1 Constructor");
//    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor using laptop");
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println(age);

        System.out.println("Its Dev class");
        //laptop.compile();
        comp.compile();
    }
}