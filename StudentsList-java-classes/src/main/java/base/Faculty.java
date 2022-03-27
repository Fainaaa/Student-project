package base;
import java.util.ArrayList;
public enum Faculty {
    ITF("INFORMATION TECHNOLOGY FACULTY", "09"),
    CTF("CHEMICAL AND TECHNOLOGY FACULTY","18"),
    BMF("BUILDING MACHINE FACULTY", "15"),
    EPMF("ECONOMIC AND PRODUCTION MANAGEMENT FACULTY", "39");

    private String fullName;
    private String facultyCode;
    private Faculty(String fullName, String facultyCode){
        this.fullName = fullName;
        this.facultyCode = facultyCode;
    }
    private Faculty(){
    }

    public String getFullName() {
        return fullName;
    }

    public String getFacultyCode() {
        return facultyCode;
    }
}
