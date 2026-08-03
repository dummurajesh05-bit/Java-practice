import java.util.*;
class pattern14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i = n; i>=1;i--){
            for(int j = n; j>= i;j--){
                    System.out.print(i + " ");
            }
        System.out.println();
        }
    }
}