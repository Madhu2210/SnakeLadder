public class SnakeLadder {
    public static final int START_POSITION =0;
    public static final int IS_SNAKE =1;
    public static final int IS_LADDER =2;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        int currentPosition =0;
        int diceNumber = (int) ((Math.random() * 10 % 6) +1);
        int option = (int)  ((Math.random() * 10 % 3) +1);

        if (option == IS_SNAKE){
            currentPosition -= diceNumber;
        }else if(option == IS_LADDER) {
            currentPosition += diceNumber;
        }
        else {
            System.out.println("NO Play");
        }
    }
}
