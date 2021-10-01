package Hello; //my code

public class Hello {
    int x = 1000;
    byte z = 1;
    byte y = (byte) x; // explicit cast
    int y1 = z; // implicit cast
    String empname; // test for github
    String gundu = "hello";
    int empid = 1;
    int price = 100;
    static int instituecode = 1100;
    static {
        System.out.println("Welcome to studytonight.com");
        System.out.println("This is static block");

    }

    void display() {
        final int dinesh = 0;
        System.out.println(dinesh);
    }

    public static double getDiscount(int price) { // 0.00
        double discount;
        discount = price + 1;
        return discount; // 0.00
    }

    public static void main(String args[]) {
        int price = 999;
        Hello h = new Hello();
        System.out.println(h.y);
        h.display(); // calling a method
        System.out.println(h.empid); // object variable
        System.out.println(Hello.instituecode); // static variable(if a var is declared as static, v can access it using
                                                // classname.varname)
        // float result=h.getDiscount(h.price);
        // System.out.println(result);
        double result2 = getDiscount(price);
        System.out.println(result2);

        // if else
        if (h.gundu == "hello") {
            System.out.println("Hello World");
        } else {
            byte b = 20;
            System.out.println("b=" + b);
        }
        int i = 11;
        short s = 21;
        // if else ladder
        if (s == 20) {
            System.out.println("s=" + s);
        } else if (i == 10) {

            System.out.println("i=" + i);
        } else {
            long l = 12;
            System.out.println("l=" + l);
        }
        float f = 2.1f;
        double d = 0.000000001;
        // nested if
        if (f == 2.1f) {
            if (d == 0.000000001) {
                if (price == 999) {
                    System.out.println("f=" + f);
                    System.out.println("d=" + d);
                }
            } else {
                System.out.println("stupid fellow ans is wrong");
            }
        }
        char c1 = '$';
        System.out.println("c1=" + c1);
        char c2 = '@';
        System.out.println("c2=" + c2);
        char c3 = 'a';
        System.out.println("c3=" + c3);
        boolean b1 = true;
        System.out.println("true?=" + b1);
        // switch case
        char n = 'b';
        switch (n) {
            case 'a':
                System.out.println("zero");
                break;
            case 'b':
                System.out.println("one");
                break;
            default:
                System.out.println("muttal");
        }

        // for loop
        int m, num = 1, c;
        for (m = 1; m <= 10; m++) {
            int result = m * num;
            System.out.println(+num + "x" + m + "=" + result);
        }
        //factorialclea
        int nu = 5, Fact=1;
        for (i = 1; i <= nu; i++)  {
			Fact = Fact * i;
		}
        System.out.println(Fact);

    }

    static {
        System.out.println("Welcome to studytonight.com");
        System.out.println("This is static block2");

    }
    static {
        System.out.println("Welcome to studytonight.com");
        System.out.println("This is static block3");

    }

}
// Java program will be compiled to .class
// Then .class will be loaded by class loader
// Then bytcode verifier will verify the illegal codes
// Then interpreter will execute step by step
// local variable, instance variable, static variable
// instance variable scope depends on access modifiers - public, private,
// default