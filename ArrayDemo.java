package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element :" + (i + 1));
            int x = sc.nextInt();
            al.add(x);
        }
        System.out.println(al);
        System.out.println("Enter the Element for which you want to check for Majority :");
        int y = sc.nextInt();
        int count = 0;

        for (int j = 0; j < n; j++) {
            if (y == al.get(j)) {
                count++;
            }
        }
        if (count >= (n / 2)) {
            System.out.println(y + " is Majority Element");
        } else {
            System.out.println(y + " is not Majority Element");
        }
        sc.close();

    }
}
