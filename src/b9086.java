import java.util.Scanner;

public class b9086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            String sa = s.next();
            char frist = sa.charAt(0);
            char end = sa.charAt((sa.length() - 1));

            System.out.print(frist);
            System.out.println(end);


        }

    }
}
