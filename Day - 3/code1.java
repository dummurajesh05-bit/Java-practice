import java.util.Scanner;

class code1{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
                case 3,4,5:
                System.out.println("Summer");
                break;
                case 6,7,8:
                System.out.println("Rainy");
                break;
                case 9,10,11:
                System.out.println("spring");
                break;
                case 12,1,2:
                System.out.println("winter");
                break;
        
        default:
            System.out.println("Invalid Input");
        }    

    }
}