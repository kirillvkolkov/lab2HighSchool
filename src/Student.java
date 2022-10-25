public class Student implements UniversityStaff{
    private String name;
    private String surname;
    private String departmentName;
    private String sex;
    private String courseNumber;

    private String educationLevel;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String getSex() {
        return sex;
    }

    public String setSex(Sex sex) {
        return this.sex = sex.name();
    }

    public void setEducationLevel(EducationLevel educationLevel) {
         this.educationLevel = educationLevel.name();
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public String getCourseNumber() {
        return this.courseNumber;
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

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
}
