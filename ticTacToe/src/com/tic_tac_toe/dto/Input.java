package com.tic_tac_toe.dto;

public class Input {
    private int row;
    private int column;

    public Input(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
