import java.util.Scanner;

class D1_2043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for(int i = K; i <= P; i++) {
            count++;
        }
        System.out.println(count);
    }
}