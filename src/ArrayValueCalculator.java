import ArrayDataException.ArrayDataException;
import ArraySizeException.ArraySizeException;

public class ArrayValueCalculator {
    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        // Перевірка розміру масиву на відповідність 4x4
        if(array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Make array size 4x4");
        }
        //Перебір масиву
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

try{
    //Перетворення рядкового значення int та додавання до суми
    sum+= Integer.parseInt(array[i][j]);
} catch (NumberFormatException ex) {
    //Викидання винятка ArrayDataException з деталями про невірні дані
    throw new ArrayDataException("Incorrect array's data (" + i +", "+j +"");
}
            }
        }
        return sum;
    }
}
