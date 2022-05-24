import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

    @Test
    public void testPersonFullName() {
        //Arrange
        String expected = "Bruno Barrios";
        Person bruno = new Person("bruno", "barrios");

        //Act

        String actual = bruno.getFullName();

        //Assert
        Assert.assertEquals(expected, actual);

    }
}
