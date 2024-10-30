package models;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static void sound(int intensidad){
        System.out.print("W");
        for (int i = 0; i < intensidad; i++){
            System.out.print("o");
        }
        System.out.println("f!");
    }
    private static void action(){
        System.out.println("The dog attacks you!");
    }
}
