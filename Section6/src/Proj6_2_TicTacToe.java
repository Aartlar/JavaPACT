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

        while(!isFull(gameBoard) && !isWinner(turn, gameBoard)) {
            int[] coord;
            coord = userAction(gameBoard);

             if(turn % 2 != 0){
                gameBoard[coord[0]][coord[1]] = "X";
             } else {
                gameBoard[coord[0]][coord[1]] = "O";
             }

             turn++;
             printBoard(gameBoard);
        }

        System.out.println("Congratulation Player: ");
        if(turn % 2 == 0) {
            System.out.print("X");
        } else { System.out.print("O"); }

        System.out.print(" won the game!");
        System.out.println();
        System.out.println("After: " + turn + "turns");
        System.out.println("Do you want to start game again?");
        startGame();
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

                if(j < 2) { System.out.print("|"); }

            }
            if(i < 2) {
                System.out.println();
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    public static int[] userAction(String[][] board) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int[] temp = new int[2];
        temp[0] = Integer.parseInt(input.substring(0,1)) - 1;
        temp[1] = Integer.parseInt(input.substring(1,2)) - 1;

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

                if(board[i][j].equals(" ")) { spaceNumb++; }

            }
        }
        return spaceNumb == 0;
    }

    public static boolean isWinner(int turn, String[][] board) {
        int rowWin = 0;
        int colWin = 0;
        int diagWin = 0;

        //Row check,
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(turn % 2 == 0) {
                    if(board[i][j].equals("X")) { rowWin++; }
                } else {
                    if(board[i][j].equals("O")) { rowWin++; }
                }
            }
            System.out.println("row" + rowWin);
            if(rowWin == 3) {
                return true;
            } else { rowWin = 0; }
        }

        //Col check,
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(turn % 2 == 0) {
                    if(board[j][i].equals("X")) { colWin++; }
                } else {
                    if(board[j][i].equals("O")) { colWin++; }
                }
            }
            System.out.println("col" + colWin);
            if(colWin == 3) {
                return true;
            } else { colWin = 0; }
        }

        //Diagonal check, 1
        for(int i = 0; i < board.length; i++){
            if(turn % 2 != 0) {
                if(board[i][i].equals("X")) { diagWin++; }
            } else {
                if(board[i][i].equals("O")) { diagWin++; }
            }
        }

        if(diagWin == 3) {
            return true;
        } else {diagWin = 0;}

        //Diagonal check, 2
        for(int i = board.length - 1; i >= 0; i--){
            if(turn % 2 != 0) {
                if(board[i][i].equals("X")) { diagWin++; }
            } else {
                if(board[i][i].equals("O")) { diagWin++; }
            }
        }

        if(diagWin == 3) { return true; }

        return false;
    }
}
