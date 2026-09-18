package com.revature.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    /*
        - Do not guarantee Order of Insertion
        - Not Indexable
        - No Duplicates
     */

    public static void main(String[] args) {
        /*
            HASHSET
            Better suited to constant adding/removing of data due to the HashMap backing
         */

        Set<String> myHastSet = new HashSet<>();

        myHastSet.add("Billy");
        myHastSet.add("Sally");
        myHastSet.add("Slagathor");
        // No Duplicates
        //myHastSet.add("Slagathor");
        myHastSet.add(null);
        System.out.println(myHastSet);

        System.out.println();

        String myElement;
        for (String element : myHastSet) {
            if (element != null && element.equals("Slagathor")) {
                myElement = element;
                break;
            }
        }

        /*
            TREESET
            Better when the natural ordering of data is important.
         */

        Set<String> myTreeSet = new TreeSet<>(Set.of("Billy", "Sally", "Slagathor", "Belinda", "Gustov", "Slagathor with a steel chair!"));
        System.out.println(myTreeSet);

        myTreeSet.remove("Slagathor");
        System.out.println(myTreeSet);

        // Does not work because null cannot be added to a TreeSet
        //myTreeSet.add(null);


    }
}
