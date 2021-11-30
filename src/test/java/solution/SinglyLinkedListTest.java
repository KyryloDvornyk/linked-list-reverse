package solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
    @Test
    public void reverseOneElement_Ok() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.reverse();
        Assertions.assertEquals(1, list.get(0));
    }

    @Test
    public void reverseTwoElements_Ok() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.reverse();
        Assertions.assertEquals(2,list.get(0));
        Assertions.assertEquals(1, list.get(1));
    }

    @Test
    public void reverseThreeElements_Ok() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.reverse();
        Assertions.assertEquals(3,list.get(0));
        Assertions.assertEquals(2, list.get(1));
        Assertions.assertEquals(1, list.get(2));
    }
}