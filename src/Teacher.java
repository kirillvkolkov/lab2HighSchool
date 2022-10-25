public class Teacher implements UniversityStaff{
    private String name;
    private String surname;
    private String departmentName;
    private String sex;
    private String academicDegree;

    private String specialization;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    @Override
    public String getSex() {
        return sex;
    }
    public String setSex(Sex sex) {
        return this.sex = sex.name();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAcademicDegree(AcademicDegree academicDegree) {
        this.academicDegree = academicDegree.name();
    }
}
