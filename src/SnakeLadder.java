public class SnakeLadder {
    public static final int START_POSITION =0;
    public static final int IS_SNAKE =1;
    public static final int IS_LADDER =2;
    public static final int NO_PLAY =0;

    public static void setPlayerMoves(){
        int playerPosition=0;
        while(playerPosition<100){
            int diceNumber = (int) ((Math.random() * 10 % 6) + 1);
            int option = (int) ((Math.random() * 10 % 3) + 1);

            if (option == IS_SNAKE) {
                playerPosition -= diceNumber;
            }
            if(option == IS_LADDER) {
                playerPosition += diceNumber;
            }
            if(option==NO_PLAY) {
                System.out.println("NO Play");
            }
            if(playerPosition<START_POSITION){
                playerPosition=START_POSITION;
            }

            System.out.println("Player position: "+playerPosition);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        setPlayerMoves();
        System.out.println("Player has won");
    }
}
