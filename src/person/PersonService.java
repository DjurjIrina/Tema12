package person;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {


    public static List<String> getAllPersonNames(List<Person> persons) {
        List<String> personNames = new ArrayList<>();
        for(Person currentPerson: persons){
            String myPersonName = currentPerson.getNames();
            personNames.add(myPersonName);
        }
        return personNames;
    }

    public static Map<String, Integer> mapPersonByAge(List<Person> persons) {
        Map<String, Integer> groupedPeopleByAge = new HashMap<>();
        for (Person currentPerson : persons) {
            String myPerson = currentPerson.getNames();
            Integer myPersonAge = currentPerson.getAge();
            groupedPeopleByAge.put(myPerson, myPersonAge);
        }
        return groupedPeopleByAge;
    }

    public static List<Person> olderThanAge(List<Person> persons, int givenAge) {
        List<Person> personOlderThan = new ArrayList<>();
        for (Person currentPerson : persons) {
            if (currentPerson.getAge() > givenAge) {
                personOlderThan.add(currentPerson);
            }

        }
        return personOlderThan;
    }

    public static Map<String, List<String>> mapPersonByHairColor(List<Person> persons) {
        Map<String, List<String>> groupedPersonByHairColor = new HashMap<>();
        for (Person currentPerson : persons) {
            String myHairColor = currentPerson.getHairColor();
            String personName = currentPerson.getNames();

            if (!groupedPersonByHairColor.containsKey(myHairColor)) {
                List<String> listOfColors = new ArrayList<>();
                listOfColors.add(personName);
                groupedPersonByHairColor.put(myHairColor, listOfColors);
            } else {
                List<String> existingColors = groupedPersonByHairColor.get(myHairColor);
                existingColors.add(personName);
                groupedPersonByHairColor.put(myHairColor, existingColors);
            }
        }
        return groupedPersonByHairColor;
    }
}






