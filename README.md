# Tic Tac Toe Game

A simple console-based Tic Tac Toe game in Java using the MVVM (Model-View-ViewModel) architecture. The game supports two players who take turns marking a 3x3 grid until one wins or the game ends in a draw.

## Table of Contents
- [Project Structure](#project-structure)
- [Game Rules](#game-rules)
- [Setup](#setup)
- [Running the Game](#running-the-game)
- [Gameplay](#gameplay)
- [Example Output](#example-output)
- [Code Highlights](#code-highlights)
- [License](#license)

## Project Structure

- **`com.tic_tac_toe.dto`**: Contains data classes.
    - **`Input`**: Represents a player's input move (row and column).

- **`com.tic_tac_toe.model`**: Core game logic.
    - **`ModelScreen`**: Manages game mechanics like move validation, checking win conditions, and updating the grid.

- **`com.tic_tac_toe.view`**: User interface for input and display.
    - **`ViewScreen`**: Takes user input, displays the grid, and provides feedback.

- **`com.tic_tac_toe.modelView`**: Acts as an intermediary between `ModelScreen` and `ViewScreen`.
    - **`ModelViewScreen`**: Coordinates input, updates, and output between the model and view.

- **Main Class**: Entry point to start the game.

## Game Rules

1. Players take turns entering their moves. Player 1 uses "X" and Player 2 uses "O".
2. A player wins by getting 3 of their symbols in a row, column, or diagonal.
3. The game ends when:
    - One player wins.
    - The board is full and no player has won, resulting in a draw.

## Setup

### Prerequisites

- Java 8 or higher
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a command-line interface with `javac` and `java` commands installed.

### Running the Game

1. Clone this repository or download the code.
2. Compile the code using your IDE or command line.
3. Run the `Main` class to start the game.



Tic Tac Toe Appp
Rules of the game:
1. Players take turns entering their moves. One player uses "X", and the other uses "O".
2. A player wins by getting 3 of their symbols in a row, column, or diagonal.
3. The game ends when:
    - One of the players wins.
    - The board is filled, and no player has won (i.e., a draw).
````
Now, the move of player 1
Enter the row (1-3): 1
Enter the column (1-3): 1
X | _ | _ |
_ | _ | _ |
_ | _ | _ |

...
````


## folder structure
````
tic_tac_toe_project/ 
                ├── src/
                │ ├── com/tic_tac_toe/
                │ │ ├── dto/
                │ │ │ └── Input.java # Data transfer object for player moves
                │ │ ├── model/ 
                │ │ │ └── ModelScreen.java # Core game logic and validation 
                │ │ ├── modelView/
                │ │ │ └── ModelViewScreen.java # Mediator between Model and View 
                │ │ ├── view/ 
                │ │ │ └── ViewScreen.java # UI for user input and output 
                │ ├── Main.java # Entry point to start the game 
                └── notes.md # Project overview and instructions
````



This structure helps organize the code into packages following the MVVM pattern:

- **`dto`**: Contains data transfer objects used to encapsulate player input data.
- **`model`**: Contains the core game logic.
- **`modelView`**: Acts as an intermediary between the model and the view.
- **`view`**: Handles the user interface, managing input and output.

# Tic Tac Toe Game - Java

## UML Class Diagram Overview

The diagram will include the following key classes:

- **Main**
- **ModelScreen**
- **ModelViewScreen**
- **ViewScreen**
- **Input**

## Class Diagram Components

### Main
The entry point of the application.

- **Attributes**: None
- **Methods**: `main(String[] args)`

### ModelScreen
Handles the game logic, including managing the grid, validating moves, and checking for wins or draws.

- **Attributes**:
    - `char[][] grid` (private)
    - `char winner` (private)
    - `int winnerNo` (private)
    - `ModelViewScreen modelViewScreen` (private)
- **Methods**:
    - `ModelScreen()` (constructor)
    - `void startTheGame()`
    - `boolean validateTheInput(Input userInput)`
    - `boolean checkForWin()`
    - `boolean checkForRepetation(Input userInput)`
    - `void updateTheGrid(Input userInput, int whichPlayer)`
    - `boolean checkInRow(int row)`
    - `boolean checkInColumn(int col)`
    - `boolean checkForDiagonal()`

### ModelViewScreen
Acts as a ViewModel, interacting between ModelScreen and ViewScreen, taking input and updating the view.

- **Attributes**:
    - `ViewScreen viewScreen` (private)
    - `ModelScreen modelScreen` (private)
- **Methods**:
    - `void startTheApp()`
    - `Input takeInput(int player)`
    - `void giveMessage()`
    - `void printTheGrid()`
    - `void printForRepetaion()`
    - `void drawn()`
    - `void declareWin(char winner, int winnerNo)`

### ViewScreen
Handles the UI interaction, such as displaying the game grid, taking input, and printing messages.

- **Attributes**:
    - `Scanner scanner` (private)
- **Methods**:
    - `void printTheGrid(char[][] grid)`
    - `void showRules()`
    - `void printTheRules(String rules)`
    - `Input takeInput(int player)`
    - `void giveMessage()`
    - `void printForRepetation()`
    - `void matchDrawn()`
    - `void declareWin(char winner, int winnerNo)`
    - `void printTheDiagonal(int i)`

### Input
A simple DTO (Data Transfer Object) to encapsulate a player's input (row and column).

- **Attributes**:
    - `int row` (private)
    - `int column` (private)
- **Methods**:
    - `Input(int row, int column)` (constructor)
    - `int getRow()`
    - `int getColumn()`

## UML Diagram Visualization

To create the actual UML diagram, you can use tools like Lucidchart, draw.io, or UMLet. Here’s a textual representation of how the relationships might look:





# ticTacToe
<h1>Screenshots</h1>

![Screenshot (490)](https://github.com/user-attachments/assets/a7710535-70f7-464c-bd31-ab0afa323390)
![Screenshot (491)](https://github.com/user-attachments/assets/d3279f28-5a95-406b-abc8-5e569911efdf)
![Screenshot (492)](https://github.com/user-attachments/assets/255be4ca-f687-4613-bfb6-72be6858fc2a)
