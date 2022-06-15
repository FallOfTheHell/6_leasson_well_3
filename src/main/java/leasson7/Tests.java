package leasson7;

public class Tests {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Test Before");
    }

    @Test(priority = 2)
    public void Test1(){
        System.out.println("Test_2");
    }
    @Test(priority = 3)
    public void Test2(){
        System.out.println("Test_3");
    }
    @Test(priority = 4)
    public void Test3(){
        System.out.println("Test_4");
    }
    @Test(priority = 7)
    public void Test4(){
        System.out.println("Test_7");
    }
    @Test(priority = 10)
    public void Test5(){
        System.out.println("Test_10");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
}
