import java.util.Scanner;

public class b1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        int inputValue2 = sc.nextInt();


        if (inputValue == inputValue2) {
            System.out.println("==");
        } else if (inputValue > inputValue2) {
            System.out.println(">");
        } else {
            System.out.println("<");
        }


    }
}
