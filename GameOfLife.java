/**
* @Author: Abdullah Najjar
* @filename GameOfLife.java
* Description: John Conway's game (Game of Life) implementation, where I implementated as a
* to be read from an input file and drew the structures to be generated using the StdDraw
* library.
* Date: 3 April, 2020
* @Version 1.0
* Bugs: Add methods for inheritence and then add implements GameOfLife to the Life file
*/
import java.util.Scanner;
import java.io.File;

public interface GameOfLife
{


  /**
   * Method used to clear the board from the previous values of r and c
   * @param NA
   * @return NA
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public void clearBoard();


  /**
   * Accessor for being Born
   * @param r Integer
   * @param int Integer
   * PRE: Board hold the values of r and c in states other than isBorn
   * POST: Board hold the values of r and c in state of isBorn
   */
  public void setBorn(int r, int c);


  /**
   * Accessor for being Occupied
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c in states other than Occupied
   * POST: Board hold the values of r and c in state of Occupied
   */
  public void setOccupied(int r, int c);


  /**
   * Accessor for Dying
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public void setDying(int r, int c);


  /**
   * Accessor for being Free
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public void setFree(int r, int c);


  /**
   * Assign to BeingBorn state
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public boolean isBorn(int r, int c);


  /**
   * Assign to Free state
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public boolean isFree(int r, int c);


  /**
   * Method used to Assign to Dying state
   * @param r Integer
   * @param c Integer
   * @return NA
   * PRE: Board hold the values of r and c alive
   * POST: The values of r and c are dead
   */
  public boolean isDying(int r, int c);


  /**
   * Assign to Occupied state
   * @param r Integer
   * @param c Integer
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public boolean isOccupied(int r, int c);


  /**
   * Method To fill the board using an input file
   * @param NA
   * @return NA
   * PRE: Board hold the values of r and c
   * POST: Board is cleared
   */
  public void fillBoard(Scanner inputFile);

}
