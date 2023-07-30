import java.util.Random;

public abstract class Nut extends Entity {

  private final int TOTAL_NO_NUTS = 5;
  private final int nutrionPoints;
  private String name;
  private final String[] NUT_TYPES;
  private final int[] VALID_ROW = new int[5];
  private final int[] VALID_COL = new int[5];
  private Maze maze;

    public Nut(int row,int col, char symbol)
    {
      super(row, col, symbol);
      nutrionPoints = 0;
      NUT_TYPES= new String[5];
    }

    @Override
    public void create()
    {
      createNuts();
      createValidPos();
    }

    public void createNuts()
    {
      Random nutCreator = new Random();
      int randomPos;

      for (int i = 0; i < TOTAL_NO_NUTS; i++)
      {
        randomPos = nutCreator.nextInt(2);
        if (randomPos == 0)
        {
          name = "Almond";
        }
        else
        {
          name = "Peanut";
        }
        NUT_TYPES[i] = name;
      }
    }

    public int createValidRow()
    {
      Random nutCreator = new Random();
      int randomRow = nutCreator.nextInt(20);

      return randomRow;
    }

    public int createValidCol()
    {
      Random nutCreator = new Random();
      int randomCol = nutCreator.nextInt(50);

      return randomCol;
    }

    public void createValidPos()
    {
      for (int i = 0; i < TOTAL_NO_NUTS; i++)
      {
        int nutRow = createValidRow();
        int nutCol = createValidCol();

        for (int j = 1; j < TOTAL_NO_NUTS; j++)
        {
          if(i != j && VALID_ROW[i] == VALID_ROW[j] && VALID_COL[i] == VALID_COL[j])
          {
            nutRow = createValidRow();
            nutCol = createValidCol();
          }
        }

        while(!maze.available(nutRow, nutCol))
        {
          nutRow = createValidRow();
          nutCol = createValidCol();
        }
        VALID_ROW[i] = nutRow;
        VALID_COL[i] = nutCol;
      }
    }

    public abstract void putNuts();
//    {

//    }

}
