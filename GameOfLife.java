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
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param NA
   * @return NA
   */
  public void clearBoard();


  /**
   * Accessor for being Born
   * #pre Board hold the values of r and c in states other than isBorn
   * #post Board hold the values of r and c in state of isBorn
   * @param int r
   * @param int c
   */
  public void setBorn(int r, int c);


  /**
   * Accessor for being Occupied
   * #pre Board hold the values of r and c in states other than Occupied
   * #post Board hold the values of r and c in state of Occupied
   * @param int r
   * @param int c
   */
  public void setOccupied(int r, int c);


  /**
   * Accessor for Dying
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param int r
   * @param int c
   */
  public void setDying(int r, int c);


  /**
   * Accessor for being Free
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param int r
   * @param int c
   */
  public void setFree(int r, int c);


  /**
   * Assign to BeingBorn state
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param int r
   * @param int c
   */
  public boolean isBorn(int r, int c);


  /**
   * Assign to Free state
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param int r
   * @param int c
   */
  public boolean isFree(int r, int c);


  /**
   * Method used to Assign to Dying state
   * #pre Board hold the values of r and c alive
   * #post The values of r and c are dead
   * @param int r
   * @param int c
   * @return NA
   */
  public boolean isDying(int r, int c);


  /**
   * Assign to Occupied state
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param int r
   * @param int c
   */
  public boolean isOccupied(int r, int c);


  /**
   * Method To fill the board using an input file
   * #pre Board hold the values of r and c
   * #post Board is cleared
   * @param NA
   * @return NA
   */
  public void fillBoard(Scanner inputFile);

}
