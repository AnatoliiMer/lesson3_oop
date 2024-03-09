package lesson3;


import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList implements Iterable<Integer> {
    private Node head;

    private class Node {
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Добавление, удаление и получение элементов

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}