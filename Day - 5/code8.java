import java.util.Scanner;
class code8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        String term = "1";
        for(int i = 1;i<=a;i++){
            System.out.print(term);
            StringBuilder str = new StringBuilder();
            int j = 0;
            while(j < term.length()){
                char currentChar = term.charAt(j);
                int count = 1;
                while(j + 1 < term.length() && term.charAt(j + 1) == currentChar){
                    count++;
                    j++;
                }
                str.append(count).append(currentChar);
                i++;
            }
            term = str.toString();
            

        }
    }
}