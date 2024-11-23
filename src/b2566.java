import java.util.Scanner;

public class b2566 {
    public static void main(String[] args) {
        int[][] max = new int[9][9];
        int max1 = max[0][0];
        int maxRow = 1, maxCol = 1; // 위치 초기화 (1부터 시작)
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < max.length; i++) {
            for (int j = 0; j < max[i].length; j++) {
                max[i][j] = s.nextInt();
                if (max1 < max[i][j]) {
                    max1 = max[i][j];
                    // 값이 클떄만 증가하기때문에 ㄱㅊ
                    maxRow = i + 1; // 행 위치 (1부터 시작)
                    maxCol = j + 1; // 열 위치 (1부터 시작)

                }
            }

        }
        System.out.println(max1);
        System.out.println(maxRow + " " + maxCol);

    }
}
