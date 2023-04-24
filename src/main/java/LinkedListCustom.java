import java.util.LinkedList;
import java.util.List;

public class LinkedListCustom<E> implements ListCustom<E> {


    private static class Node<E> {
        E item;
        LinkedList.Node<E> next;
        LinkedList.Node<E> prev;

        Node(LinkedList.Node<E> prev, E element, LinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    void linkLast(E e) {
        final LinkedList.Node<E> l = last;
        final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }
}
