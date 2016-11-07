package ua.edu.ucu.collections.immutable;
import java.lang.IndexOutOfBoundsException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class ImmutableLinkedList implements ImmutableList{
    private final LinkedNode head;

    public ImmutableLinkedList(LinkedNode head){
        this.head = head;
    }
    public ImmutableList add(Object e){
        LinkedNode newHead = new LinkedNode(e);
        ImmutableLinkedList res = new ImmutableLinkedList(newHead);
        return res;

    } //додає елемент у кінець колекції

    public ImmutableList add(int index, Object e) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        else
            return null;
    } //додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList addAll(Object[] c){
        for (int i = 0;i < c.length; i++){
            LinkedNode newHead = new LinkedNode(i, this.head);

    } //додає масив елементів у кінець колекції

    public ImmutableList addAll(int index, Object[] c){
        return null;
    } // додає масив елементів починаючи з зазначеного індекса, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public Object get(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        else {

        return elements[index];
    }}

 //повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableList remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] list = this.toArray();
            Object[] new_list = new Object[size() - 1];
            for (int i = 0; i < size(); i++) {
                if (i < index) {
                    new_list[i] = list[i];
                } else if (i > index) {
                    new_list[i] = list[i - 1];
                }
            }
            ImmutableLinkedList remove_list = new ImmutableLinkedList(new_list);
            return remove_list;
        } //видаляє елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції
    }
    public ImmutableList set(int index, Object e) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size()){
            throw new InputMismatchException();
        }
        else{
            Object[] list = this.toArray();
            list[index] = e;
            ImmutableLinkedList setList = new ImmutableLinkedList(list);
            return setList;
        }
    } //змінює значення елементу за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public int indexOf(Object e) { //шукає індекс елемента (повертає індекс першого який знайшов, або -1 у випадку відсутності)
        for (int i = 0; i < size(); i++) {
            if (e == elements[i]) {
                return i;
            }
        }

        return -1;
    }
    public int size(){
        return elements.length;
    } //розмір колекції

    public ImmutableList clear(){
        ImmutableLinkedList clearList = new ImmutableLinkedList(null);
        return this;
    } //очищує вміст колекції

    public boolean isEmpty(){
        if (this.size() > 0){
            return false;
        }
        else
            return true;
    } //якщо у колеції нема елементів то повертає true
    public Object[] toArray() { //перетворює колекцію до масиву обєктів
        Object[] list = new Object[this.size() + 1];
        for (int i = 0; i < this.size(); i++) {
            list[i] = this.get(i);
        }
        return list;
    }

    @Override
    String toString(){
        ArrayList<String > b = new ArrayList<>();
        for ()
        return "ImmutableArrayList{" +
                "elements=" +  +
                '}';
    }
} //повертає рядок, де через кому відображаютсься елементи колекції

