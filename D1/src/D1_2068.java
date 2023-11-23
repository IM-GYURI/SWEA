import java.util.Arrays;
import java.util.Scanner;

class D1_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            int[] intArray = new int[10];
            for(int j = 0; j < 10; j++) {
                intArray[j] = sc.nextInt();
            }
            Arrays.sort(intArray);
            System.out.println("#" + i + " " + intArray[9]);
        }
    }
}