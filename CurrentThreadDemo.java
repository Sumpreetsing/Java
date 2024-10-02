public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current name of thread is :  " + t);
        t.setName("mythread");
        System.out.println("after setting name :   " + t);
        System.out.println("only thread name :  " + t.getName());
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread is interrupted");
        }
        System.out.println("After catch blocks");

    }
}
