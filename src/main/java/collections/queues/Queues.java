package collections.queues;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queues {

    public static void main(String[] args) {

        /*
            ARRAYDEQUE
         */

        ArrayDeque<String> lineToOrderFood = new ArrayDeque<>();

        lineToOrderFood.offerLast("Billy");
        lineToOrderFood.offerLast("Sally");
        lineToOrderFood.offerLast("Slagathor");
        System.out.println(lineToOrderFood);

        System.out.println();

        lineToOrderFood.offerFirst("Door Dasher");
        System.out.println(lineToOrderFood);

        System.out.println();

        // Retrieves First Element
        lineToOrderFood.peekFirst();
        // Retrieves AND Removes First Element
        lineToOrderFood.pollFirst();

        System.out.println(lineToOrderFood);

        System.out.println();

        /*
            PRIORITYQUEUE
            Allows for retrieving elements in their natural ordering
         */

        PriorityQueue<String> people = new PriorityQueue<>();

        people.offer("Sally");
        people.offer("Slagathor");
        people.offer("Billy");

        System.out.println(people);

        System.out.println();

        while (!people.isEmpty()) {
            System.out.println(people.poll());
        }



    }

}
