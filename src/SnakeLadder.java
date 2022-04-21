public class SnakeLadder {
    public static final int START_POSITION = 0;
    public static final int IS_SNAKE = 1;
    public static final int IS_LADDER = 2;
    public static final int NO_PLAY = 0;

    static int playerPosition = 0;
    static int diceNumber = 0;

    public static void setPlayerMoves() {
        while (playerPosition < 100) {
            diceNumber = (int) ((Math.random() * 10 % 6) + 1);
            int option = (int) ((Math.random() * 10 % 3) + 1);

            if (option == IS_SNAKE) {
                playerPosition -= diceNumber;
            } else if (option == IS_LADDER) {
                playerPosition += diceNumber;
            } else if (option == NO_PLAY) {
                System.out.println("NO Play");
            }

            if (playerPosition < START_POSITION) {
                playerPosition = START_POSITION;
            } else if (playerPosition > 100) {
                playerPosition -= diceNumber;
            }
            System.out.println("Player position: " + playerPosition);
        }
    }

    public static void playUntilWin() {
        while (playerPosition != 100) {
            setPlayerMoves();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        playUntilWin();
        System.out.println("Player has won");
    }
}
