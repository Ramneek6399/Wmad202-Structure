package Problem3;

import Problem3.Shape;

public class ApplicationDriver {
    static class mygeometery {
        public void calculateAreaAndPerimeter(Shape shape) {
            if (!shape.shapeType.equals(ShapeType.Custom)) {
                shape.perimeter();
                shape.area();
            } else {
                shape.perimeter();
            }
            System.out.println(shape.perimeter());
            System.out.println(shape.area());
        }
    }


    enum ShapeType {
        Rectangle,
        Triangle,
        Circle,
        Square,
        Custom
    }


    public static void main(String args[]) {
        mygeometery mg= new mygeometery();

        int[] s1Sides = {10, 20};
        ShapeType s1= ShapeType.Rectangle;
        mg.calculateAreaAndPerimeter(new Shape(s1,s1Sides) {
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
        });


        int[] s2sides = {10};
        ShapeType s2= ShapeType.Square;
        mg.calculateAreaAndPerimeter(new Shape(s2,s2sides) {
            @Override
            Float perimeter() {
                return Float.valueOf(this.sides[0] * 4);
            }

            @Override
            Float area() {
                return Float.valueOf(this.sides[0] * this.sides[0]);
            }
        });


        int[] s3sides = {12};
        ShapeType s3= ShapeType.Circle;
        mg.calculateAreaAndPerimeter(new Shape(s3,s3sides){
            private final float PI = 3.14f;

            @Override
            Float perimeter() {
                return this.sides[0] * 2 * PI;
            }

            @Override
            Float area() {
                return this.sides[0] * this.sides[0] * PI;
            }
        });


        int[] s4sides = {8, 12, 12};
        ShapeType s4= ShapeType.Triangle;
        mg.calculateAreaAndPerimeter(new Shape(s4,s4sides) {
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
        });
    }
}
