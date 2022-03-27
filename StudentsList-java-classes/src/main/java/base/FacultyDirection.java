package base;

public enum FacultyDirection {
    ICQ("INFORMATICS AND COMPUTER EQUIPMENT", "01"),
    IST("INFORMATION SYSTEMS AND TECHNOLOGIES", "02"),
    AI("APPLIED INFORMATICS", "03"),
    SE("SOFTWARE ENGINEERING", "04"),

    TPP("TECHNOLOGY OF POLYMER PROCESSING","01"),
    TBAS("TECHNOLOGY OF BIOLOGY ACTIVE SUBSTANCES", "02"),

    TME("TECHNOLOGICAL MACHINES AND EQUIPMENT", "02"),
    TPPA("TECHOLOGICAL PROCESS AND PRODUCTION AUTOMATISATION", "03"),
    MBITS("MACHINE-BUILDING INDUSTRIES TECHNOLOGICAL SUPPORT", "03"),

    EAA("ECONOMIC ACCOUNTING AND AUDIT", "01"),
    FC("FINANCES AND CREDIT", "02"),
    PM("PERSONNEL MANAGEMENT", "03"),
    TB("TRADING BUSINESS", "04");

    private String fullName;
    private String directionCode;

    private FacultyDirection(String fullName, String directionCode){
        this.fullName = fullName;
        this.directionCode = directionCode;
    }
    private FacultyDirection(){
    }

    public String getFullName() {
        return fullName;
    }

    public String getDirectionCode() {
        return directionCode;
    }
}

