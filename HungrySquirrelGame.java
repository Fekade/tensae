import java.util.Scanner;

public class HungrySquirrelGame
{
  public static void main(String[] args)
  {
    Maze maze = new Maze();
    Squirrel squirrel;
    char direction = ' ';

    System.out.println("Welcome to the Hungry Squirrel game");
    maze.create()
    maze.display();
    squirrel = new Squirrel();
    squirrel.create();
    squirrel = new Squirrel(squirrel.getRow(), squirrel.getCol(), '@');

    Nut almond = new Almond();
    Nut peanut = new Peanut();
    Nut cashew = new
  }

}
