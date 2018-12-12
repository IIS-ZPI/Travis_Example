package com.example.testingtesting;

import org.junit.*;
import static org.junit.Assert.*;

public class TestSuite_1 {

    @BeforeClass
    public static void BeforeClass()
    {
        System.out.println("Setup test suit, prepare environment, create mocks, log in to databases (@BeforeAll in JUnit5)");
    }

    @Before
    public void Before()
    {
        System.out.println("Prepare test (@BeforeEach in JUnit5)");
    }

    @Test
    public  void Test1()
    {
        System.out.println("Test one (1 + 1 = 2)");
        Calculator calc = new Calculator();
        int result = calc.add(1,1);
        assertEquals(result, 2);
    }

    @Test
    public  void Test2()
    {
        System.out.println("Test two");
    }

    @Test
    public  void Test3()
    {
        System.out.println("Test two");
    }

    @After
    public void After()
    {
        System.out.println("Clean up after test (@AfterEach in JUnit5)");
    }

    @AfterClass
    public static void AfterClass()
    {
        System.out.println("Tear down environment, log out etc. (@AfterAll in JUnit5)");
    }


}
