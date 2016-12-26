package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.LinkedNode;

public class Stack {
    protected ImmutableLinkedList stack;
    public Stack(Object[] o){
        this.stack = new ImmutableLinkedList();
        if (o != null){
            for (int i = 0; i < o.length; i++){
                this.stack = this.stack.add(o[i]);
            }
        }
    }
    public LinkedNode peek() {  //Returns the object from the top of the Stack without removing it
        return (LinkedNode)this.stack.getLast();
    }
    public ImmutableLinkedList pop() {  //Removes and returns the object from the top of the Stack
        this.stack = this.stack.removeLast();
        return this.stack;
    }

    public void pop(Object e) { //Adds an object to the the top of the Stack
        this.stack = this.stack.addLast(e);
    }
}
