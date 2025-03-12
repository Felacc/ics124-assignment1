/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tictactoe;

import java.util.Arrays;

/**
 *
 * @author felix
 */
public class TicTacToeBoard implements TicTacToeInterface {
    
    private char[][] board;
  
    public TicTacToeBoard() {
        this.board = new char[3][3];
    }
    
    @Override
    public void makeMove(int row, int col, char player) {
        this.board[row][col] = player;        
    }

    @Override
    public boolean isWinner(char player) {
        boolean isWon = false;
        
        // check rows
        for (int i = 0; i < board.length; i++) { // for each row
            for (int j = 0; j < board[i].length; j++) { // iterate through each column
                if (board[i][j] == player) {  // check if the all the squares in the row are filled with the same character
                    isWon = true;
                } else {
                    isWon = false;
                }
                
                if (isWon == false) { // move to next row if any spaces don't contain the player's character
                    break;
                }
            }
            
            if (isWon == true) { // if they are all the same characters, return true, else reset to false
                return isWon;
            }
        }
        
        // check columns
        for (int i = 0; i < board.length; i++) { // for each column
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) { // check if all values have player character
                    isWon = true;
                    return isWon;
                }
        }
        
        // check diagonals - use hardcoded values to check each diagonal line
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            isWon = true;
            return isWon;
        } else if (board[2][0] == player && board[1][1] == player && board[0][2] == player) {
            isWon = true;
            return isWon;
        }
        
        // else the game is not won by given player
        return isWon;
    }

    @Override
    public boolean isFull() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (this.board[i][j] == '\0') { // checks for null character in any of the spaces, if there is the board is not full
                return false;
                }
            }
        }
        
        return true;
    } 
    
}
