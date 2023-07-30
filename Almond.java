public class Almond extends Nut
{
  private int nutrionPoints;

  public Almond(int row, int col, char symbol)
  {
    super(row, col, symbol);
    nutrionPoints = 5;
    this.symbol = 'A';
    this.create();
    this.putNuts();
  }

  @Override
  public putNuts()
  {
    for(int i = 0; i <TOTAL_NO_NUTS; i++)
    {
      if(nutType[i] == "Almond")
      {
        this.put(validRow[i], validCol[i]);
      }
    }
  }
}
