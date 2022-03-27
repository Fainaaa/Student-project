package base;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentBaseProcessor {
    public List<Student> getListOfStudentsInFaculty(Student [] students, Faculty faculty){
        return Arrays.asList(students).stream().
                filter(student -> student.getUniversityInformation().getFaculty() == faculty).
                collect(Collectors.toList());
    }

    public Map<Faculty, List<Student>> groupByFaculty(Student [] students){
        Map<Faculty, List<Student>> studentsByFaculty= Arrays.asList(students).stream().
                collect(Collectors.groupingBy(Student::getStudentFaculty));
        return studentsByFaculty;
    }

    public Map<Integer, List<Student>> groupByCourseNumber(Student [] students){
        Map<Integer, List<Student>> studentsByFaculty= Arrays.asList(students).stream().
                collect(Collectors.groupingBy(Student::getStudentCourse));
        return studentsByFaculty;
    }


    public List<Student> getListOfStudentsWhoBornAfterCertainYear(Student [] students, int year){
        return Arrays.asList(students).stream().
                filter(student -> student.getBirthday().getYear() > year).
                collect(Collectors.toList());
    }

    public List<Student> getListOfStudentsOfCertainGroup(Student [] students, String groupId){
        return Arrays.asList(students).stream().
                filter(student -> student.getUniversityInformation().getGroupId().equals(groupId)).
                collect(Collectors.toList());
    }
}
