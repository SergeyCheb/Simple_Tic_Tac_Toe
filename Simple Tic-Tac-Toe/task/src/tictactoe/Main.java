package tictactoe;

import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMoveX = true;
        boolean gameEnd = false;
        char[][] field = new char[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                field[i][j] = ' ';
            }
        }
        System.out.println("---------");
        for (int i = 0; i < field.length; ++i) {
            System.out.print("| ");
            for (int j = 0; j < field[i].length; ++j) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
        boolean notNumber = false;
        //boolean okEnter = false;
        int coorX;
        int coorY;
        System.out.print("Enter the coordinates: ");
        while (!gameEnd) {
            String xLine = scanner.next();
            String yLine = scanner.next();
            char[] xArCh = xLine.toCharArray();
            char[] yArCh = yLine.toCharArray();
            //Here we are checking if the last two inputs is a numeric values.
            //For it each element of arrays must be a digit. (We will do it by means of the ASCII table).
            //If it is so, then we will check they for exceeding of required range.
            //Otherwise, we will inform user about it.
            for (char i : xArCh) {
                if ((int) i < 48 || (int) i > 57) {
                    notNumber = true;
                    break;
                } else {
                    notNumber = false;
                }
            }
            if (!notNumber) {
                for (char i : yArCh) {
                    if ((int) i < 48 || (int) i > 57) {
                        notNumber = true;
                        break;
                    } else {
                        notNumber = false;
                    }
                }
            }
            if (notNumber) {
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                continue;
            } else {
                coorX = Integer.valueOf(xLine);
                coorY = Integer.valueOf(yLine);

            }
            if (coorX < 1 || coorX > 3 || coorY < 1 || coorY > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("Enter the coordinates: ");
                continue;
            } else {
                if (field[coorX - 1][coorY - 1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                    System.out.print("Enter the coordinates: ");
                    continue;
                } else {
                    if (isMoveX) {
                        field[coorX - 1][coorY - 1] = 'X';
                        isMoveX = false;
                    } else {
                        field[coorX - 1][coorY - 1] = 'O';
                        isMoveX = true;
                    }
                    System.out.println("---------");
                    for (int i = 0; i < field.length; ++i) {
                        System.out.print("| ");
                        for (int j = 0; j < field[i].length; ++j) {
                            System.out.print(field[i][j] + " ");
                        }
                        System.out.println("|");
                    }
                    System.out.println("---------");
                    // Here it is checked if an empty cells is remained:
                    int _Count = 0;
                    for (char[] i : field) {
                        for (char j : i) {
                            if (j == ' ') {
                                ++_Count;
                            }
                        }
                    }
                    // Here it is checked if there are lines already filled by Xs or Os:
                    boolean LineX = false;
                    boolean LineO = false;
                        //horizontals check
                        for (int i = 0; i < field.length; ++i) {
                            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]) {
                                if (field[i][0] == 'X') {
                                    LineX = true;
                                } else if (field[i][0] == 'O') {
                                    LineO = true;
                                }
                            }
                        }
                        //verticals check
                        for (int i = 0; i < 3; ++i) {
                            if (field[0][i] == field[1][i] && field[1][i] == field[2][i]) {
                                if (field[0][i] == 'X') {
                                    LineX = true;
                                } else if (field[0][i] == 'O') {
                                    LineO = true;
                                }
                            }
                        }
                        //diagonals check
                        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                            if (field[0][0] == 'X') {
                                LineX = true;
                            } else if (field[0][0] == 'O') {
                                LineO = true;
                            }
                        }
                        if (field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                            if (field[0][2] == 'X') {
                                LineX = true;
                            } else if (field[0][2] == 'O') {
                                LineO = true;
                            }
                        }
                        //Here the program makes a decision what it will have to do next:
                    if (LineX) {
                        System.out.println("X wins");
                        gameEnd = true;
                    } else if (LineO) {
                        System.out.println("O wins");
                        gameEnd = true;
                    } else if (_Count == 0) {
                        System.out.println("Draw");
                        gameEnd = true;
                    } else {
                        System.out.print("Enter the coordinates: ");
                    }
                }
            }
        }
    }
}