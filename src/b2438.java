import java.util.Scanner;

public class b2438 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        for (int i = 1; i <= choice; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
