class code10 {
    public static void main(String[] args) {

        int i = 0, j = 0;

        if (i++ == j++) {
            System.out.println(i-- + "\n" + j--);
        } else {
            System.out.println(--i + "\n" + --j);
        }
    }
}