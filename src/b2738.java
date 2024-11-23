import java.util.Scanner;

public class b2738 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        ;
        int[][] array1 = new int[a][b];
        int[][] array2 = new int[a][b];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array1[i][j] + array2[i][j] + " ");
                //줄띄우기 위해서
                if (j == b - 1) {
                    System.out.println();
                }
            }
        }

    }
}
