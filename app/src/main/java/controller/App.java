package controller;

import model.Game;
import view.EnglishView;
//import view.SwedishView;
//import view.View;

/**
 * Starts the application using the console.
 */
public class App {
  
  /**
   * Starts the game.

  * @param args Not used.
  */
  public static void main(String[] args) {

    Game g = new Game(); 
    EnglishView v = new EnglishView();
    //View swe = new SwedishView();
    Player ctrl = new Player(g, v);

    while (ctrl.play()) {

    }
  }
}