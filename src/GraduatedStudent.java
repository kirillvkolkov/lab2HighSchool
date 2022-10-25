public class GraduatedStudent implements UniversityStaff{
    private String name;
    private String surname;
    private String departmentName;
    private String sex;

    private String dissertTheme;

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

    public String getDissertTheme() {
        return dissertTheme;
    }

    public String setSex(Sex sex) {
        return this.sex = sex.name();
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

    public void setDissertTheme(String dissertTheme) {
        this.dissertTheme = dissertTheme;
    }
}
