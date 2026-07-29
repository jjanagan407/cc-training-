import java.util.Scanner;

class NumberSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            arr[i] = sum;
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
