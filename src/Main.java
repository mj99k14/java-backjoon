import java.util.Scanner;  // Scanner 클래스 가져오기

public class Main {
    public static void main(String[] args) {
        // Scanner 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        String words = scanner.nextLine();

        System.out.println(words + "??!");
        scanner.close();

    }

}




