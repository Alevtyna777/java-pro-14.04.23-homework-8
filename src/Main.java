import ArrayDataException.ArrayDataException;
import ArraySizeException.ArraySizeException;

public class Main {
    public static void main(String[] args) {
        try {
            int result = ArrayValueCalculator.doCalc(new String[][]{
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15","16"}

            });
        System.out.println("Result of calculation:"+result);
    } catch ( ArraySizeException e){
System.err.println("Array size error:" +e.getMessage());
}catch(ArrayDataException e){
System.err.println("Array data error:"+e.getMessage());
e.printStackTrace(); // Виведення стеку викликів

            throw new RuntimeException(e);
        }
    }
}
