public class constructor_Q5 {

    int length;
    int width;

    constructor_Q5(int x, int y) {
        length = x;
        width = y;
    }

    double area;

    int display() {
        return (length * width);
    }

    class Rectangle {

        public static void main(String[] args) {
            constructor_Q5 area1 = new constructor_Q5(15, 15);
            area1.display();
            System.out.println("The area of the Rectangle is : " + area1);
        }
    }
}
