import java.awt.*;
import java.util.Collection;
import java.util.List;

public class MyArrayList<T> implements MyList<T>  {
    private Object[] MyArray = new Object[5];
    private int size;
    private void increaseArray(){
        int nextsize = size*2;
        Object[] newMyArray = new Object[nextsize];
        for (int i = 0; i < size; i++) {
         newMyArray[i]= MyArray[i];
        }
        MyArray = newMyArray;
    }

    @Override
    public void add(T item){
        if(size == MyArray.length){
            increaseArray();
        }
        MyArray[size++]= item;
    }

    @Override
    public void add(T item, int index) {
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        if(size == MyArray.length){
            increaseArray();
        }
        for (int i = size-1; i >= index ; i--) {
            MyArray[i+1] = MyArray[i] ;
        }
        MyArray[index] = item;
        size++;
    }


    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            MyArray[i] = null;
        }
    }
    @Override
    public T get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        return (T) MyArray[index];
    }

    @Override
    public int indexOf(Object O) {
        for (int i = 0; i < size-1; i++) {
            if (O == MyArray[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object O) {
        for (int i = size-1; i >= 0; i--) {
            if (MyArray[i].equals(O)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(MyArray[i]>MyArray[i+1]){
                    T temp = (T) MyArray[j];
                    MyArray[j] = MyArray[j + 1];
                    MyArray[j+1]= temp;
                }
            }
        }
        }

   @Override
    public boolean remove(Object O){
        for (int i = 0; i < size; i++) {
            if(MyArray[i].equals(O)){
                for (int j = i; j < size-1; j++) {
                    MyArray[j]= MyArray[j+1];
                }
                size--;
                return true;
            }
        }
        size--;
        return false;
    }


    public int size(){
        return size;
    }

    @Override
    public boolean contains(Object O) {
        for (int i = 0; i < size; i++) {
            if(MyArray[i].equals(O)){
                return true;
            }
        }
        return false;
    }

}


