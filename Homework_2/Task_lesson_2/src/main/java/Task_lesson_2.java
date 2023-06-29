import java.util.Dictionary;
import java.util.Enumeration;

public class Task_lesson_2 {
    public static void main(String[] args) {

        //Task1();
        Task2();
    }

    static void Task1()
    {
        StringBuilder sb = new StringBuilder("select * from students where ");

        String filterJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        filterJson = filterJson.replace("{","");
        filterJson = filterJson.replace("}","");
        filterJson = filterJson.replace("\"","");
        String[] filterMas = filterJson.split(", ");
        for(int i = 0; i< filterMas.length;i++)
        {
            String[] filter = filterMas[i].split(":");
            if (!filter[1].equals("null"))
            {
                sb.append(filter[0] + " = \'" + filter[1] + "\' ");
                sb.append("and ");
            }

        }
        sb.replace(sb.length()-5, sb.length(), "");
        System.out.println(sb);
    }

    static void Task2(){
        String dataStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        StringBuilder result = new StringBuilder();

        dataStr = dataStr.replace("[", "");
        dataStr = dataStr.replace("]", "");
        dataStr = dataStr.replace("\"", "");

        String[] dataStudent = dataStr.split("},");

        String[] pattern = {"Студент "," получил "," по предмету "};

        for (int i = 0; i < dataStudent.length; i++)
        {
            dataStudent[i] = dataStudent[i].replace("{", "");
            dataStudent[i] = dataStudent[i].replace("}", "");

            String[] dataStudentMas = dataStudent[i].split(",");
            for (int j = 0; j < dataStudentMas.length;j++)
            {
                String resource = dataStudentMas[i].split(":")[1];

                result.append(pattern[j]);
                result.append(dataStudentMas[j].split(":")[1]);
            }
            result.append("\n");
        }

        System.out.println(result);


    }
}
