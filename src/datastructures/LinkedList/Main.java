package datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(3);

        doublyLinkedList.insert(0, 10);

        System.out.println("GET: " + doublyLinkedList.get(0).value);

        doublyLinkedList.printList();
    }
}
