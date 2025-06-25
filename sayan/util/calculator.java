package sayan.util;

import sayan.geometry.Rectangle1;
import sayan.geometry.circle;

public class calculator {
    public static void main(String[] args) {
        circle cir = new circle(5.5);
        Rectangle1 rec = new Rectangle1(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radious, 2);
        double recArea = rec.length * rec.breadth;
        System.out.printf("Area of a Circle is : %f , Area of A Rectangle is %f", cirArea, recArea);
    }
}
