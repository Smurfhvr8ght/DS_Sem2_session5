import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static LinkedList<Integer> numList = new LinkedList<Integer>();
    public static void add(int num) {
        numList.add(num);
    }
    public static void remove(int num) {
        int x = 0;
        boolean find = false;
        for (int i: numList) {
            if (i == num) {
                find = true;
                break;
            }
            x++;
        }
        if (find) {
            numList.remove(x);
        }
    }
    public static String findMiddle() {
        Object[] temp = numList.toArray();
        int size = temp.length;
        int middleIndex = (size/2) + 1;
        Iterator<Integer> point = numList.iterator();
        for (int i = 1; i < middleIndex; i++) {
            point.next();
        }
        return "Middle Element: " + point.next();
    }
    public static void reverse() {
        LinkedList<Integer> temp = new LinkedList<Integer>(numList.reversed());
        numList = temp;
    }
    public static void print(){
        Object[] temp = numList.toArray();
        int size = temp.length;
        Iterator<Integer> point = numList.iterator();
        for (int i = 0; i < size; i++) {
            System.out.print(point.next());
            System.out.print(" -> ");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        //original
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        System.out.println("Original List:");
        print();
        //remove
        remove(3);
        System.out.println("After Removing 3:");
        print();
        //middle
        System.out.println(findMiddle());
        //reverse
        System.out.println("Reversed List:");
        reverse();
        print();
    }
}