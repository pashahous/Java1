package gb.sem1.levl2.les2;

public class SumEachCellOfArray {
    public static void main(String[] args) {
        String [][] strArray = {
                {"1","1","1",},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };
        String [][] strArray1 = {
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };
        String [][] strArray2 = {
                {"1","1","1","q"},
                {"1","1","1","1"},
                {"1","1","1","1"},
                {"1","1","1","1"}
        };
        try {
            System.out.println(sumOfEachCell(strArray));
        } catch (MyArraySizeArgementException e) {
            throw new RuntimeException(e);
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(sumOfEachCell(strArray1));
        } catch (MyArraySizeArgementException e) {
            throw new RuntimeException(e);
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(sumOfEachCell(strArray2));
        } catch (MyArraySizeArgementException e) {
            throw new RuntimeException(e);
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e);
        }


    }


    public static int sumOfEachCell(String[][] array) throws MyArraySizeArgementException,MyArrayDataException {
        if (array.length != 4) throw new MyArraySizeArgementException("Неверный размер входного массива");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeArgementException("Неверный размер входного массива");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try  {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e){
                    throw  new MyArrayDataException("Неверные данные в ячейке "+i+" "+ j, i, j);
                }
            }

        }
        return sum;

    }
}
