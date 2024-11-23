import java.util.Scanner;

public class b8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = input.nextInt();
        int sum = 0;
        for (int i = 1; i < user + 1; i++) {
            sum += i;

        }
        System.out.print(sum);

    }
}
