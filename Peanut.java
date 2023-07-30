public class Peanut extends Nut
{
  private int nutrionPoints;

  public Peanut(int row, int col, char symbol)
  {
    super(row, col, symbol);
    nutrionPoints = 10;
    this.symbol = 'P';
    this.create();
    this.putNuts();
  }

  @Override
  public putNuts()
  {
    for(int i = 0; i <TOTAL_NO_NUTS; i++)
    {
      if(nutType[i] == "Peanut")
      {
        this.put(validRow[i], validCol[i]);
      }
    }
  }
}
