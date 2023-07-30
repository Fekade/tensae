
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

pulic class Maze
{
  private String filename;
  private final int Max_Maze_Row = 20;
  private final int Max_Maze_Column = 50;
  private Entity[][] maze;
  private char symbol;
  private String [] eachLine;
  private char [] charsInLine;
  //private URL url = getClass().getResource("Maze.txt")

  public Maze()
  {
    //this.filename = "Maze.txt" //filename;
    filename = new File(url.getPath());
    maze = new Entity[Max_Maze_Row][Max_Maze_Column];
    fileLines = new String[20];
    lineParts = new char[1000];
  }

  public static Entity[][] getMaze()
  {
    return maze;
  }

  public static char getSymbol()
  {
    return symbol;
  }
//String filename
  public static void create() throws FileNotFoundException
  {
    try {
        // filename = System.in;
        Scanner in = new Scanner(new FileReader(filename));

        while(in.hasNextLine())
        {
          for (int i = 0; i < Max_Maze_Row; i++)
          {
            eachLine[i] = in.nextLine().trim();
            charsInLine = eachLine[i].toCharArray();
          }

            for (int j = 0; j < Max_Maze_Column, j++)
            {
              symbol = lineParts[j];
              maze[i][j] = new Entity(i,j,symbol);
              System.out.println(maze[i][j]);
            {

          }
        }
      }
      in.close();
    } catch (FileNotFoundException e)
      {
        System.out.println("File not found!");
      }
  }


  public static void display()
  {
    for (int i = 0; i < Max_Maze_Row; i++)
    {
      for (int j = 0; j < Max_Column_Row; j++)
      {
        System.out.println(maze[i][j]);
      }
    }
  }

  public static boolean available(int row, int col)
  {
    if(row < 0 || row > Max_Maze_Row || col < 0 || col > Max_Column_Row)
    {
      System.out.println("Either row or col is out of range");
      return -1;
    }
    else if(maze[row][col].getSymbol() == '*')
    {
      return -1;
    }
  }

  @Override
  public String toString()
  {
    return this.symbol + "";
  }


}
