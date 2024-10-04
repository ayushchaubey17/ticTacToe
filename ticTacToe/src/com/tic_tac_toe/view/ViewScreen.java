package com.tic_tac_toe.view;
import com.tic_tac_toe.dto.Input;
import java.util.Scanner;

import static com.tic_tac_toe.model.ModelScreen.grid;
import static java.lang.System.in;

public class ViewScreen {
    private  static Scanner scanner = new Scanner(in);
    public void printTheGrid(char [][] grid){
       for(char [] el:grid){
           for (char ele:el) System.out.print((ele=='b'?'_':ele) +" | ");
           System.out.println();
       }
    }

    public void showRules() {
        String rules = """
                1.  Players take turns entering their moves. One player uses "X", and the other uses "O"
                --2.  A player wins by getting 3 of their symbols in a row, column, or diagonal.
               -- 3.  The game ends when:
                    - One of the players wins.
                    - The board is filled, and no player has won (i.e., a draw).
                """;

        printTheRules(rules);
    }

    private void printTheRules(String rules) {
      String arr[] =   rules.split("--");
      for(String el: arr){
          System.out.print(el);
          try {

              Thread.sleep(400);
          } catch (InterruptedException e) {
              System.out.println(e);
          }
      }
        System.out.println();
    }

    public Input takeInput(int player) {
        System.out.println("Now, the move of player "+player);
        System.out.println("in which row you want to insert between 1 to 3");
        int r = scanner.nextInt();
        System.out.println("in which column you want to insert between 1 to 3");
        int c = scanner.nextInt();
        return   new Input(r, c);
    }

    public void giveMessage() {
        System.out.println("please press valid row or column ");
    }

    public void printForRepetation() {
        System.out.println("This place is already filled please select another place");

    }

    public void matchDrawn() {
        System.out.println("Match is drawn");
        System.exit(0);
    }

    public void declareWin(char winner, int winerNo) {
        if (winner== 'X'){
            System.out.println("player 2 is winner");
        }
        else {
            System.out.println("player 1 is winnner");
        }

        if (winerNo >= 6){
            printTheDiagonal(7-winerNo);
        }



        System.exit(0);
    }

    private void printTheDiagonal(int i) {

            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++){
                    try {
                        System.out.print((i == 1) && (j == k) ? grid[j][k] : " ");
                        System.out.print((i == 0) && ((j + k) == 2) ? grid[j][k] : " ");
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println();
            }

    }
}
