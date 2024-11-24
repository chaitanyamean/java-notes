package SequenceCollections;

import java.util.ArrayList;
import java.util.SequencedCollection;


public class ArrayListExample {

    public static void main(String[] args) {
        SequencedCollection<Integer> seqList = new ArrayList<>();

        seqList.addFirst(1);
        seqList.addFirst(2);
        seqList.addLast(3);

        System.out.println("Get First " + seqList.getFirst()); // 2
        System.out.println("Get Last " + seqList.getLast()); // 3

        System.out.println(seqList); //[2,1,3]

        System.out.println(seqList.reversed()); //[3,1,2]

        seqList.removeFirst();
        System.out.println(seqList); // [1,3]

        seqList.removeLast(); //
        System.out.println(seqList); // [1]

    }
}
