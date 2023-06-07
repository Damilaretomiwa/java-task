//public class Game {
//    private static final int BOARD_SIZE = 3;
//    private static final char[] PLAYERS = {'X', 'O'};
//
//    private char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
//    private int currentPlayerIndex = 0;
//    private int moves = 0;
//
//    public Game() {
//        for (int i = 0; i < BOARD_SIZE; i++) {
//            for (int j = 0; j < BOARD_SIZE; j++) {
//                board[i][j] = ' ';
//            }
//        }
//    }
//
//    private void printBoard() {
//        for (int i = 0; i < BOARD_SIZE; i++) {
//            for (int j = 0; j < BOARD_SIZE; j++) {
//                System.out.print(board[i][j]);
//                if (j < BOARD_SIZE - 1) {
//                    System.out.print("|");
//                }
//            }
//            System.out.println();
//            if (i < BOARD_SIZE - 1) {
//                System.out.println("-+-+-");
//            }
//        }
//    }
//
//    private boolean isMoveValid(int row, int col) {
//        return row >= 0 && row < BOARD_SIZE && col >= 0 && col < BOARD_SIZE && board[row][col] == ' ';
//    }
//
//    private void makeMove(int row, int col) {
//        board[row][col] = PLAYERS[currentPlayerIndex];
//        moves++;
//        if (moves >= 5 && (
//                board[row][0] == board[row][1] && board[row][1] == board[row][2] ||
//                        board[0][col] == board[1][col] && board[1][col] == board[2][col] ||
//                        board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
//                        board[0][2] == board[1][1] && board[1][1] == board[2][0]
//        )) {
//            System.out.println(PLAYERS[currentPlayerIndex] + " wins!");
//            System.exit(0);
//        } else if (moves == BOARD_SIZE * BOARD_SIZE) {
//            System.out.println("It's a tie!");
//            System.exit(0);
//        }
//        currentPlayerIndex = (currentPlayerIndex + 1) % PLAYERS.length;
//    }
//
//    public void play() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            printBoard();
//            System.out.println(PLAYERS[currentPlayerIndex] + "'s turn.");
//            System.out.print("Enter row number (1-3): ");
//            int row = scanner.nextInt() - 1;
//            System.out.print("Enter column number (1-3): ");
//            int col = scanner.nextInt() - 1;
//            if (isMoveValid(row, col)) {
//                makeMove(row, col);
//            } else {
//                System.out.println("That spot is already taken or out of range. Try again.");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        new Game().play();
//    }
//}
//
//
