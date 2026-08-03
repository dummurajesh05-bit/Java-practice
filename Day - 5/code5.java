import java.util.Scanner;
class code5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, digit;
        while(num > 0){
                digit = num % 10;
                sum = sum + (digit * digit * digit);
                num /= 10;
        }
        if(sum == num){
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}  