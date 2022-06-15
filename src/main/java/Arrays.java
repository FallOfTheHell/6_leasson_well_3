import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Arrays {

//    @Test
//    void theArrayOne(){
//        int[] mas0 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] mas1 = {4, 5, 6, 7, 8};
//        int[] masControl = Main.notAnEmptyArray(mas0);
//        Assertions.assertArrayEquals(mas1, masControl);
//    }

//    @Test
//    void theArrayTwo(){
//        int[] mas0 = {1, 2, 4, 4, 2, 3 ,4};
//        int[] mas1 = {3, 4};
//        int[] masControl = Main.notAnEmptyArray(mas0);
//        Assertions.assertArrayEquals(mas1, masControl);
//    }

//    @Test
//    void theArrayTree(){
//        int[] mas0 = {1, 2, 4, 4, 2, 3 ,4};
//        Assertions.assertThrows(RuntimeException.class, () -> Main.notAnEmptyArray(mas0));
//    }

    @Test
    void theExaminationArray(){
        int[] mas0 = {1, 4, 1, 4, 1, 4};
        boolean expected = true;
        boolean actual = Main.theCompositionNumber1and4(mas0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theExaminationArray2(){
        int[] mas0 = {4};
        boolean expected = false;
        boolean actual = Main.theCompositionNumber1and4(mas0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theExaminationArray3(){
        int[] mas0 = {};
        boolean expected = false;
        boolean actual = Main.theCompositionNumber1and4(mas0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void theExaminationArray4(){
        int[] mas0 = {5, 3, 3};
        boolean expected = false;
        boolean actual = Main.theCompositionNumber1and4(mas0);
        Assertions.assertNotEquals(expected, actual);
    }

    @Test
    void theExaminationArray5(){
        int[] mas0 = {5, 1,3,4};
        boolean expected = false;
        boolean actual = Main.theCompositionNumber1and4(mas0);
        Assertions.assertNotEquals(expected, actual);
    }
}
