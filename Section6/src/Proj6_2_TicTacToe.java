import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {

        startGame();

    }

    public static void startGame() {
        String[][] gameBoard = new String[3][3];
        int turn = 1;
        initializeGame(gameBoard);

        System.out.println("Welcome to Cross and Square game: ");
        printBoard(gameBoard);
        System.out.println();
        System.out.println("The X player starts, provide a numbers separated by \n space for [Column] and [Row] respectively: ");

        while(!isFull(gameBoard)) {
            int[] coord;
            coord = userAction(gameBoard);

            if(isWinner(coord[0], coord[1])) {
                System.out.println("Congratulation Player: ");
                if(turn % 2 != 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
                System.out.print(" won the game!");
                System.out.println("After: " + turn + "turns");
            } else if(turn % 2 != 0){
                gameBoard[coord[0]][coord[1]] = "X";
                turn++;
            } else {
                gameBoard[coord[0]][coord[1]] = "O";
                turn++;
            }

            printBoard(gameBoard);
            System.out.println("Do you want to start game again?");
        }

    }

    public static void initializeGame(String[][] emptyBoard) {
        for (String[] strings : emptyBoard) {
            Arrays.fill(strings, " ");
        }
    }

    public static void printBoard(String[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(" " + gameBoard[i][j] + " ");
                if(j < 2) {
                    System.out.print("|");
                }
            }
            if(i < 2) {
                System.out.println();
                System.out.println("-----------");
            }
        }
    }

    public static int[] userAction(String[][] board) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int[] temp = new int[2];
        temp[0] = Integer.parseInt(input.substring(0,1)) - 1;
        temp[1] = Integer.parseInt(input.substring(2,3)) - 1;

        if(isOccupied(temp, board)) {
            System.out.print("Sorry this cell is already occupied, try different one: ");
            return userAction(board);
        }
        return temp;
    }

    public static boolean isOccupied(int[] cell, String[][] board) {
        return !board[cell[0]][cell[1]].equals(" ");
        }

    public static boolean isFull(String[][] board) {
        int spaceNumb = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j].equals(" ")) {
                    spaceNumb++;
                }
            }
        }
        return spaceNumb == 0;
    }

    public boolean isWinner(int row, int col){
        String Player = gameBoard[row][col];

        int r = row;
        int c = col;

        boolean onDiagonal = (row == col) || (col == -1 * row + (board.length-1));
        boolean HorizontalWin = true, VerticalWin = true;
        boolean DiagonalWinOne = true, DiagonalWinTwo = true;

        // Check the rows and columns
        for(int n = 0; n < board.length; n++){
            if(!board[r][n].equals(Player))
                HorizontalWin = false;
            if(!board[n][c].equals(Player))
                VerticalWin = false;
        }

        // Only check diagonals if the move is on a diagonal
        if(onDiagonal){
            // Check the diagonals
            for(int n = 0; n < board.length; n++){
                if(!board[n][n].equals(Player))
                    DiagonalWinOne = false;
                if(!board[n][-1*n+(board.length-1)].equals(Player))
                    DiagonalWinTwo = false;
            }
        }
        else{
            DiagonalWinOne = false;
            DiagonalWinTwo = false;
        }

        boolean hasWon = (HorizontalWin || VerticalWin || DiagonalWinOne || DiagonalWinTwo);

        return hasWon;

    }
}
