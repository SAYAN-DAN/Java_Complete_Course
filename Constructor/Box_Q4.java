// Constructor Overloading
// Create a class Box with three overloaded constructors for:

// No argument

// One argument (cube)

// Three arguments (cuboid)



public class Box_Q4 {
     double height;
     double weight;
     double length;
    Box_Q4(){  //no argument
      height = length = weight =1;
    }
    Box_Q4(double side){
         height = length = weight = side;
    }
    Box_Q4(double length,double height,double weight){
        this.height=height;
        this.length = length;
        this.weight = weight;
    }

    void displayvalue(){
        double value = length*height*weight;
        System.out.println("value: " + value);
    }

    public static void main(String[] args) {
        
        Box_Q4 noargbox = new Box_Q4();
        Box_Q4 oneargBox = new Box_Q4(2.5);
        Box_Q4 twoargBox = new Box_Q4(4.5, 3.5,5.5);
        
        noargbox.displayvalue();
        oneargBox.displayvalue();
        twoargBox.displayvalue();
    }
}
