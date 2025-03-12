/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe;
import ics124.utils.UnitTest;
/**
 *
 * @author felix
 */
public class TestingObjects {

    /**
     * @param args the command line arguments
     */
    UnitTest tests;
    
    public static void main(String[] args) {
        TestingObjects me = new TestingObjects();
        me.run();
    }
    
    public TestingObjects() {
        tests = new UnitTest();
        tests.initTests();
    }
    
    public void run() {
        TicTacToeBoard b = new TicTacToeBoard();
//        b.makeMove(0, 0, 'X');
//        b.makeMove(2, 0, 'O');
//        b.makeMove(1, 1, 'X');
//        b.makeMove(1, 0, 'O');
//        b.makeMove(2, 2, 'X');
//        tests.assertIsTrue(b.isWinner('X'), "X should win on diagonal");
//        tests.assertIsFalse(b.isWinner('O'), "O should lose");
//        tests.assertIsFalse(b.isFull(), "board is not full");
//        System.out.println(tests.summarizeTests());

        b.makeMove(0, 2, 'x');
        b.makeMove(2,2, 'o');
        b.makeMove(2, 0, 'x');
        b.makeMove(0,0, 'o');
        b.makeMove(1, 1, 'x');
        tests.assertIsTrue(b.isWinner('x'), "x should win on diag");
        tests.assertIsFalse(b.isWinner('o'), "o should lose");
        tests.assertIsFalse(b.isFull(), "board is not full");
        System.out.println(tests.summarizeTests());
        
        for (int i = 0; i < 2; i++) {
            for (int j =0; j< 3; j++){
                b.makeMove(i, j, 'o');
            }
        }
        System.out.println(b.isFull());
    }
    
}
