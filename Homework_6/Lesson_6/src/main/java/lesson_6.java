import java.util.HashSet;
import java.util.Iterator;

public class lesson_6 {

    public static void main(String[] args) {
        MySet<Integer> setHash = new MySet<Integer>();

        setHash.add(123);
        setHash.add(1235);
        setHash.add(123);
        setHash.add(4525);
        setHash.add(452);
        setHash.add(368);
        setHash.add(2);
        setHash.add(75);
        setHash.add(452);
        setHash.add(563);
        setHash.add(653);
        setHash.add(88);

        System.out.println(setHash.toString());

        System.out.println(setHash.get(1));


        System.out.println(setHash.toString());
        setHash.remove(123);

        System.out.println(setHash.toString());

        Iterator iter = setHash.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println();
    }


}


