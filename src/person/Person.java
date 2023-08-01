package person;


public class Person {
    protected String names;
    protected int age;
    protected String hairColor;

    public String getNames() {
        return names;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public Person(String names, int age, String hairColor) {
        this.names = names;
        this.age = age;
        this.hairColor = hairColor;
    }
    public Person(){}


    public String toString() {
        return names + "|" + age + "|" + "|" + hairColor;
    }
}

