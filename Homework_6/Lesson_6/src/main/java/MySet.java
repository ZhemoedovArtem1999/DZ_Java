import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

public class MySet<T> {

    private LinkedHashMap<T, Object> map;
    private Object nullValue = new Object();

    public MySet() {
        map = new LinkedHashMap<T, Object>();
    }

    public boolean add(T value) {
        return map.put(value,nullValue) == null;
    }

    public boolean remove(T value) {
        return map.remove(value)==nullValue;
    }


    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public T get(int index) {
         return (T)map.keySet().toArray()[index]; // map.keySet().(index);
    }

    //public String toString()
    {
       // return map.keySet().toString();
    }

    public Iterator<T> iterator ()
    {
        return  map.keySet().iterator();
    }
}
