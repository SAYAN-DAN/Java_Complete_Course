
class Animal {
    void eat() {
        System.out.println("The Animals eat food");
    }

    void run() {
        System.out.println("Animals run fast");
    }
}

class cat extends Animal {
    void eat() {
        super.eat();
        System.out.println("The Cat eat Fish");
    }

    void sound() {
        System.out.println("The sound of cat is meao.. meao..");
    }
}

class Kitten extends cat {
    void eat() {
        super.eat();
        System.out.println("The kitten drink Milk");
    }
}

public class multilevel_inheritance_Q11 {
    public static void main(String[] args) {
        Kitten cati = new Kitten();
        cati.eat();
        cati.sound();
        cati.run();
        // cat parentcat = new cat();
        // parentcat.eat();
        // Animal parenrAnimal = new Animal();
        // parenrAnimal.eat();
    }
}

// in thev same code I use method overridden and Multilevel inheritance bth of them
