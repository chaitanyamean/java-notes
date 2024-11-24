package SequenceCollections;

import java.util.LinkedList;
import java.util.SequencedCollection;


public class LinkedListSCExample {
    public static void main(String[] args) {
        SequencedCollection<Integer> seqLL = new LinkedList<>();
        seqLL.addFirst(10);
        seqLL.addLast(20);

        System.out.println("LinkedList: " + seqLL); // [10, 20]
        System.out.println("Reversed View: " + seqLL.reversed()); // [20, 10]

        seqLL.removeLast();
        System.out.println("After removeLast: " + seqLL); // [10]

    }
}
