// Constructor with Calculation
// Create a class Circle that takes radius in the constructor and calculates area.


public class circle_area_calculation {
    double redious;
    double area;
    circle_area_calculation(double radius){
       area = Math.PI *(radius * radius);
    }

    void display(){
        System.out.println("The area of a Circle is: "+ area);
    }

    public static void main(String[] args) {
        circle_area_calculation cal = new circle_area_calculation(12);
        cal.display();
    }
}
