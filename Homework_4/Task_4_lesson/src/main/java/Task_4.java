import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Task_4 {

    static Scanner scan;

    static int count = 0;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        boolean isClose = false;

        ArrayList<ArrayList> db = new ArrayList<>();

        ArrayList<String> surNames = new ArrayList<>();
        //surNames.add("dfklglk");
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        db.add(surNames);
        db.add(firstNames);
        db.add(lastNames);
        db.add(ages);
        db.add(genders);
        db.add(id);



        while (!isClose)
        {
            System.out.println("Выберите действие:\n" +
                    "1 - Добавить пользователя\n" +
                    "2 - Вывести пользователей\n" +
                    "3 - Сортировка по возрасту\n" +
                    "4 - Сортировка по возрасту и полу\n" +
                    "5 - Возврат в исходное состояние\n" +
                    "6 - Выход");
            int action = scan.nextInt();
            switch (action) {
                case 1:
                    add(db);
                    break;
                case 2:
                    printDB(db);
                    break;
                case 3:
                    sortAge(db);
                    break;
                case 4:
                    sortAgeAndGender(db);
                    break;
                case 5:
                    returnDB(db);
                    break;
                case 6:
                    isClose = true;
                    break;

            }

        }

        db.add(null);
    }

    static void add(ArrayList db)
    {
        String patternInput[] = {"фамилию","имя","отчество","возраст","пол"};
        /*System.out.print("Введите фамилию - ");
        String surName = scan.nextLine();
        System.out.print("Введите имя - ");
        String firstName = scan.nextLine();
        System.out.print("Введите отчество - ");
        String lastName = scan.nextLine();
        System.out.print("Введите возраст - ");
        String age = scan.nextLine();
        System.out.print("Введите пол - ");
        String gender = scan.nextLine();*/
        Scanner scaner = new Scanner(System.in);
        for (int i = 0; i < patternInput.length; i++)
        {
            ArrayList inputTemp = (ArrayList)db.get(i);
            System.out.printf("Введите %s - ", patternInput[i]);

            if (i == 3)
            {
                int dataInput = Integer.parseInt(scaner.nextLine());

                inputTemp.add(dataInput);
            }
            else {
                String dataInput = scaner.nextLine();

                inputTemp.add(dataInput);
            }

        }

        ArrayList indexes = (ArrayList) db.get(patternInput.length);
        indexes.add(count);
        count++;
    }

    static void printDB(ArrayList db)
    {
        String resultLine = "";
        String result = "";
        ArrayList<Integer> indexes = (ArrayList<Integer>) db.get(db.size()-1);

        for (int i = 0; i < indexes.size(); i++)
        {
            int index = indexes.get(i);
            for (int j = 0; j < db.size()-1; j++)
            {
                ArrayList tmp = (ArrayList) db.get(j);
                resultLine += tmp.get(index) + " ";
            }
            result += resultLine + '\n';
            resultLine = "";
        }
        System.out.println(result);
    }

    static void sortAge(ArrayList db)
    {
        ArrayList<Integer> indexes = (ArrayList) db.get(db.size()-1);
        ArrayList<Integer> ages = (ArrayList<Integer>) db.get(3);

        indexes.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return ages.get(o1) - ages.get(o2);
            }
        });
    }

    static void sortAgeAndGender(ArrayList db)
    {
        ArrayList<Integer> indexes = (ArrayList) db.get(db.size()-1);
        ArrayList<Integer> ages = (ArrayList<Integer>) db.get(3);
        ArrayList<String> genders = (ArrayList<String>) db.get(4);
        indexes.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int ageCompare = ages.get(o1) - ages.get(o2);
                if (ageCompare != 0)
                    return ages.get(o1) - ages.get(o2);
                else
                    return genders.get(o1).compareTo(genders.get(o2));
            }
        });
    }



    static void returnDB(ArrayList db)
    {
        ArrayList indexes = (ArrayList) db.get(db.size()-1);
        int count = indexes.size();
        indexes.clear();
        for(int i = 0; i < count; i++)
        {
            indexes.add(i);
        }
    }

}
