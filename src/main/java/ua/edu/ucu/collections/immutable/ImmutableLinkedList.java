package ua.edu.ucu.collections.immutable;
public class ImmutableLinkedList implements ImmutableList{
    private final LinkedNode head;

    public ImmutableLinkedList(LinkedNode head){
        this.head = head;
    }
//
//    public ImmutableLinkedList addFirst(Object e) {//додає елемент у початок зв'язаного списку
//
//    }
//​    public ImmutableLinkedList addLast(Object e){ // додає елемент у кінець зв'язаногo списку
//        return null;
//    }
    public Object getFirst(){
        return get(size()-1);
    }
    public Object getLast(){
        return get(0);
    }
   public ImmutableLinkedList removeFirst() {
        ImmutableLinkedList new_one1 = new ImmutableLinkedList(null);
        Object[] queue1 = this.toArray();
        for (int i = 1; i < queue1.length; i++){
            new_one1 = new_one1.add(queue1[i]);
        }
        return new_one1;
        }

    public ImmutableLinkedList removeLast() { // видаляє перший елемент
        ImmutableLinkedList new_one = new ImmutableLinkedList(null);
        Object[] queue = this.toArray();
        for (int i = 0; i < queue.length - 1; i++) {
            new_one = new_one.add(queue[i]);
        }
        return new_one;
    }

    public ImmutableLinkedList add(Object e){
        LinkedNode newHead = new LinkedNode(e);
        newHead.setNext(this.head);
        ImmutableLinkedList res = new ImmutableLinkedList(newHead);
        return res;

    } //додає елемент у кінець колекції

    public ImmutableLinkedList add(int index, Object e) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        else
            return null;
    } //додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableLinkedList addAll(Object[] c){
        if (c.length == 0){
            return this;
        }
        ImmutableLinkedList new_one = this;
        for (int i = 0; i < c.length; i++) {
            new_one = new_one.add(c[i]);
        }
            return new_one;
        } //додає масив елементів у кінець колекції

    public ImmutableLinkedList addAll(int index, Object[] c)throws IndexOutOfBoundsException{
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        else
        return null;
    } // додає масив елементів починаючи з зазначеного індекса, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public Object get(int index) throws IndexOutOfBoundsException{
        if (index >= this.size()){
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        LinkedNode first = this.head;
        while(counter < index){
          first = first.next;
            counter += 1;
        }
        return first.data;
    }

 //повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableLinkedList remove(int index)throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
//        if (index < 0 || index >= size()) {
//            throw new IndexOutOfBoundsException();
//        } else {
//            Object[] list = this.toArray();
//            Object[] new_list = new Object[size() - 1];
//            for (int i = 0; i < size(); i++) {
//                if (i < index) {
//                    new_list[i] = list[i];
//                } else if (i > index) {
//                    new_list[i] = list[i - 1];
//                }
//            }
//            ImmutableLinkedList remove_list = new ImmutableLinkedList(new_list);
        else
    return null;//видаляє елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції
    }
    public ImmutableLinkedList set(int index, Object e) throws IndexOutOfBoundsException{
//        if (index < 0 || index >= size()){
//            throw new InputMismatchException();
//        }
//        else{
//            Object[] list = this.toArray();
//            list[index] = e;
//            ImmutableLinkedList setList = new ImmutableLinkedList(list);
//            return setList;
//        }
        return null;}
//    } //змінює значення елементу за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public int indexOf(Object e) throws IndexOutOfBoundsException { //шукає індекс елемента (повертає індекс першого який знайшов, або -1 у випадку відсутності)
        int counter = size()-1;
        LinkedNode first = this.head;;
        while (first.next != null){
            first = first.next;
            counter -= 1;
            if (e == first.data) {
                return counter;
            }
        }
        return -1;
    }
    public int size() {//розмір колекції
        int size = 0;
        if (head!= null) {
            LinkedNode first = head;
            size += 1;
            while (first.getNext() != null) {
                first = first.getNext();
                size += 1;
            }
        }
        else
            return 0;
        return size;

    }

    public ImmutableLinkedList clear(){
        ImmutableLinkedList clearList = new ImmutableLinkedList(null);
        return this;
    } //очищує вміст колекції

    public boolean isEmpty(){
        return this.size() <= 0;
    } //якщо у колеції нема елементів то повертає true
    public Object[] toArray(){
        Object[] new_array = new Object[this.size()];
        int i = 1;
        LinkedNode first = this.head;
        while(first != null){
            new_array[new_array.length-i] = first.getData();
            first = first.getNext();
            i++;
        }
        return new_array;
    }

    @Override
    public String toString(){
        String str1 = "";
        LinkedNode first = this.head;
        if (first != null) {
            while (first.getNext() != null) {
                str1 = "," + first.getData() + str1;
                first = first.getNext();
            }
        }
        if (first != null){
            str1 = first.getData() + str1;
        }

        return str1;
    }

} //повертає рядок, де через кому відображаютсься елементи колекції

