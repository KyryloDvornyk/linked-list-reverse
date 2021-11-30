package solution;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>{
    private Node head;
    private int size = 0;

    public void add(T value) {
        if (head == null) {
            head = new Node();
            head.value = (value);
            size++;
            return;
        }
        Node iter = head;
        while(iter.next != null) {
            iter = iter.next;
        }
        iter.next = new Node();
        iter.next.value = value;
        size++;
    }

    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node first = head;
        Node second = first.next;
        Node third = second.next;
        first.next = null;
        while (third != null) {
            second.next = first;
            first = second;
            second = third;
            third = third.next;
        }
        second.next = first;
        head = second;
    }

    public T get(int index) {
        if (size <= index) {
            throw new IndexOutOfBoundsException();
        }
        Node iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.next;
        }
        return iter.value;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    private class Node {
        private T value;
        private Node next;
    }
}
