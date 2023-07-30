public class Cashew extends Nut
{
  private int nutrionPoints;

  public PoisonousCashew (int row, int col, char symbol)
  {
    super(row, col, symbol);
    nutrionPoints = -15;
    this.symbol = 'C';
    this.create();
    this.putNuts();
  }

  @Override
  public putNuts()
  {
    for(int i = 0; i <TOTAL_NO_NUTS; i++)
    {
      if(nutType[i] == "PoisonousCashew")
      {
        this.put(validRow[i], validCol[i]);
      }
    }
  }
}
