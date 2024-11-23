import java.util.Scanner;

public class b2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        for (int s = 1; s < 10; s++) {
//                System.out.print(choice +"*"+s +"="+ choice*s,"\n",);

            System.out.printf("%d * %d = %d\n", choice, s, choice * s);
        }

    }
}
