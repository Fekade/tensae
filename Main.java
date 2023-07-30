
public class Main {

  public static void main(String[] args)
  {
    // String filename;
    //filename = System.in;
    Maze dd = new Maze(System.in);
    dd.create();
  }


}

//for( int row = 0; row < MAX_MAZE_ROW; row++)
//{
  for(int i = 0; i < 100; i++)
  {
    int validLen = 0;
    int nutRow = createRow() + 1;
    int nutCol = createCol() + 1;

    while(Maze.available(nutRow, nutCol) && validLen < 10)
    {
      int counter = 0, found = 0;
      while(counter < 10)
      {
        if(VALID_ROW[counter] == row && VALID_COL[counter] == col)
        {
          found = 1;
          break;
        }
        counter++;
      }
      if(found ==0)
      {
        VALID_ROW[counter] = row;
        VALID_COL[counter] = col;
      }
      validLen++;
    }
  }
//}


if(VALID_ROW[validLen] == 0 && VALID_COL[validLen] == 0)
     {
      VALID_ROW = Arrays.copyOf(VALID_ROW, validLen);
      VALID_COL = Arrays.copyOf(VALID_COL, validLen);
      break;
     }
while(There are numbers to read){


    int number = read_number(), counter = 0, found = 0;

    while(counter <= loop){
        if(a[counter] == number){
            found = 1; // you found a match for this number break here
            break;
        }

        counter++;
    }

    if(found == 0){
        /* We did not find our number in array*/
        a[counter] = number;
    }
}

//( VALID_ROW[VALID_ROW.length - 1] == 0 && VALID_COL[VALID_COL.length - 1] == 0 ) )
//nutCol == 0) )

////        if(nutRow != 0 && nutCol != 0)
//        {
//         VALID_ROW[validLen] = nutRow;
//         VALID_COL[validLen] = nutCol;
//        }

//     if(VALID_ROW[VALID_ROW.length - 1] == 0 || VALID_COL[VALID_COL.length - 1] == 0)
//     {
//      VALID_ROW = Arrays.copyOf(VALID_ROW, VALID_ROW.length-1);
//      VALID_COL = Arrays.copyOf(VALID_COL, VALID_COL.length-1);
//     }

//     if(validLen == 9)
//     {
//      break;
//     }
// }

//    for (int i = 0; i < VALID_ROW.length -1; i++)
//    {
//System.out.println(VALID_ROW[9]);
//System.out.println(VALID_COL[9]);


//     int nutRow = createRow() + 1;
//     int nutCol = createCol() + 1;
//   for (int i = 0; i < TOTAL_NO_NUTS + POISONOUS_CASHEWS ; i++)
//     {
//      int nutRow = createRow() + 1;
//      int nutCol = createCol() + 1;
//
//       for (int j = 1; j < TOTAL_NO_NUTS + POISONOUS_CASHEWS; j++)
//       {
//        if(i != j && VALID_ROW[i] == VALID_ROW[j] && VALID_COL[i] == VALID_COL[j])
//        {
//         nutRow = createRow() + 1;
//         nutCol = createCol() + 1;
//        }
//       }
//        while(!Maze.available(nutRow, nutCol))
//        {
//         nutRow = createRow() + 1;
//         nutCol = createCol() + 1;
//        }
//       VALID_ROW[i] = nutRow;
//       VALID_COL[i] = nutCol;
//     }

//  int randomCol = 2 + (int)(Math.random() * ((50 - 2))); 
