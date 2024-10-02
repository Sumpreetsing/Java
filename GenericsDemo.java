class Gen<T> {
    T a;

    Gen(T ob) {
        a = ob;
    }

    T value() {
        return a;
    }

    void typeOf() {
        System.out.println("type of T is :" + a.getClass().getName());
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(112);
        System.out.println("value is :" + g.value());
        g.typeOf();
        Gen<String> g2 = new Gen<String>("Sumpreetsing");
        System.out.println("value is :" + g2.value());
        g2.typeOf();
        Gen<Boolean> g3 = new Gen<Boolean>(true);
        System.out.println("value is :" + g3.value());
        g3.typeOf();
    }

}
