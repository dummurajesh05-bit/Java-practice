
class Main{
    public static void main(String[] args){
        
        int n = 5;
        int b;
        System.out.println(n);
        b = n++;
        System.out.println(n);
        System.out.println(b);
        b = --n;
        System.out.println(n);
        System.out.println(b);
        b = ++n;
        System.out.println(n);
        System.out.println(b);
        b = n--;
        System.out.println(n);
        System.out.println(b);
    }
}