import java.util.Scanner;
class code7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int a = 0;
        boolean  t = false;
        while(true){
            int tnum = a*(a+1)/2;
            if(tnum == num){
                t = true;
                break;
            }       
            else if(tnum > num){
                break;
            }   
            a++;
        }
        if(t){
            System.out.println("The number is a triangular number.");
        }
        else{
            System.out.println("The number is not a triangular number.");
        }

    }
}