import java.util.*;

class code9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        System.out.print("Enter the table limit: ");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println(i + " * " + no + " = " + (i * no));
        }

        sc.close();
    }
}