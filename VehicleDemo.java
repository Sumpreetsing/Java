class Vehical {
    private int wheel_no;

    Vehical(int wheel_no) {
        this.wheel_no = wheel_no;
    }

    void display() {
        System.out.println("No. of wheels are :" + wheel_no);
    }

}

class Car extends Vehical {
    private String eng_no;
    private String cha_no;
    private String manufac;

    Car(String eng_no, String cha_no, String manufac) {
        super(4);
        this.eng_no = eng_no;
        this.cha_no = cha_no;
        this.manufac = manufac;
    }

    void display() {

        super.display();
        System.out.println("Engine number of car :" + eng_no + "  " + "Chassis number of car :" + "  " + cha_no
                + "  " + "Manufacturer of car :" + manufac);
    }
}

class Truck extends Vehical {
    private String eng_no;
    private String cha_no;
    private String manufac;

    Truck(String eng_no, String cha_no, String manufac) {

        super(12);
        this.eng_no = eng_no;
        this.cha_no = cha_no;
        this.manufac = manufac;
    }

    void display() {
        super.display();
        System.out.println("Engine number of Truck :" + eng_no + "  " + "Chassis number of Truck :" + cha_no
                + "  " + "Manufacturer of Truck :" + manufac);
    }
}

class Bike extends Vehical {
    private String eng_no;
    private String cha_no;
    private String manufac;

    Bike(String eng_no, String cha_no, String manufac) {

        super(2);
        this.eng_no = eng_no;
        this.cha_no = cha_no;
        this.manufac = manufac;
    }

    void display() {
        super.display();
        System.out.println("Engine number of Bike :" + eng_no + "  " + "Chassis number of Bike :" + cha_no
                + "  " + "Manufacturer of Bike :" + manufac);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car c = new Car("PJ2165", "LHGCM2435", "SWIFT");
        Truck t = new Truck("PRE12345", "LKJ15432", "VRL");
        Bike b = new Bike("GTR1678", "KLI8765", "HONDA");
        c.display();
        t.display();
        b.display();
    }

}