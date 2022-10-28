package AddStudentsPackage;

public class SettingsStudentInfo extends OutSetStudents {
    private static boolean TestOtv = true;

    private int otv;
    private String otvFin;

    void Menu(){
        System.out.println("\n##########\n" +
                "## Menu ##\n" +
                "##########");
        System.out.println("1) Зарегестрировать студента");
        System.out.println("2) Все зарегестрированные студенты");
        System.out.println("Для выхода нажмите 5\n");
        System.out.print("Ввод: ");

        otv = ObScan.nextInt();

        switch(otv){

            case 1:

                if(TestOtv == true) {
                    HellovingAndRegistrity();
                    GetNameAndFamiling();
                    GetLesson();
                    TestOtv = false;
                }else{
                    HellovingAndRegistrity();
                    GetNameAndFamiling();
                    GetGrade();
                }


                System.out.print("\nДля выхода введите e: ");
                ObScan.nextLine();
                otvFin = ObScan.nextLine();

                if(otvFin.equals("e") || otvFin.equals("е") || otvFin.equals("E") || otvFin.equals("Е")) {
                    Menu();
                }
                break;

            case 2:
                OutStud();

                System.out.print("\nДля выхода введите e: ");
                ObScan.nextLine();
                otvFin = ObScan.nextLine();

                if(otvFin.equals("e") || otvFin.equals("е") || otvFin.equals("E") || otvFin.equals("Е")) {
                    Menu();
                }
                break;

            case 5:
                System.exit(0);
        }
    }
}
