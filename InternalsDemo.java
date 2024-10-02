import java.util.Scanner;

class Internals {
    private int ia1;
    private int ia2;
    private int ia3;
    private int cta;
    public int sum = 0;

    Internals(int ia1, int ia2, int ia3, int cta) {
        this.ia1 = ia1;
        this.ia2 = ia2;
        this.ia3 = ia3;
        this.cta = cta;
    }

    public int computeCIE() {

        if (ia1 >= ia2 && ia3 >= ia2) {
            sum = (ia1 + ia3) + cta;
        } else if (ia1 >= ia3 && ia2 >= ia3) {
            sum = (ia1 + ia2) + cta;
        } else if (ia2 >= ia1 && ia3 >= ia1) {
            sum = (ia2 + ia3) + cta;
        }
        return sum;
    }

    public char computeGrade() {
        if (sum >= 45 && sum <= 50) {
            return 'S';
        } else if (sum >= 40 && sum <= 44) {
            return 'A';
        } else if (sum >= 35 && sum <= 39) {
            return 'B';
        } else if (sum >= 30 && sum <= 34) {
            return 'C';
        } else if (sum >= 25 && sum <= 29) {
            return 'D';
        } else if (sum >= 20 && sum <= 24) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

public class InternalsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter IA-1 marks scored in oop out of 20");
        int Ia1 = sc.nextInt();
        System.out.println("enter IA-2 marks scored in oop out of 20");
        int Ia2 = sc.nextInt();
        System.out.println("enter IA-3 marks scored in oop out of 20");
        int Ia3 = sc.nextInt();
        System.out.println("enter CTA marks");
        int Cta = sc.nextInt();

        Internals i = new Internals(Ia1, Ia2, Ia3, Cta);
        int cie = i.computeCIE();
        char grade = i.computeGrade();
        System.out.println("Total marks :" + cie + " " + "Grade :" + grade);

    }
}
