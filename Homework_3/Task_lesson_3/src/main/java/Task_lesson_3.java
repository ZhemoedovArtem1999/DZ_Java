import java.util.ArrayList;
import java.util.Random;

public class Task_lesson_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 15; i++)
        {
            list.add(new Random().nextInt(20));
        }
        System.out.println("Исходный список:");
        for(int item : list)
        {
            System.out.print(item + " ");
        }
        System.out.println("\nСписок с удаленными четными элементами:");
        ArrayList<Integer> newList = DeleteEvenNumbers(list);
        for(int item : newList)
        {
            System.out.print(item + " ");
        }


    }

    static ArrayList<Integer> DeleteEvenNumbers(ArrayList<Integer> list){
        ArrayList<Integer> cloneList = (ArrayList<Integer>) list.clone();

        ArrayList<Integer> removeElem = new ArrayList<>();
        for(int item : cloneList)
        {
            if (item % 2 == 0)
            {
                removeElem.add(item);
            }
        }
        cloneList.removeAll(removeElem);
        return  cloneList;
    }

    static int MinValue(ArrayList<Integer> list)
    {
        return 0;
    }

    static int MaxValue(ArrayList<Integer> list)
    {
        return 0;
    }

    static double AvgValue(ArrayList<Integer> list)
    {
        return 0;
    }


}
