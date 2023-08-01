package person;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Pop Mihai", 37, "saten");
        Person person2 = new Person("Pop Marius", 25, "brunet");
        Person person3 = new Person("Sas Cristi", 19, "blond");
        Person person4 = new Person("Filip Andrei", 31, "blond");
        Person person5 = new Person("Bodea Marcel", 46, "saten");
        Person person6 = new Person("Visan Bogdan", 21, "blond");


        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        System.out.println(persons);
        System.out.println(PersonService.getAllPersonNames(persons));
        System.out.println(PersonService.mapPersonByAge(persons));
        System.out.println(PersonService.olderThanAge(persons, 30));
        System.out.println(PersonService.mapPersonByHairColor(persons));

    }
}
