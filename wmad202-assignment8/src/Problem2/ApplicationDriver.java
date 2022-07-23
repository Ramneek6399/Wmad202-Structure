package Problem2;

import static java.lang.Math.sqrt;

public class ApplicationDriver {
    public enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }


    public static void main(String args[]) {


        int[] s1Sides = {10, 20};
        Shape s1 = new Shape(ShapeType.Rectangle, s1Sides) {
            @Override
            Float perimeter() {
                if (this.sides.length == 2) {
                    return Float.valueOf(this.sides[0] * 2 + this.sides[1] * 2);
                } else {
                    return Float.valueOf(-1);
                }
            }

            @Override
            Float area() {
                if (this.sides.length == 2) {
                    return Float.valueOf(this.sides[0] * this.sides[1]);
                }
                return Float.valueOf(-1);
            }
        };
        System.out.println("S1's perimeter is: " + s1.perimeter());
        System.out.println("S1's area is: " + s1.area());


        int[] s2sides = {10};
        Shape s2 = new Shape(ShapeType.Square, s2sides) {
            @Override
            Float perimeter() {
                return Float.valueOf(this.sides[0] * 4);
            }

            @Override
            Float area() {
                return Float.valueOf(this.sides[0] * this.sides[0]);
            }
        };
        System.out.println("S2's perimeter is: " + s2.perimeter());
        System.out.println("S2's area is: " + s2.area());


        int[] s3sides = {12};
        Shape s3 = new Shape(ShapeType.Circle, s3sides) {
            private final float PI = 3.14f;

            @Override
            Float perimeter() {
                return this.sides[0] * 2 * PI;
            }

            @Override
            Float area() {
                return this.sides[0] * this.sides[0] * PI;
            }
        };
        System.out.println("S2's perimeter is: " + s3.perimeter());
        System.out.println("S2's area is: " + s3.area());

        int[] s4sides = {8, 12, 12};
        Shape s4 = new Shape(ShapeType.Triangle, s4sides) {
            @Override
            Float perimeter() {
                return Float.valueOf(this.sides[0] + this.sides[1] + this.sides[2]);
            }

            @Override
            Float area() {
                if (this.sides.length == 3) {
                    float height = (float) Math.sqrt(Math.pow(this.sides[1], 2) - Math.pow(this.sides[0] / 2f, 2));
                    return height * this.sides[1] / 2;
                } else {
                    return -1f;
                }
            }
        };
        System.out.println("S4's perimeter is: " + s4.perimeter());
        System.out.println("S4s area is: " + s4.area());
    }
}