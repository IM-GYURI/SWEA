import java.util.Scanner;

class D1_2071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            float sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += sc.nextInt();
            }
            System.out.println("#" + i + " " + Math.round(sum / 10));
        }
    }
}