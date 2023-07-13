import java.util.ArrayList;

public class lesson_6 {

    public static void main(String[] args) {
        MapH<Integer> mapH = new MapH<Integer>();
    }

    public class MapH<T>{

        private ArrayList<T> mapList;

        public MapH()
        {
            mapList = new ArrayList<T>();
        }
        public boolean add(T value)
        {
            if (mapList.contains(value))
            {
                return  false;
            }
            else
            {
                mapList.add(value);
            }

            return true;
        }

        public String toString()
        {

            return mapList.toString();
        }


    }
}


