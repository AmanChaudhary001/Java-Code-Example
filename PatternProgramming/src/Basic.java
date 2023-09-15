import java.util.Scanner;

public class Basic {
    public static class pattern{
        void pattern1(int n){
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=2*i-1 ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        void pattern2(int n){
            for (int i = n; i >=1; i--) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=2*i-1 ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pattern pp = new pattern();
        System.out.println("Enter the row: ");
        int n = sc.nextInt();
        pp.pattern1(n);
        System.out.println();
        pp.pattern2(n);



    }
}
