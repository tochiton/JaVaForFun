import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Operations myOperation = new Operations();
        int array[][] = {
                {0,0,0,0,0},
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0}
        };

     //   System.out.println(Arrays.deepToString(array));

        int lengthRows = array.length;
        int lengthCols = array[0].length;
        System.out.println("Rows: " + lengthRows + " Columns: " + lengthCols);

        array = myOperation.deActivateAround(array,0,0, lengthCols,lengthRows);
        array = myOperation.deActivateAround(array,4,4, lengthCols,lengthRows);
/*
        // check vertical line
        if(myOperation.checkHorizontal(array, lengthCols, 3)){
            System.out.println("It's on because other lamps");
        }
        else{
            System.out.println("No sign. Lamp is off");
        }

        // check horizontal line
        if(myOperation.checkVertical(array, lengthRows, 0)){
            System.out.println("It's on because other lamps");
        }
        else{
            System.out.println("No sign. Lamp is off");
        }
*/
        // checks adjacent on the way up
        if(myOperation.checkAdjacentUp(array,2,2, lengthCols,lengthRows)){
            System.out.println("It's on because other lamps");
        }
        else{
            System.out.println("No sign. Lamp is off");
        }

        //myOperation.print2dArray(array, lengthRows, lengthCols);
/*
        if(myOperation.inRange(0,4,lengthCols,lengthRows)){
            System.out.println("It's in the range");
        }
        else {
            System.out.println("Not in the range");
        }
*/
    }

}
