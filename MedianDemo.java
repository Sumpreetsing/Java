package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MedianDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter the length of first array :");
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter element :" + (i + 1));
            int x = sc.nextInt();
            arr1.add(x);
        }
        System.out.println("Enter the length of the second array :");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter element :" + (i + 1));
            int x = sc.nextInt();
            arr2.add(x);
        }
        arr1.addAll(arr2);
        Collections.sort(arr1);
        System.out.println("Sorted array is :" + arr1);
        if ((n1 + n2) % 2 == 0) {
            double med;
            med = (arr1.get(((n1 + n2) / 2) - 1) + arr1.get(((n1 + n2) / 2))) / 2;
            System.out.println("Median of sorted array is :" + med);
        } else {
            System.out.println("Median of sorted array is :" + arr1.get(((n1 + n2) / 2)));
        }
        sc.close();

    }

}
