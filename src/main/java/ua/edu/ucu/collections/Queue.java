package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.LinkedNode;

public class Queue {
    protected ImmutableLinkedList queue;
    public Queue(Object[] o){
        this.queue = new ImmutableLinkedList();
        for (int i = 0; i < o.length; i++){
            this.queue = this.queue.add(o[i]);
        }
    }

    public LinkedNode peek() { // Returns the object at the beginning of the Queue without removing it
    return (LinkedNode)this.queue.getFirst();
    }
    public ImmutableLinkedList dequeue() { // Removes and returns the object at the beginning of the Queue.
    this.queue = this.queue.removeFirst();
        return this.queue;
    }
    public void enqueue(Object o){  //Adds an object to the end of the Queue
        this.queue = this.queue.addLast(o);
    }
}
