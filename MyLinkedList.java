import java.util.Arrays;

public class MyLinkedList<T> implements MyList<T>  {
    private Node head;
    private Node tail;
    private int size;
    @Override
    public void add(Object data){
        Node newNode = new Node(data);
        Node currentNode = head;

        size++;
        if(head == null){
            head = newNode;
            tail = newNode;

        }
        else {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.previous = currentNode;
            tail = newNode;


        }
    }
    @Override
    public boolean remove(T data) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = previousNode.next;

        }
        return false;
    }

    public void remove(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        size--;
        Node currentNode = head;
        if(index == 0){
            head = head.next;
            head.previous = null;
            return;
        }
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        if(currentNode.next != null){
            currentNode = currentNode.next;
        currentNode.previous = currentNode;}
        if(currentNode.next == null){
            tail =tail.previous;
            tail.next = null;

        }

    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object O) {
        Node currentNode = head;
        while (currentNode.next != null){
            if(currentNode.data == O){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item, int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        size++;
        Node currentNode = head;
        Node newNode = new Node<>(item);
        if (index==0) {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
            return;
        }
        for (int i = 0; i < index-1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        if(currentNode.next != null)
        {
            currentNode.next.previous = newNode;
        currentNode.next = newNode;
        }
        newNode.previous = currentNode;

    }

    @Override
    public void clear(){
     size = 0;
     head = null;
    }

    @Override
    public T get(int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; i < size ; i++) {
            if (index == i) {
                return (T) currentNode.data;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    @Override
    public int indexOf(Object O) {
        Node currentNode = head;
        for (int i = 0; i < size; i++) {
            if(currentNode.data.equals(O)){
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object O) {
        Node currentNode = tail;
        for (int i = 0; i < size; i++) {
            if(currentNode.data.equals(O)){
                return i;
            }
            currentNode = currentNode.previous;
        }
        return -1;
    }

    @Override
    public void sort() {

    }
}
