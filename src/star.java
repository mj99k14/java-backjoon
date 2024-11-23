import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("몇개 그리고싶노");
        int user = s.nextInt();

        for(int i = 1; i <=user; i++){
            for(int s1 = 1; s1 <= i; s1++ ){
                System.out.print("*");
            }
            System.out.println();

        }


        for (int i = 1;i < user; i++){
            for (int ss = user - 1; ss >i ;ss--){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
