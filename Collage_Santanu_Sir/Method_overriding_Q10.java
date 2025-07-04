
class Animal {
    void eat() {
        System.out.println("Animals eats food");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dod eat meet");
    }

    void sound() {
        System.out.println("The Dog barks");
    }
}

public class Method_overriding_Q10 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
    }
}
