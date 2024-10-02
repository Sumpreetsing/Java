class Addition extends Thread {
    private int a;
    private int b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
        start();
    }

    public void run() {
        System.out.println("addition result is : " + (a + b));
    }
}

class Substraction extends Thread {
    private int a;
    private int b;

    Substraction(int a, int b) {
        this.a = a;
        this.b = b;
        start();
    }

    public void run() {
        System.out.println("substraction  result is : " + (a - b));
    }
}

class Multiplication extends Thread {
    private int a;
    private int b;

    Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
        start();
    }

    public void run() {
        System.out.println("multiplication result is : " + (a * b));
    }
}

class Division extends Thread {
    private int a;
    private int b;

    Division(int a, int b) {
        this.a = a;
        this.b = b;
        start();
    }

    public void run() {
        System.out.println("division result is : " + (a / b));
    }
}

public class CalculatorThreadsDemo {
    public static void main(String[] args) {
        Addition a = new Addition(10, 5);
        a.run();
        Substraction s = new Substraction(10, 5);
        s.run();
        Multiplication m = new Multiplication(10, 5);
        m.run();
        Division d = new Division(10, 5);
        d.run();

        try {
            a.join();
            s.join();
            m.join();
            d.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
