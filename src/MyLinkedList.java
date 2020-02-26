
// @author Evgeniy Hirin

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    private static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void add(int value) {
        //   Node node = head;

        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));

        }

        size++;
    }

    public int get(int index) {
        Node temp = head;
        int currentIndex = 0;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }

        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if (index >= size) {
            throw new IllegalArgumentException();
        } else {
            if (index == 0) {
                head = head.getNext();
                size--;
            } else {
                Node temp = head;
                int currentIndex = 0;
                while (temp != null) {
                    if (currentIndex == index - 1) {
                        temp.setNext(temp.getNext().getNext());
                        size--;
                    }
                    temp = temp.getNext();
                    currentIndex++;
                }
            }
        }
    }

    public String toString() {
        int[] result = new int[size];
        int index = 0;
        Node temp = head;

        while (temp != null) {
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }
}