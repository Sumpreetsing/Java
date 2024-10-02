import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        if (args.length != 2) {
            System.out.println("Usage: java CopyFileDemo <source> <destination>");
            return;
        }
        try {
            fis = new FileInputStream(args[0]);
            fos = new FileOutputStream(args[1]);
            do {
                i = fis.read();
                if (i != -1) {
                    fos.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading or writing file" + e);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing input stream" + e);
            }

            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing output stream" + e);
            }
        }

    }
}