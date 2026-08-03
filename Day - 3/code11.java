class code11 {
    public static void main(String[] args) {

        int t = 6;

        switch (t) {

            default:
                t += 2;

            case 4:
                t = 4;

            case 5:
                t++;

                break;
        }

        System.out.println(t);
    }
}