package com.tic_tac_toe.model;

import com.tic_tac_toe.dto.Input;
import com.tic_tac_toe.modelView.ModelViewScreen;

import java.util.Arrays;

public class ModelScreen {
public  static  char[][] grid = new char [3][3];
private static char winner ='n';
private static  int winerNo = 0;
private  static ModelViewScreen modelViewScreen = new ModelViewScreen();
public  ModelScreen(){
    for (char[] el : grid) {
        Arrays.fill(el,'b');
    }
}


    public void startTheGame() {
    boolean finished = false;
    int whichPlayer = 1;
    int count =0;

    while (!finished){

        Input userInput =  modelViewScreen.takeInput(whichPlayer);
        if (validateTheInput(userInput)){


           if (checkForRepetation(userInput)){
               modelViewScreen.printForRepetaion();
           }
           else {
               whichPlayer = whichPlayer==1?2:1;
               updateTheGrid(userInput,whichPlayer);
               count++;
           }

           if (count>=5){
               if (checkForWin())
               {
                   modelViewScreen.declareWin(winner,winerNo);
               }
           }

           if (count==9){
               modelViewScreen.drawn();
           }

        }
        else {
            modelViewScreen.giveMessage();
        }
    }

    }

    private boolean checkForWin() {
    boolean r1 = checkInRow(0);
    boolean r2 = checkInRow(1);
    boolean r3 = checkInRow(2);
    boolean c1 = checkInColumn(0);
    boolean c2 = checkInColumn(1);
    boolean c3 = checkInColumn(2);

    boolean d = checkForDiagonal();

    return (r1 || r2 || r3 ||c1 || c2 || c3 ||d);
    }

    private boolean checkForDiagonal() {
    char a = grid[0][0];
    boolean d1 = (a== grid[1][1] && a == grid[2][2]);
    if (d1) {
        winner = a;
        winerNo = 6;
    }

    char b = grid[2][0];

    boolean d2 = (b== grid[1][1] && a == grid[0][2]);
    if (d2 ) {
        winner = b;
        winerNo = 7;
    }
    return  d1 || d2;
    }

    private boolean checkInColumn(int col) {
        char ch = grid[0][col];
        boolean ans =   ((ch==grid[1][col])&&( ch== grid[2][col]));
        if (ans) {
            winner = ch;
            winerNo = 3+col;
        }
        return ans;
    }

    private boolean checkInRow(int row) {
    char ch = grid[row][0];
    boolean ans =  ((ch==grid[row][1])&&( ch== grid[row][2]));
    if (ans) {
        winner = ch;
        winerNo = row;
    }
    return ans;
    }

    private boolean checkForRepetation(Input userInput) {
        int c = userInput.getColumn();
        int r = userInput.getRow();
         return (grid[r-1][c-1] == 'X')||(grid[r-1][c-1]=='O');
    }

    private void updateTheGrid(Input userInput, int whichPlayer) {
        int c = userInput.getColumn();
        int r = userInput.getRow();
    grid[r-1][c-1] = whichPlayer==1?'X':'O';
    modelViewScreen.printTheGrid();
    }

    private boolean validateTheInput(Input userInput) {
    int c = userInput.getRow();
    int r = userInput.getRow();

    return   (r>0 && r<=3) && (c>0 && c<=3);
    }
}
