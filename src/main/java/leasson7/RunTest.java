package leasson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;

public class RunTest {
    public static void start() throws InvocationTargetException, IllegalAccessException {
        Class testClass = Tests.class;
//        if (!areBeforeAfterAnnotationsCorrect(testClass)) {
//            throw new RuntimeException();
//        }
        Tests tests = new Tests();

        Method beforeM= null;
        Method afterM = null;
        Method[] method = testClass.getDeclaredMethods();
//        ArrayList<Method> testMethod = new ArrayList<>();
        ArrayList<Method> methodBefore = new ArrayList<>();
        ArrayList<Method> methodAfter = new ArrayList<>();

        for (Method o: method) {
//            if (o.getAnnotation(BeforeSuite.class) != null){
//                beforeM = o;
//            } else if (o.getAnnotation(AfterSuite.class) != null){
//                afterM = o;
//            } else if (o.getAnnotation(Test.class) != null){
//                testMethod.add(o);
//            }
            if (o.isAnnotationPresent(BeforeSuite.class)){
                if (methodBefore.isEmpty()){
                    methodBefore.add(o);
                } else {
                    throw new exceptionBeforeAndAfter("BeforeSuite");
                    //throw new RuntimeException();
                 }
            }
            if (o.getAnnotation(AfterSuite.class) != null){
                if (methodAfter.isEmpty()){
                    methodAfter.add(o);
                } else {
                    throw new exceptionBeforeAndAfter("AfterSuite");
                }
            }
        }
       // testMethod.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).priority()));

        methodBefore.get(0).invoke(tests);

        for (int i = 0; i <= 10; i++) {
            for (Method m1: method) {
                if (m1.isAnnotationPresent(Test.class)){
                    if (m1.getAnnotation(Test.class).priority() == i){
                        m1.invoke(tests);
                    }
                }
            }
        }
        methodAfter.get(0).invoke(tests);
    }

//    public static boolean areBeforeAfterAnnotationsCorrect(Class testClass){
//        int beforeAnnotationCount = 0;
//        int afterAnnotationCount = 0;
//        for (Method m: testClass.getDeclaredMethods()) {
//            if (m.getAnnotation(BeforeSuite.class) != null){
//                beforeAnnotationCount++;
//            }
//            if (m.getAnnotation(AfterSuite.class) != null){
//                afterAnnotationCount++;
//            }
//
//        }
//        return (beforeAnnotationCount < 2) && (afterAnnotationCount < 2);
//    }
}
