package ua.edu.ucu.collections.immutable;

public class LinkedNode {
    Object data;
    LinkedNode next;

    public LinkedNode(Object data){
        this.data = data;
    }
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
