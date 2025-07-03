// Copy Constructor
// Implement a copy constructor in a class Person that copies data from another object.

public class copy_constructor {
    String name;
    long roll;
    
    copy_constructor(String name, long roll){
        this.name = name;
        this.roll=roll;
    }

    copy_constructor(copy_constructor other){
        this.name = other.name;
        this.roll = other.roll;
    }

    void display(){
        System.out.println("Name is: " +name + " aand Roll is: "+ roll);
    }

    public static void main(String[] args) {
        copy_constructor person = new copy_constructor("Sayan Dan" , 230340940011L);
        copy_constructor person2 = new copy_constructor(person);

        System.out.println("Original name and Roll is: ");
        person.display();
        System.out.println("Copy name and Roll is: ");
        person2.display();
    }
}
