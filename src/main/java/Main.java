import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.IOException;
import java.util.logging.FileHandler;

public class Main {
    public static int[] notAnEmptyArray(int[] massiv){
        for (int i = massiv.length - 1; i > -1; i--) {
            if (massiv[i] == 4){
                i++;
                int[] newMassiv = new int[massiv.length - i];
                for (int j = 0; j < newMassiv.length; j++) {
                    newMassiv[j] = massiv[i + j];
                }
                return newMassiv;
            }
        }
        throw new RuntimeException();
    }


//    Написать метод, который проверяет состав массива из чисел 1 и 4.
//    Если в нем нет хоть одной четверки или единицы,то метод вернет false;
//    Написать набор тестов для этого метода (по 3-4
//            варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false
    public static boolean theCompositionNumber1and4(int[] massiv){
        int numberOne = 0;
        int numberTwo = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 1){
                numberOne++;
            } else if (massiv[i] == 4){
                numberTwo++;
            } else {
                return true;
            }
        }
        if (numberOne > 0 && numberTwo > 0){
            return true;
        }
        return false;
    }

    //private static final Logger logger = LogManager.getLogger("logger");
}
