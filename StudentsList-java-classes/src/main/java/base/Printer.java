package base;

import java.util.List;
import java.util.Map;

public class Printer {
    public static void printStudentsArray(Student [] students){
        for(int i = 0; i < students.length; i ++) {
            System.out.println(students[i].toString() + "\n");
        }
    }
    public static void printStudentsList(List<Student> studentsList){
        if (studentsList.isEmpty()){
            System.out.println("No matches found");
        }
        else {
            for (Student s : studentsList) {
                System.out.println(s);
                System.out.println();
            }
        }
    }
    public static void printStudentsGroupByFaculty(Map<Faculty, List<Student>> studentsByFaculty){
        for (Faculty key : studentsByFaculty.keySet()) {
            System.out.println("\n" + key.getFullName() + "\n");
            for(Student student: studentsByFaculty.get(key)){
                System.out.println(student);
            }
        }
    }

    public static void printStudentsGroupByCourseNumber(Map<Integer, List<Student>> studentsByCourse){
        for (Integer key : studentsByCourse.keySet()) {
            System.out.println("\nCOURSE NUMBER: " + key + "\n");
            for(Student student: studentsByCourse.get(key)){
                System.out.println(student);
            }
        }
    }
}
