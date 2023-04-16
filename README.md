# ArrayList
#This code implements an ArrayList data structure in Java, which implements the MyList interface. 
#The ArrayList is a resizable array that can grow and shrink dynamically.
#Here is an explanation of the code:

     public class MyArrayList<T> implements MyList<T>  {

This line defines a class named MyArrayList that implements the MyList interface and has a type parameter T.

    private Object[] MyArray = new Object[5];
    private int size;
    
These lines declare two private instance variables: MyArray, 
which is an Object array that holds the elements of the list, and size,
which is an integer that represents the number of elements in the list.

    private void increaseArray(){
        int nextsize = size*2;
        Object[] newMyArray = new Object[nextsize];
        for (int i = 0; i < size; i++) {
         newMyArray[i]= MyArray[i];
        }
        MyArray = newMyArray;
    }
 
 This method is used to increase the size of the array when the list is full. It creates a new array with double the size 
 of the original array and copies the elements from the original array to the new array.
