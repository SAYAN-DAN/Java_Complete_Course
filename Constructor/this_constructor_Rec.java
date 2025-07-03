// Constructor Calling Another Constructor
// Use this() to call one constructor from another in the class Rectangle.


public class this_constructor_Rec {
    int length;
    int breath;

    this_constructor_Rec(){
        this(1,1);
    }
    this_constructor_Rec(int side){
        this(side,side);
    }
    this_constructor_Rec(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    void display(){
        System.out.println("Length is: "+ length + " Breath is: " + breath);
    }

    public static void main(String[] args) {
        this_constructor_Rec defRec = new this_constructor_Rec();
        this_constructor_Rec oneRec = new this_constructor_Rec(5);
        this_constructor_Rec twoRec = new this_constructor_Rec(25,12); 

        defRec.display();
        oneRec.display();
        twoRec.display();
    }
}
