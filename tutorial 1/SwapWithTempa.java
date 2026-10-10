class SwapWithTempa {
    public static void main(String args[]) {
        int roll1 = 101;
        int roll2 = 202;

        int temp = roll1;
        roll1 = roll2;
        roll2 = temp;

        System.out.println("Roll Number 1 = " + roll1);
        System.out.println("Roll Number 2 = " + roll2);
    }
}