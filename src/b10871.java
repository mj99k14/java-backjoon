import java.util.Scanner;

public class b10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int[] c = new int[a];

        for (int i = 0; i < c.length; i++) {
            int d = s.nextInt();
            c[i] = d;
        }

        for (int value : c) {
            if (value < b) {
                System.out.print(value + " ");

            }
        }

    }
}
