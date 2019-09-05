class StaticSum {
    static int score1 = 20;
    static int score2 = 40;

    private static int sum(){
        return score1+ score2;
    }

    public static void main(String[] args) {

        double total = StaticSum.sum();

        System.out.println(total);
    }
}
