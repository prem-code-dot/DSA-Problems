class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class SinglyLinkedList {

    Node head = null;
    Node tail = null;
    int length = 0;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length = 1;
        }

        else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
            tail = newNode;
            length++;

            // currentNode.next() = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        // if linkedList in empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            length = 1;
        } else {
            newNode.setNext(head);
            head = newNode;
            length++;
        }
    }

    public void addAnywhere(int data, int position) {
        if (position > 0 && position < length) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                length = 1;
            } else {
                Node currentNode = head;
                int i = 1;
                // for(int i =1 ;i<position; i++)
                while (currentNode != null && i < position) {
                    currentNode = currentNode.getNext();
                    i++;
                }
                Node link = currentNode.getNext();
                currentNode.setNext(newNode);
                newNode.setNext(link);
                length++;
            }
        } else {
            System.out.println("Enter position index other than that of head or tail");
        }
    }

    public void display() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + "-> ");
            currentNode = currentNode.getNext();
        }

        System.out.println("null");
    }

    public void deleteAnywhere(int position) {
        if (position > 0 && position < length) {
            int i = 1;
            Node currNode = head;
            while (currNode != null && i < position) {
                currNode = currNode.getNext();
                i++;
            }
            currNode.setNext(currNode.getNext().getNext());
        } else {
            System.out.println("Enter position index other than that of head or tail");
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("Empty LinkedList");
            return;
        }

        // if more than 1 node
        else if (head != tail) {
            head = head.getNext();
            length--;
        }

        // if only 1 node
        else {
            head = tail = null;
            length = 0;
        }
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("empty LinkedList");
        } else if (head == tail) {
            head = tail = null;
            length = 0;
        } else {
            Node currNode = head;
            while (currNode != null) {
                if (currNode.getNext().getNext() == null) {
                    tail = currNode;
                    tail.setNext(null);
                    length--;
                    return;
                }
                currNode = currNode.getNext();
            }
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println();
        System.out.print("Inserting at tail node: ");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(70);
        list.add(80);
        list.display();

        System.out.println();
        System.out.print("Deleting head node: ");
        list.deleteHead();
        list.display();

        System.out.println();
        System.out.print("Deleting tail node: ");
        list.deleteTail();
        list.display();

        System.out.println();
        System.out.print("Inserting node at head: ");
        list.addFirst(0);
        list.display();

        System.out.println();
        System.out.print("Inserting node at 1st postion: ");
        list.addAnywhere(10, 1);
        list.display();

        System.out.println();
        System.out.print("Inserting node at 5th postion: ");
        list.addAnywhere(50, 5);
        list.display();

        System.out.println();
        System.out.print("Deleting node at 5th postion: ");
        list.deleteAnywhere(5);
        list.display();

        System.out.println();
        System.out.println("Singly LinkedList Implemented Succesfully :) ");
        System.out.println();

    }
}