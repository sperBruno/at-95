import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    public static Calculator calculator;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
        calculator = new Calculator();
    }

    @Before
    public void beforeTest() {
        System.out.println("before test method");
    }

    @Test
    public void testSuma() {
        //AAA
        //Arrange
        int expected = 4;
        //Act
        int actual = calculator.suma(2, 2);
        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testResta() {
        //Arrange
        int expected = 0;
        //Act
        int actual = calculator.resta(2, 2);
        //Assert
        Assert.assertEquals(expected, actual);
    }

    @After
    public void afterTest() {
        System.out.println("After Test method");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

}