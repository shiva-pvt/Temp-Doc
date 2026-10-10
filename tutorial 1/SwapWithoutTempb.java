class SwapWithoutTemp {
    public static void main(String args[]) {
        int roll1 = 101;
        int roll2 = 202;

        roll1 = roll1 + roll2;
        roll2 = roll1 - roll2;
        roll1 = roll1 - roll2;

        System.out.println("Roll Number 1 = " + roll1);
        System.out.println("Roll Number 2 = " + roll2);
    }
}