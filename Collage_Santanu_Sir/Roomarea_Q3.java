
class Room {
    float height;
    float breath;

    void getdata(float a, float b) {
        height = a;
        breath = b;
    }
}

public class Roomarea_Q3 {
    public static void main(String[] args) {
        float area;
        Room input = new Room();
        input.getdata(25, 12);
        area = input.height * input.breath;
        System.out.println("Area: " + area);
    }
}
