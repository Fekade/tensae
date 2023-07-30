

public abstract class Entity
{
  private char symbol;
  private int row;
  private int col;
  //private Entity entity;

  public Entity(char symbol);
  //int row, int col, char symbol)
  {
  //  this.row = row;
    //this.col = col;
    this.symbol = symbol;
    //this.put(this.row, this.col);
  }
  //abstract method
  public abstract void create()
  {

  }

  public int getRow()
  {
    return row;
  }

  public int getCol()
  {
    return col;
  }

  // public char getSymbol()
  // {
  //   return this.symbol;
  // }
  public Entity put(int newRow, int newCol)
  {
    Entity oldEntity = Maze.getMaze()[newRow][newCol];
    Maze.getMaze()[newRow][newCol] = this;
    return oldEntity;
  }
  @Override
  public String toString()
  {
    return symbol + "";
  }
}
