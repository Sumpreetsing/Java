package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindElementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        System.out.println("Enter the number of emelents which you want to add in array 1 :");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element :" + (i + 1));
            int x = sc.nextInt();
            arr.add(x);
            arr3.add(x);
        }
        System.out.println("Enter the number of emelents which you want to add in array 2 :");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element :" + (i + 1));
            int x = sc.nextInt();
            arr2.add(x);
            arr3.add(x);
        }
        System.out.println("Array 1 :" + arr);
        System.out.println("Array 2 :" + arr2);
        Collections.sort(arr3);
        System.out.println("Sorted array after combining two arrays :" + arr3);
        System.out.println("Enter the index k :");
        int k = sc.nextInt();
        if (k <= (n1 + n2)) {
            System.out.println("Element at index " + k + " is :" + arr3.get(k));
        } else {
            System.out.println("Index out of bound");
        }
        sc.close();

    }
}
