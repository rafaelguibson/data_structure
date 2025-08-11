package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(11);
        newLinkedList.append(3);
        newLinkedList.append(23);
        newLinkedList.append(7);
        newLinkedList.append(4);

        newLinkedList.getHead();
        newLinkedList.getTail();
        newLinkedList.getLength();

        newLinkedList.printList();

        newLinkedList.removeLast();
        System.out.println("After remove");
        newLinkedList.printList();

        newLinkedList.prepend(9);
        newLinkedList.printList();

    }
}
