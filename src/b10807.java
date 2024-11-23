import java.util.Scanner;

public class b10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        int count = s.nextInt();
        int b[] = new int[count];
        for (int i = 0; i < b.length; i++) {
            int ss = s.nextInt();
            b[i] = ss;
        }
        int bb = s.nextInt();
        for (int value : b) {
            if (value == bb) {
                a++;
            }
        }
        System.out.println(a);
    }
}
