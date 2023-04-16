import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        MyArrayList<Double> newarray = new MyArrayList<>();
        newarray.add(1.5);
        newarray.add(1.7);
        newarray.add(1.2);
        newarray.add(4.0);
        newarray.add(6.0);
        newarray.add(1.7);
        newarray.add(99.0, 2);



        for (int i = 0; i < newarray.size() ; i++) {
            System.out.print(newarray.get(i)+" ");
        }



    }
}