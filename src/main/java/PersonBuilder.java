import lombok.Setter;

@Setter
public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String city;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0 || age > 170) {
            throw new IllegalArgumentException("Возраст должен быть в диапазоне от 0 до 170 лет.");
        } else {
            this.age = age;
            return this;
        }
    }

    public PersonBuilder setAddress(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, city);
        if ((name == null) || (surname == null)) {
            throw new IllegalStateException("Имя и фамилия обязательно должны быть заполнены.");
        }
        return person;
    }

}
