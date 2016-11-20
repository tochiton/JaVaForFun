import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Operations myOperation = new Operations();
        int array[][] = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };

     //   System.out.println(Arrays.deepToString(array));

        int lengthRows = array.length;
        int lengthCols = array[0].length;
        System.out.println("Rows: " + lengthRows + " Columns: " + lengthCols);

        for(int i = 0; i < lengthRows; i++){
            for (int j = 0; j < lengthCols; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

        if(myOperation.inRange(0,4,lengthCols,lengthRows)){
            System.out.println("It's in the range");
        }
        else {
            System.out.println("Not in the range");
        }
    }

}
