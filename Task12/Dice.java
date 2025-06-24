public class Dice {

    int roll() {
        int random = (int) Math.ceil(Math.random() * 6);
        return random;
    }

    public static void main(String[] args) {
        Dice dice = new Dice();
        for (int i = 0; i < 10; i++) {
            int result = dice.roll();
            System.out.println(result);
        }
    }
}
