
class Animal {
    void eat() {
        System.out.println("Animals eats food");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("The Dog barks");
    }
}

public class Simple_inheritance_Q9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
    }
}
