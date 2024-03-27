package practice;

class Gm {
    Gm() {

    }

    int l, b, r;

    public int area(int l) {
        return l * l;

    }

    public int area(int l, int b) {
        return l * b;

    }

    public double area(float r) {
        return 3.14 * r * r;

    }
}

class Square extends Gm {

}

class Rectangle extends Gm {
    @Override
    public int area(int l, int b) {
        return super.area(l, b);
    }

}

class Circle extends Gm {
    @Override
    public int area(int r) {
        return super.area(r);
    }

}

public class Geometry {
    public static void main(String[] args) {
        Gm square = new Gm();
        int reslut = square.area(10);
        System.out.println(reslut);
    }

}
