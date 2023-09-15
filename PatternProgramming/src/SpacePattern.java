import java.util.Scanner;

public class SpacePattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the col: ");
        int c = sc.nextInt();
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <=c ; j++) {
//                System.out.print("*");
                if (i==1 || i==3 || i==4 || i==r || j==1 || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
