import java.util.*;
class pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int a = 65;
        for(int i = n; i>=1;i--){
            for(int j = i; j>=1;j--){
                    System.out.print((char) a++ + " ");
            }
        System.out.println();
        }
    }
}