public class Person {
    private String name;
    private String lastName;
    private int telefono;
    public Person(String name, String lastName, int telefono) {
        this.name = name;
        this.lastName = lastName;
        this.telefono = telefono;
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
        return String.format("{\"name\": \"%s\", \"lastName\": \"%s\", \"telefono\": \"%s\"}", this.name, this.lastName, this.telefono);
    }
}
