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

    for (int eRow = 0; eRow < gameboard.length; eRow++)
    {
      for (int eCol = 0; eCol < gameboard[0].length; eCol++)
      {
        int random = (int)(Math.random()*end);
        Tile currentTile = new Tile(tileValues[random]);
        tileValues[random] = tileValues[end-1];
        gameboard[eRow][eCol] = currentTile;
        end--;
        System.out.println(gameboard[eRow][eCol]);
      }
    }
  }
}
