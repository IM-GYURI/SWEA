import java.util.Scanner;

class D1_1936 {
    /*
     * A가 이기는 경우
     * A = 1, B = 3
     * A = 2, B = 1
     * A = 3, B = 2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 && b == 3) {
            System.out.println("A");
        }
        else if (a == 2 && b == 1) {
            System.out.println("A");
        }
        else if (a == 3 && b == 2) {
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
    }
}