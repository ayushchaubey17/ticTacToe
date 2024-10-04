package com.tic_tac_toe.modelView;
import com.tic_tac_toe.dto.Input;
import com.tic_tac_toe.model.ModelScreen;
import com.tic_tac_toe.view.ViewScreen;
import static com.tic_tac_toe.model.ModelScreen.grid;

public class ModelViewScreen {
    private ViewScreen viewScreen = new ViewScreen();
    private ModelScreen modelScreen = new ModelScreen();

    public void startTheApp()  {
        viewScreen.showRules();
        viewScreen.printTheGrid(grid);
        modelScreen.startTheGame();




    }


    public Input takeInput(int player) {
        Input userInput = viewScreen.takeInput(player);
        return userInput;
    }

    public void giveMessage() {
        viewScreen.giveMessage();
    }

    public void printTheGrid() {
        viewScreen.printTheGrid(grid);
    }

    public void printForRepetaion() {
        viewScreen.printForRepetation();
    }

    public void drawn() {
        viewScreen.matchDrawn();
    }

    public void declareWin(char winner, int winerNo) {
        viewScreen.declareWin(winner,winerNo);
    }
}
