package base;
import java.time.LocalDate;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate birthday;
    private Address address;
    private UniversityInformation universityInformation;

    public class Address{
        private String city;
        private String street;
        private int houseId;
        private int flatId;
        private String phoneNumber;

        public Address(){ }

        public Address(String city, String street, int houseId, int flatId, String phoneNumber){
            this.city = city;
            this.street = street;
            this.houseId = houseId;
            this.flatId = flatId;
            this.phoneNumber = phoneNumber;
        }

        public Address(String city, String street, int houseId, String phoneNumber){
            this.city = city;
            this.street = street;
            this.houseId = houseId;
            this.phoneNumber = phoneNumber;
        }


        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }
        public void setStreet(String street) {
            this.street = street;
        }

        public int getHouseId() {
            return houseId;
        }
        public void setHouseId(int houseId) {
            this.houseId = houseId;
        }

        public int getFlatId() {
            return flatId;
        }
        public void setFlatId(int flatId) {
            this.flatId = flatId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            String info =  "Address{" + "fullAddress = '" + city + ','+ street + ' ' + houseId;
            if (flatId != 0){
                info += " flat  " + flatId;
            }
            return info += "', phoneNumber = '" + phoneNumber + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Address address = (Address) o;

            if (houseId != address.houseId) return false;
            if (flatId != address.flatId) return false;
            if (city != null ? !city.equals(address.city) : address.city != null) return false;
            if (street != null ? !street.equals(address.street) : address.street != null) return false;
            return phoneNumber != null ? phoneNumber.equals(address.phoneNumber) : address.phoneNumber == null;
        }

        @Override
        public int hashCode() {
            int result = city != null ? city.hashCode() : 0;
            result = 31 * result + (street != null ? street.hashCode() : 0);
            result = 31 * result + houseId;
            result = 31 * result + flatId;
            result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
            return result;
        }
    }

    public class UniversityInformation{

        private Degree degree;
        private Faculty faculty;
        private FacultyDirection facultyDirection;
        int courseId;
        private String groupId;

        public UniversityInformation(){

        }
        public UniversityInformation(Degree degree, Faculty faculty, FacultyDirection facultyDirection,
                                     int courseId, String enteredYear,
                                     int groupNumber) throws IllegalArgumentException{
            this.degree = degree;
            this.faculty = faculty;
            this.facultyDirection = facultyDirection;

            if (courseId > degree.getStudyingDurationYears()|| courseId < 0){
                throw new IllegalArgumentException("Invalid course number.");
            }
            else{
                this.courseId = courseId;
            }

            this.groupId = degree.name().charAt(0) + "." + facultyDirection + "." +
                    String.valueOf(enteredYear.charAt(enteredYear.length() - 2)) +
                    String.valueOf(enteredYear.charAt(enteredYear.length() - 1))
                    + "." + String.format("%02d", groupNumber);
        }


        public Degree getDegree() {
            return degree;
        }
        public void setDegree(Degree degree) {
            this.degree = degree;
        }

        public Faculty getFaculty() {
            return faculty;
        }
        public void setFaculty(Faculty faculty){
            this.faculty = faculty;
        }

        public FacultyDirection getFacultyDirection() {
            return facultyDirection;
        }
        public void setFacultyDirection(FacultyDirection facultyDirection) {
            this.facultyDirection = facultyDirection;
        }

        public int getCourseId() {
            return courseId;
        }
        public void setCourseId(int courseId) throws IllegalArgumentException {
            if (courseId <= degree.getStudyingDurationYears()|| courseId > 0)
                this.courseId = courseId;
            else
                throw new IllegalArgumentException("Invalid course number");
        }

        public String getGroupId() {
            return groupId;
        }
        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        @Override
        public String toString() {
            return "UniversityInformation{" +
                    "degree = " + degree +
                    ", faculty = " + faculty +
                    ", facultyDirection = " + facultyDirection +
                    ", courseId = " + courseId +
                    ", groupId = '" + groupId + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            UniversityInformation that = (UniversityInformation) o;

            if (courseId != that.courseId) return false;
            if (degree != that.degree) return false;
            if (faculty != that.faculty) return false;
            if (facultyDirection != that.facultyDirection) return false;
            return groupId != null ? groupId.equals(that.groupId) : that.groupId == null;
        }

        @Override
        public int hashCode() {
            int result = degree != null ? degree.hashCode() : 0;
            result = 31 * result + (faculty != null ? faculty.hashCode() : 0);
            result = 31 * result + (facultyDirection != null ? facultyDirection.hashCode() : 0);
            result = 31 * result + courseId;
            result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
            return result;
        }
    }

    public Student(){

    }

    public Student(int id, String lastName, String firstName, String patronymic,LocalDate birthday){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthday = birthday;
    }

    public Student(int id, String lastName, String firstName,LocalDate birthday){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public UniversityInformation getUniversityInformation(){
        return this.universityInformation;
    }
    public void setUniversityInformation(UniversityInformation universityInformation) {
        this.universityInformation = universityInformation;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        String info = "Student{" +
                "id = " + id +
                ", full Name ='" + lastName + ' ' + firstName + ' ';
        if(this.patronymic != null){
            info +=  patronymic;
        }
        info += "', birthday = " + birthday + '}';
        if(this.universityInformation != null)
            info += "\n" + this.universityInformation;
        if(this.address != null)
            info += "\n" + this.address;
        info += "\n___________________________________________________________________________________";
        return info;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;
        if (id != student.id) return false;
        if (lastName != null ? !lastName.equals(student.lastName) : student.lastName != null) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (patronymic != null ? !patronymic.equals(student.patronymic) : student.patronymic != null) return false;
        if (birthday != null ? !birthday.equals(student.birthday) : student.birthday != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        return universityInformation != null ? universityInformation.equals(student.universityInformation) : student.universityInformation == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (universityInformation != null ? universityInformation.hashCode() : 0);
        return result;
    }

    public Faculty getStudentFaculty(){
        return this.getUniversityInformation().getFaculty();
    }
    public Integer getStudentCourse(){
        return this.getUniversityInformation().courseId;
    }


}
