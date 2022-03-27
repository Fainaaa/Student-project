package base;
import java.time.LocalDate;

public class StudentBaseCreator {
    public static Student[] createStudentsArray(){
        Student [] studentsArray = new Student[8];
        try {
            studentsArray[0] = new Student(1, "Ivanov", "Ivan", "Ivanovich",
                    LocalDate.of(2002, 1, 10));
            studentsArray[0].setUniversityInformation(studentsArray[0].
                    new UniversityInformation(Degree.BACHELOR,
                    Faculty.ITF, FacultyDirection.AI, 3, Integer.toString(2019), 1));
            studentsArray[0].setAddress(studentsArray[0].
                    new Address("Tver", "Lenina Avenue", 10, 1, "+7(919)0585230"));

            studentsArray[1] = new Student(2, "Petrov", "Petr", "Petrovich",
                    LocalDate.of(2001, 2, 11));
            studentsArray[1].setUniversityInformation(studentsArray[1].new UniversityInformation(Degree.BACHELOR,
                    Faculty.ITF, FacultyDirection.SE, 4, Integer.toString(2018), 1));
            studentsArray[1].setAddress(studentsArray[1].
                    new Address("Tver", "Lenina Avenue", 12, 22, "+7(919)0595280"));

            studentsArray[2] = new Student(3, "Sidorov", "Semen", "Semenovich",
                    LocalDate.of(2003, 9, 2));
            studentsArray[2].setUniversityInformation(studentsArray[2].new UniversityInformation(Degree.BACHELOR,
                    Faculty.CTF, FacultyDirection.TBAS, 2, Integer.toString(2020), 1));
            studentsArray[2].setAddress(studentsArray[2].new Address("Tver", "Tichvinskaya", 2,  "+7(915)7006578"));

            studentsArray[3] = new Student(4, "Blinova", "Alexandra", "Alexandrovna",
                    LocalDate.of(2002, 8, 21));
            studentsArray[3].setUniversityInformation(studentsArray[3].new UniversityInformation(Degree.BACHELOR,
                    Faculty.ITF, FacultyDirection.AI, 3, Integer.toString(2019), 1));
            studentsArray[3].setAddress(studentsArray[3].new Address("Tver", "Kalinina Avenue", 13, 23,  "+7(915)7016578"));

            studentsArray[4] = new Student(5, "Polozova", "Polina", "Vyacheslavovna",
                    LocalDate.of(2002, 1, 1));
            studentsArray[4].setUniversityInformation(studentsArray[4].new UniversityInformation(Degree.BACHELOR,
                    Faculty.ITF, FacultyDirection.AI, 3, Integer.toString(2019), 1));
            studentsArray[4].setAddress(studentsArray[4].new Address("Tver", "Chromova", 10, 52,  "+7(904)7016570"));

            studentsArray[5] = new Student(6, "Korolev", "Alexey", "Sergeevich",
                    LocalDate.of(2004, 9, 1));
            studentsArray[5].setUniversityInformation(studentsArray[5].new UniversityInformation(Degree.BACHELOR,
                    Faculty.CTF, FacultyDirection.TPP, 1, Integer.toString(2021), 2));
            studentsArray[5].setAddress(studentsArray[5].new Address("Tver", "Borisa Polevogo", 1, 1,  "+7(915)7022578"));

            studentsArray[6] = new Student(7, "Aliev", "Kamil",
                    LocalDate.of(2004, 3, 2));
            studentsArray[6].setUniversityInformation(studentsArray[5].new UniversityInformation(Degree.BACHELOR,
                    Faculty.CTF, FacultyDirection.TPP, 1, Integer.toString(2021), 2));
            studentsArray[6].setAddress(studentsArray[6].new Address("Tver", "Gorkogo", 10, 10,  "+7(915)71236578"));

            studentsArray[7] = new Student(8, "Kusnetsov", "Dmitry", "Vladimirovich",
                    LocalDate.of(2001, 1, 31));
            studentsArray[7].setUniversityInformation(studentsArray[7].
                    new UniversityInformation(Degree.BACHELOR,
                    Faculty.BMF, FacultyDirection.MBITS, 4, Integer.toString(2018), 3));
            studentsArray[7].setAddress(studentsArray[7].
                    new Address("Tver", "Trechsvyatskaya", 21, 22, "+7(919)1234230"));
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        return studentsArray;
    }
}
