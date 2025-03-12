/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tictactoe;

/**
 *
 * @author felix
 */
public interface TicTacToeInterface {
    public void makeMove(int row, int col, char player);
    public boolean isWinner(char player);
    public boolean isFull();
}
