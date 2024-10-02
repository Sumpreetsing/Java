package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enetr number of elements of first array");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element :" + (i + 1));
            arr1.add(sc.nextInt());
        }
        System.out.println("Enter number of elements of second array");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element :" + (i + 1));
            arr2.add(sc.nextInt());
        }
        System.out.println("Common elements of both strings are :");
        for (int j = 0; j < n1; j++) {
            for (int k = 0; k < n2; k++) {
                if (arr1.get(j) == arr2.get(k)) {
                    System.out.println(arr1.get(j));
                }
            }

        }
        sc.close();
    }
}
