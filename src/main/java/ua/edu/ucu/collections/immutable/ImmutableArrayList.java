package ua.edu.ucu.collections.immutable;

public class ImmutableArrayList implements ImmutableList {
    private int size = 0;
    private final Object[] elements;

    public ImmutableArrayList(Object[] elements) {
        this.elements = elements;
    }

    public ImmutableArrayList add(Object e) {
        Object[] new_list = new Object[size() + 1];
        if (size() == 0){
            new_list[0] = e;
        }
        else{
        for (int i = 0; i < elements.length; i++)
            new_list[i] = elements[i];}
        new_list[this.size()] = e;
        ImmutableArrayList addList = new ImmutableArrayList(new_list);
        return addList;
    }
    //додає елемент у кінець колекції

    public ImmutableArrayList add(int index, Object e) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] new_list = new Object[size() + 1];
            for (int i = 0; i < index; i++){
                new_list[i] = elements[i];
            }
            new_list[index] = e;
            for (int i = index; i < size(); i++){
                new_list[i + 1] = elements[i];
            }
            ImmutableArrayList addedList = new ImmutableArrayList(new_list);
            return addedList;
        }
    } //додає елемент до колекції за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableArrayList addAll(Object[] c)//додає масив елементів у кінець колекції
    {
        int l = 0;
        Object[] new_list_1 = new Object[size() + c.length];
        for (int i = 0; i < size(); i++){
            new_list_1[i] = elements[i];
        }
        for (int j = size(); j < new_list_1.length; j++) {
            new_list_1[j] = c[l];
            l += 1;
        }

        ImmutableArrayList addList = new ImmutableArrayList(new_list_1);

        return addList;
    }

    public ImmutableArrayList addAll(int index, Object[] c) throws IndexOutOfBoundsException // додає масив елементів починаючи з зазначеного індекса,
    {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else
            {
            Object[] new_list_2 = new Object[size() + c.length];
            for (int i = 0; i < index; i++){
                new_list_2[i] = elements[i];
            }
            int l = 0;
            for (int j = index; j < new_list_2.length - c.length + 1; j++) {
                new_list_2[j] = c[l];
                l += 1;
            }
            for (int k = index + c.length; k < new_list_2.length; k++){
                new_list_2[k] = elements[index];
                index ++;
            }
        ImmutableArrayList addList = new ImmutableArrayList(new_list_2);

        return addList;
    }}
    // та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {

            return elements[index];
        }
    }

    //повертає елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableArrayList remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] new_list = new Object[size() - 1];
            for (int j = 0; j < index; j++){
                new_list[j] = elements[j];
            }
            int l = index;
            for (int i = index + 1; i < size(); i++){
                new_list[l] = elements[i];
                l++;
            }
            ImmutableArrayList remove_list = new ImmutableArrayList(new_list);
            return remove_list;
        }
    }
    //видаляє елемент за індексом, та кидає виключну ситуацію, якщо індекс виходить за межі колекції

    public ImmutableArrayList set(int index, Object e) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object[] list = this.toArray();
            list[index] = e;
            ImmutableArrayList setList = new ImmutableArrayList(list);
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

    public int size() {
        if (elements != null) {
            return elements.length;
        }
        else
            return 0;
    } //розмір колекції

    public ImmutableArrayList clear() {
        ImmutableArrayList clearList = new ImmutableArrayList(null);
        return this;
    } //очищує вміст колекції

    public boolean isEmpty() {
        if (this.size() > 0) {
            return false;
        } else
            return true;

    } //якщо у колеції нема елементів то повертає true

    public Object[] toArray() { //перетворює колекцію до масиву обєктів
        Object[] list = new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            list[i] = this.get(i);
        }
        return list;
    }

    @Override
    public String toString() {
        String str1 = "";
        for (int i = 0; i < size()-1; i++){
            str1 += elements[i];
            str1 += ",";
        }
        str1 += elements[size() - 1];
        return str1;
    }

}