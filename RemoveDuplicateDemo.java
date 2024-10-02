class Remove {
    private int[] a;
    private int count = 0;

    Remove(int[] a) {
        this.a = a;
    }

    public int removeDuplicate() {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (j + 1 <= a.length - 1) {
                        a[j] = a[j + 1];
                        a[j + 1] = 0;
                    } else {
                        a[j] = 0;
                    }

                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                count++;
            }
        }

        return count;
    }

    public void display() {
        for (int j = 0; j < a.length; j++)
            System.out.println(a[j]);
    }
}

public class RemoveDuplicateDemo {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 3, 4 };
        Remove r = new Remove(a);
        int res = r.removeDuplicate();
        System.out.println("total no of unique elements in the array is :" + res);
        r.display();
    }
}