import java.util.*;
class code3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input : ");
        int num = sc.nextInt();
        int f1 = 0, f2 = 1, f3 = 0; 
        for(int i = 1;i<=num;i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        System.out.println("Fibnocci series: " + f3);
    }
        }
        
}