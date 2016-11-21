
public class Operations {

    public boolean inRange(int columnX, int rowY, int lengthCols, int lengthRows){
        if(columnX < lengthCols && rowY < lengthRows && columnX >= 0 && rowY >=0){
            return true;
        }
        else {
            return false;
        }
    }

    public void print2dArray(int [][] array, int lengthRows, int lengthCols){
        for(int i = 0; i < lengthRows; i++){
            for (int j = 0; j < lengthCols; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public int [][] deActivateAround(int [][] array, int columnX, int rowY, int lengthCols, int lengthRows){
        int currentX = columnX - 1;
        int currentY = rowY - 1;

        int [][] myArray = new int[lengthCols][lengthRows];

        for(int i= 0; i < lengthRows; i++){
            for(int j = 0; j < lengthCols; j++){
                myArray[i][j] = array[i][j];
            }
        }
       // print2dArray(myArray, lengthCols,lengthRows);
        for(int i= 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(inRange(currentX +j, currentX + i, lengthCols,lengthRows)){
                    myArray[currentY + j][currentX + i] = 0;
                }
            }
        }
        return myArray;
    }


    public boolean checkHorizontal(int [][] array, int lengthCols, int fixYaxis){
        for(int i = 0; i < lengthCols; i++){
            if(array[i][fixYaxis] == 1)
                return true;
        }
        return false;
    }
    public boolean checkVertical(int [][] array, int lengthRows, int fixXaxis){
        for(int i = 0; i < lengthRows; i++){
            if(array[fixXaxis][i] == 1)
                return true;
        }
        return false;
    }

    public boolean checkAdjacentUp(int [][] array, int currentX, int currentY, int lengthCols, int lengthRows){

        int moveX = currentX;
        int moveY = currentY;

        while( inRange(moveX, moveY, lengthCols, lengthRows)){
            //System.out.println(array[moveX][moveY]);
            if(array[moveX][moveY] == 1){
                return true;
            }
            moveX = moveX + 1;
            moveY = moveY + 1;
        }
        return false;
    }
}
