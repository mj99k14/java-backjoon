import java.util.Scanner;

public class b2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //3개 입력받아욤
        int sum = 0;
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        // 같은 숫자 3개 10000 + 같은숫자 *1000
        if (a == b && b == c) {
            sum = a * 1000 + 10000;
            //같은 숫자 2개 1000 + 같은숫자 *100
        } else if (((a == b) && (a != c)) || ((c == b) && (c != a)) || ((a == c) && (a != b))) {
            if ((a == b) && (a != c)) {
                sum = a * 100 + 1000;
            } else if ((c == b) && (c != a)) {
                sum = c * 100 + 1000;
            } else {
                sum = a * 100 + 1000;
            }
            //모두다른 눈  젤큰눈 * 100
        } else {
            sum = Math.max(Math.max(a, b), c) * 100;
        }
        System.out.println(sum);

    }

}
