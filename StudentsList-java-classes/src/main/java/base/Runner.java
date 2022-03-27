package base;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Runner
{
    public static void main( String[] args )
    {
        StudentBaseProcessor studentBaseProcessor = new StudentBaseProcessor();
        Student [] students = StudentBaseCreator.createStudentsArray();
        Scanner in = new Scanner(System.in);
        System.out.println("1 - VIEW ALL STUDENTS\n2 - VIEW STUDENTS OF INFORMATION TECHNOLOGY FACULTY"+
                "\n3 - VIEW STUDENTS GROUPING BY FACULTY\n4 - VIEW STUDENTS GROUPING BY COURSE"+
                "\n5 - VIEW STUDENTS BORN AFTER 2002 YEAR\n6 - VIEW STUDENTS OF 'B.AI.19.01' GROUP"+
                "\n0 - EXIT\nCHOICE: ");
        int choice = in.nextInt();
        while (choice != 0){
            if (choice == 1){
                System.out.println("\t\t\t\t\tALL STUDENTS\n");
                Printer.printStudentsArray(students);
            }
            else if (choice == 2){
                System.out.println("\t\t\t\t\tSTUDENTS OF " + Faculty.ITF.getFullName() + "\n");
                Printer.printStudentsList(
                        studentBaseProcessor.getListOfStudentsInFaculty(students, Faculty.ITF));
            }
            else if (choice == 3){
                System.out.println("\n\t\t\t\t\tGROUP BY FACULY");
                Printer.printStudentsGroupByFaculty(studentBaseProcessor.
                        groupByFaculty(students));
            }
            else if (choice == 4){
                System.out.println("\n\t\t\t\t\tGROUP BY COURSE");
                Printer.printStudentsGroupByCourseNumber(studentBaseProcessor.
                        groupByCourseNumber(students));
            }
            else if (choice == 5){
                int year = 2002;
                System.out.println("STUDENTS BORN AFTER " + year +" YEAR");
                Printer.printStudentsList(
                        studentBaseProcessor.getListOfStudentsWhoBornAfterCertainYear(students, year));
            }
            else if (choice == 6){
                String groupId = "B.AI.19.01";
                System.out.println("\n\t\t\t\t\tSTUDENTS WHO ARE IN " + groupId + " GROUP\n");
                Printer.printStudentsList(
                        studentBaseProcessor.getListOfStudentsOfCertainGroup(students, groupId));
            }
            else{
                System.out.println("Invalid choice number");
            }
            System.out.println("1 - VIEW ALL STUDENTS\n2 - VIEW STUDENTS OF INFORMATION TECHNOLOGY FACULTY"+
                    "\n3 - VIEW STUDENTS GROUPING BY FACULTY\n4 - VIEW STUDENTS GROUPING BY COURSE"+
                    "\n5 - VIEW STUDENTS BORN AFTER 2002 YEAR\n6 - VIEW STUDENTS OF 'B.AI.19.01' GROUP"+
                    "\n0 - EXIT\nCHOICE:");
            choice = in.nextInt();
        }
    }
}
