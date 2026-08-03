import java.util.*;
class code4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input : ");
        int num = sc.nextInt();
        int sum = 0,digit;
        while(num > 0){
            digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}