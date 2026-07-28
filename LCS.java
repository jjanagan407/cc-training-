import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        int l1 = s1.length();
        int l2 = s2.length();
        int[][] arr = new int[l2 + 1][l1 + 1];

        for (int i = 1; i <= l2; i++) {
            for (int j = 1; j <= l1; j++) {
                if (s2.charAt(i - 1) == s1.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }

        System.out.println(arr[l2][l1]);

        for (int i = 0; i <= l2; i++) {
            for (int j = 0; j <= l1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}