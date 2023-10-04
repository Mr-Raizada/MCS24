class Figure {
    double sidea;
    double sideb;

    Figure(double a, double b) {
        sidea = a;
        sideb = b;
    }

    Figure(double a) {
        sidea = a;
        sideb = a;
    }

    double area() {
        System.out.println("Area inside the figure is Undefined.");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("The Area of a Rectangle : ");
        return sidea * sideb;
    }
}

class Square extends Figure {
    Square(double a) {
        super(a);
    }

    double area() {
        System.out.println("Area of Square: ");
        return sidea * sidea;
    }
}

class Area_Override {
    public static void main(String[] args) {
        Figure f = new Figure(20.9, 67.9);
        Rectangle r = new Rectangle(34.2, 56.3);
        Square s = new Square(29.5);

        System.out.println("***** Welcome to the Override Demo ****");
        f.area();
	f = r;
        System.out.println(" " + f.area());
	f = s;					  // Changed println to print
        System.out.println(" " + f.area());  // Changed println to print
    }
}
