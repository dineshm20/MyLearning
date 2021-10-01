package Hello; //my code

public class Hello {
    int x = 1000;
    byte z = 1;
    byte y = (byte) x; // explicit cast
    int y1 = z; // implicit cast
    String empname; //test for github
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

    double getDiscount(int price) { // 0.00
        double discount = 1;
        discount = price * (20 / 100);
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
        double result2 = h.getDiscount(price);
        System.out.println(result2);
        System.out.println("Hello World");
        byte b = 20;
        System.out.println("b=" + b);
        short s = 21;
        System.out.println("s=" + s);
        int i = 11;
        System.out.println("i=" + i);
        long l = 12;
        System.out.println("l=" + l);
        float f = 2.1f;
        System.out.println("f=" + f);
        double d = 0.000000001;
        System.out.println("d=" + d);
        char c1 = '$';
        System.out.println("c1=" + c1);
        char c2 = '@';
        System.out.println("c2=" + c2);
        char c3 = 'a';
        System.out.println("c3=" + c3);
        boolean b1 = true;
        System.out.println("true?=" + b1);
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