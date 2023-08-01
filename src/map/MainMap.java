package map;

import java.util.*;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Integer> studentByGrade = new HashMap<>();

        studentByGrade.put("Maria", 10);
        studentByGrade.put("Marius", 8);
        studentByGrade.put("Cristi", 7);
        studentByGrade.put("Bogdan", 5);
        studentByGrade.put("Alexandra", 9);
        studentByGrade.put("Oriana", 10);

        Set<String> allKeys = studentByGrade.keySet();
        System.out.println("All students are: " + allKeys);
        Collection<Integer> allValues = studentByGrade.values();
        System.out.println("All grades are: " + allValues);


        Set<Map.Entry<String, Integer>> entries = studentByGrade.entrySet();
        System.out.println(entries);



        }

    }

