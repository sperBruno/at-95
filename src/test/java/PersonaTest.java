import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

    @Test
    public void testPersonFullName() {
        //Arrange
        String expected = "Bruno Barrios";
        Person bruno = new Person("bruno", "barrios", "70773887");

        //Act

        String actual = bruno.getFullName();

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPersonToJson() {
        //Arrange
        //1. choose task
        //2. Test - Red
        //3. Test - Green
        //4. Refactor
        //5. Repeat
        String expected = "{\"name\": \"bruno\", \"lastName\": \"barrios\",\"phone\":\"70773887\"}";
        Person bruno = new Person("bruno", "barrios", "70773887");
        //Act
        String personToJson = bruno.convertToJson();

        //Assert
        Assert.assertEquals(expected, personToJson);
    }
}
