import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = {"name", "surname"})
public class Person {


    private final String name;
    private final String surname;
    private int age;
    @Setter
    private String city;

    public boolean hasAge() {
        return this.age >= 0;
    }

    public void happyBirthday() {
        if (this.hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        return !this.city.isEmpty();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setSurname(this.surname);
        childBuilder.setAge(0);
        return childBuilder;
    }

}
