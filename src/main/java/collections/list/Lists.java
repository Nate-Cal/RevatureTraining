package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    /*
        - Indexable
        - Maintain Order of Insertion
        - Allows Duplicates
     */

    public static void main(String[] args) {
        /*
            ARRAYLIST
            ArrayList are backed by an Array
            Good for accessing data in the center of the collection
         */

        List<String> myArrayList = new ArrayList<>();

        // This does not work because the type must be a class, not a primitive
        //List<int> myIntegerList = new ArrayList<>();

        List<Integer> myIntegerList = new ArrayList<>();

        // Not good idea either, pulls all objects in class, including java prescribed objects
        //List<Object> myObjectList = new ArrayList<>();

        myArrayList.add("Billy");
        myArrayList.add("Sally");
        myArrayList.add("Slagathor");
        //myArrayList.add(0 ,"Slagathor");
        System.out.println(myArrayList);

        myArrayList.add(1, "Teddy");
        System.out.println(myArrayList);

        String myElement = myArrayList.get(1);
        System.out.println(myElement);

        myArrayList.remove("Teddy");
        System.out.println(myArrayList);
        System.out.println(myElement);

        String first = myArrayList.getFirst();
        String last = myArrayList.getLast();
        System.out.println(first + last);

        myArrayList.addAll(List.of("Sarah", "Katie", "Dusty", "Slagathor with a steel chair"));
        System.out.println(myArrayList);

        System.out.println();

        /*
            LINKEDLIST
            LinkedLists are a collection of nodes.
            Good for accessing data at the beginning and the end of the collection
         */

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("Billy");
        myLinkedList.add("Sally");
        myLinkedList.add("Slagathor");
        System.out.println(myLinkedList);

        String linkedElement = myLinkedList.get(1);
        System.out.println(linkedElement);

        myLinkedList.addFirst("Teddy");
        System.out.println(myLinkedList);

        System.out.println();

        for (String element: myArrayList) {
            System.out.println(element);
        }

        System.out.println();

        for (String element: myLinkedList) {
            System.out.println(element);
        }

        System.out.println();

        // LinkedLists works with Queue/Dequeue properties
        myLinkedList.pollFirst(); // Retrieves and Removes first element in LinkedList
        myLinkedList.pollLast(); // Retrieves and Removes last element in LinkedList
        myLinkedList.peek(); // Retrieves but does not Remove first element in LinkedList

        LinkedList<String> dmvWaitList = new LinkedList<>(List.of("Billy", "Sally", "Slagathor"));

        while (!dmvWaitList.isEmpty()) {
            String customer = dmvWaitList.pollFirst();
            System.out.println("Now helping " + customer);
        }


    }

}
