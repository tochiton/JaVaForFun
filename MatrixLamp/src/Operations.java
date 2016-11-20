
public class Operations {

    public boolean inRange(int columnX, int rowY, int lengthCols, int lengthRows){
        if(columnX < lengthCols && rowY < lengthRows){
            return true;
        }
        else {
            return false;
        }
    }
}
