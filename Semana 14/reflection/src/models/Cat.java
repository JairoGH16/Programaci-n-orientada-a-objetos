package models;

public class Cat {
    private String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private static void sound(int intensidad){
        System.out.print("M");
        for (int i = 0; i < intensidad; i++){
            System.out.print("e");
        }
        System.out.println("ow!");
        }
    private static void action() {
        System.out.println("The cat jumps over you!");
    }
}
