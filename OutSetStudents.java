package AddStudentsPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class OutSetStudents {
    static int iL;
    static int iB;
    static int iC;
    static int iS;
    private ArrayList<String> NewStud = new ArrayList<>();{NewStud.add(0,null);}

    private ArrayList<Float> SredGrade = new ArrayList<>();
    private float ObGrade;
    private float ChisSum;

    Scanner ObScan = new Scanner(System.in);

    private int Grade;
    private ArrayList<Integer> GradeStudents = new ArrayList<>();

    private boolean BulLesson = true;
    private String test;
    private ArrayList<String> GetLessonMas = new ArrayList<>();

    protected String NameStudents;
    protected String Familing;

    void HellovingAndRegistrity(){
        System.out.println("      ##########\n" +
                "####### Hello! #######\n" +
                "# Registrity Student #\n" +
                "######################\n\n");
    }

    void GetNameAndFamiling(){
        System.out.print("Введите имя студента: ");
        ObScan.nextLine();
        NameStudents = ObScan.nextLine();

        System.out.print("Введите фамилию: ");
        Familing = ObScan.nextLine();

        NewStud.add(iS,NameStudents+ " " + Familing);
    }

    void GetLesson(){
        System.out.println("Введите все занятия через Enter");
        System.out.println("Для выхода посля набора всех предметов напишине e");
            for(; BulLesson == true; iL++){
                test = ObScan.nextLine();
                if(test.equals("e") || test.equals("е") || test.equals("E") || test.equals("Е")){
                    BulLesson = false;
                }else{
                    GetLessonMas.add(iL,test);
                }
        }
        GetGrade();
    }

    void GetGrade(){
        float testGrade;
        float ObSred = 0;
        int Chis = 0;
        System.out.println("\nВведите отметки через Enter для окончания введите любое число > 10");
        for(int b = 0; b < GetLessonMas.size(); b++){
            System.out.print(GetLessonMas.get(b) + ": \n");

            while(Grade < 11){
                Grade = ObScan.nextInt();
                GradeStudents.add(iB,Grade);

                iB++;

                if(Grade <= 10){
                    ObGrade += Grade;
                    ++ChisSum;
                }
            }
            System.out.print("Средняя оценка по предмету: ");
            testGrade = ObGrade / ChisSum;
            System.out.println(testGrade);
            ObSred += testGrade;
            Chis++;

            Grade = 0;
            ObGrade = 0;
            ChisSum = 0;
        }

        SredGrade.add(iC,ObSred / Chis);
        System.out.println("Средний балл: " + SredGrade.get(iC));
    }

    void OutStud(){
        if(NewStud.get(0) != null) {
            for(int i = 0; i < (NewStud.size() - 1); i++) {
                System.out.println(NewStud.get(i) + " Средний балл: " + SredGrade.get(i));
            }
        }else{
            System.out.println("Нет зарегестрированных студентов");
        }
    }
}
