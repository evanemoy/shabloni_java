package prac2;

import java.time.LocalDate;
public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    public Human(int age, String firstName, String lastName, LocalDate birthdate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthdate;
        this.weight = weight;
    }
}
