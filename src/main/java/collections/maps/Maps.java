package collections.maps;

import java.util.*;
import java.util.Map.Entry;

public class Maps {

    public static void main(String[] args) {

        /*
            HASHMAP
         */

        // HashMap with string key and string value
        HashMap<String, String> employees = new HashMap<>();
        // HashMap with integer key and string value
        HashMap<Integer, String> anotherExample = new HashMap<>();

        // Create OR Update the value of a key
        employees.put("CEO", "Slagathor");
        // Create the key-value pair if the key does not already have a value
        employees.putIfAbsent("VP", "Sally");
        employees.put("Janitor", "Billy");

        // Get either returns the value or returns null if the value does not exist
        System.out.println(employees.get("CEO"));
        // GetOrDefault is useful if you do not know if the key exists, it will return a default value if the key is not present
        System.out.println(employees.getOrDefault("CFO", "Still need to hire"));

        employees.put("CFO", "Godzilla");
        employees.remove("CFO");

        System.out.println();

        Set<Entry<String, String>> entries = employees.entrySet();
        for (Entry<String,String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            entry.setValue("Ditto");
        }

        System.out.println();

        for (Entry<String,String> entry : entries) {
            System.out.println(entry);
        }

        System.out.println();

        Set<String> keys = employees.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        System.out.println();

        Collection<String> values = employees.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println();

        /*
            TREEMAP
            When ordering of the pairs is important
         */

        TreeMap<String, String> suspects =  new TreeMap<>();
        suspects.put("Highly Suspicious", "Meowth");
        suspects.put("Medium Suspicious", "James");
        suspects.put("Low Suspicious", "Jessie");

        System.out.println(suspects);

    }

}
