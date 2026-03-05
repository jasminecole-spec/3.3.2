/*
 * Activity 3.3.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
    Tile[][] gameboard = new Tile[3][4];
    int end = tileValues.length;

    for (Tile[] eRow : gameboard)
    {
      for (Tile currentTile : eRow)
      {
          int random = (int)(Math.random()*end);
          currentTile = new Tile(tileValues[random]);
          end--;
      }
    }
    
    for (int row = 0; row < gameboard.length; row++)
    {
      for (int col = 0; col < gameboard[0].length; col++)
      {
        System.out.println(gameboard[row][col]);
      }
    }
    
  }
}
