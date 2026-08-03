class code5 {
    public static void main(String[] args) {

        int i = 5, j = 5;

        i = i++ * i++ * i++;

        System.out.println(i);

        j = ++j * ++j * ++j;

        System.out.println(j);
    }
}