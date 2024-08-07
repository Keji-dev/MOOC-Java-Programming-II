package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isBlank() || age < 0 || age > 120 || name.length() > 40) {
        throw new IllegalArgumentException("Age cant' be null or empty, "
                    + "and age has to be between 0 and 120");
        } 
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
   