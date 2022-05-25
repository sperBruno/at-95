public class Person {
    private String name;
    private String lastName;
    private String Telefono;
    public Person(String name, String lastName, String Telefono) {
        this.name = name;
        this.lastName = lastName;
        this.Telefono = Telefono;
    }
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getFullName() {
        String result = this.name.substring(0, 1).toUpperCase().concat(this.name.substring(1)).concat(" ")
                .concat(this.lastName.substring(0,1).toUpperCase().concat(this.lastName.substring(1)));
        System.out.println(result);
        return result;
    }

    public String convertToJson() {
        return String.format("{\"name\": \"%s\", \"lastName\": \"%s\", \"Telefono\": \"%s\"}", this.name, this.lastName, this.Telefono);
    }
}
