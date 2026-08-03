class code8 {
    public static void main(String[] args) {

        int i = 1, j = 0;

        if (i-- == j) {
            System.out.println(--i);
        } else {
            System.out.println(++i);
        }
    }
}