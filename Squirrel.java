

import java.util.Scanner;

public class Squirrel extends Entity implements Movable
{
  private int pointsCollected;
  private int totalNutsEaten;
  private final Scanner in = new Scanner(System.in);
  private Maze maze;

  //private Nut nut;
  //private Peanut peanut;
  //private Almond almond;
  private Entity someNut;

  public Squirrel(int row, int col, char symbol)
  {
    super(row, col, symbol);
    this.symbol = '@';
    pointsCollected = 0;
    totalNutsEaten = 0;
  }


  @Override
  public void create()
  {
    this.processInput();
  }

  public String processInput()
  {
    System.out.println("Enter the Squirrel position (row, column): ");
    String inputPosition;
    inputPosition = in.nextLine();

    if(inputPosition.equalsIgnoreCase("q"))
    {
      System.exit(0);
    }

    while(!this.isValid(inputPosition))
    {
      inputPosition  = in.nextLine();
    }

    return inputPosition;
  }
  public boolean isValid(String inputPosition)
  {
    String[] inputDim = inputPosition.split(",");
    if(inputDim.length != 2)
    {
      System.out.println("Use comma between row and column (row, column)");
      return false;
    }
    this.row = Integer.parseInt(inputDim[0]);
    this.col = Integer.parseInt(inputDim[1]);

    if(!maze.available(this.row, this.col))
    {
      System.out.println("Position not available. Try again!");
      return false;

    }
    System.out.println("User input accepted");
    this.put(row, col);
    return true;
  }

  public int getSquirrelRow()
  {
    return this.row;
  }
  public int getSquirrelCol()
  {
    return this.col;
  }
  public char inputDirection ()
  {
    System.out.println("Enter commands u,d,l,r to move u)p, d)own, l)eft, r)ight:");
    char direction = in.next().charAt(0);

    return direction;
  }


  @Override
  public void mov(char direction)
  {
    int curRow;
    int curCol;

      switch (direction) {
          case 'u':
              if(maze.available(this.row - 1, this.col))
              {
                  this.ateNuts(this.row - 1, this.col);
                  //current position is stored
                  curRow = this.row;
                  maze.getMaze()[curRow][this.col] = new Wall(curRow, this.col, ' ');
                  this.row = this.row - 1;
                  this.put(this.getRow(), this.getCol());
                  //updated maze
                  maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't move over a wall");
              }       break;
          case 'l':
              if (maze.available(this.row, this.col - 1))
              {
                  this.ateNuts(this.row, this.col - 1);
                  curCol = this.col;
                  maze.getMaze()[this.row][curCol] = new Wall(this.row, curCol, ' ');
                  this.col = this.col - 1;
                  this.put(this.getRow(), this.getCol());

                  maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't move over a wall");
              }       break;
          case 'd':
              if(maze.available(this.row + 1, this.col))
              {
                  this.ateNuts(this.row + 1, this.col);
                  curRow = this.row;
                  maze.getMaze()[curRow][this.col] = new Wall(curRow, this.col, ' ');
                  this.row = this.row + 1;

                  this.put(this.getRow(), this.getCol());

                  maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't move over a wall");
              }       break;
          case 'r':
              if(maze.available(this.row, this.col + 1))
              {
                  this.ateNuts(this.row, this.col + 1);
                  curCol = this.col;
                  maze.getMaze()[this.row][curCol] = new Wall(this.row, curCol, ' ');
                  this.col = this.col + 1;
                  this.put(this.getRow(), this.getCol());
                  maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't move over a wall");
              }       break;
          case 'q':
              System.out.println("Quitting game. Total points " + pointsCollected);
              break;
          default:
              System.out.println("Only use one of u, d, l and r. Q to exit");
//              break;
      }
  }

  public void ateNuts(int row, int col)
  {
    someNut = maze.getMaze()[row][col];

    if(someNut.getSymbol() == 'A')
    {
      pointsCollected += 5;
      System.out.println("Squirrel ate Almond and gained 5 points (Total " + pointsCollected + " points.");
      totalNutsEaten++;
    }
    else if(someNut.getSymbol() == 'P')
    {
      pointsCollected += 10;
      System.out.println("Squirrel ate Peanut and gained 10 points (Total " + pointsCollected + " points.");
      totalNutsEaten++;
    }
    else if(someNut.getSymbol() == 'C')
    {
      pointsCollected -= 15;
      System.out.println("Squirrel ate Poisonous Cashew and lost 15 points (Total " + pointsCollected + " points.");
      totalNutsEaten++;

    }
  }
  public int nutsEaten()
  {
    return totalNutsEaten;
  }
  public int pointsTotal()
  {
    return pointsCollected;
  }

}
