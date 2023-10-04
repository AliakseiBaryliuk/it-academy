package by.itacademy.brest.class6_extra1;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        char currentPlayer = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            // Отображение текущего состояния игрового поля
            displayBoard(board);

            // Попросить текущего игрока сделать ход
            System.out.print("Игрок " + currentPlayer + ", введите номер строки (0, 1, 2): ");
            int row = scanner.nextInt();
            System.out.print("Введите номер столбца (0, 1, 2): ");
            int col = scanner.nextInt();

            // Проверить, что введенные координаты допустимы
            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;

                // Проверить, выиграл ли текущий игрок
                if (isWinner(board, currentPlayer)) {
                    displayBoard(board);
                    System.out.println("Игрок " + currentPlayer + " выиграл!");
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    displayBoard(board);
                    System.out.println("Ничья!");
                    gameOver = true;
                } else {
                    // Переключить игрока
                    currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("Недопустимый ход. Попробуйте снова.");
            }
        }

        scanner.close();
    }

    // Метод для отображения текущего состояния игрового поля
    public static void displayBoard(char[][] board) {
        System.out.println("  0 1 2");
        for (int row = 0; row < 3; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col]);
                if (col < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("  -----");
            }
        }
    }

    // Метод для проверки допустимости хода
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    // Метод для проверки, выиграл ли игрок
    public static boolean isWinner(char[][] board, char player) {
        // Проверка по строкам, столбцам и диагоналям
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    // Метод для проверки, заполнено ли поле
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

