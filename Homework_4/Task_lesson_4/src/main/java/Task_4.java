import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_4 {

    static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        boolean isClose = false;

        ArrayList<ArrayList<String>> db = new ArrayList<>();

        ArrayList<String> surNames = new ArrayList<>();
        //surNames.add("dfklglk");
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> ages = new ArrayList<>();
        ArrayList<String> genders = new ArrayList<>();

        db.add(surNames);
        db.add(firstNames);
        db.add(lastNames);
        db.add(ages);
        db.add(genders);



        while (!isClose)
        {
            System.out.println("Выберите действие:\n1 - Добавить пользователя\n2 - Вывести пользователей\n3 - Сортировка по возрасту\n4 - Сортировка по возрасту и полу\n5 - Выход");
            int action = scan.nextInt();
            switch (action) {
                case 1:
                    add(db);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
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

        for (int i = 0; i < patternInput.length; i++)
        {
            ArrayList<String> inputTemp = (ArrayList<String>)db.get(i);
            System.out.printf("Введите %s - ", patternInput[i]);
            String dataInput = scan.nextLine();

            inputTemp.add(dataInput);
        }
    }
}
