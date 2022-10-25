public class InformationPrinter {
    public static void printAll(UniversityStaff personInfo) {
        String sex;
        String teachOrStudy;

        if (personInfo.getSex() == "M") {
            sex = "He";
        } else {
            sex = "She";
        }

        if (personInfo.getClass().getName() == "Student") {
            Student student = (Student)personInfo;
            teachOrStudy = "studies";
            System.out.printf("This is " + student.getSurname() + " " + student.getName() +
                    ". " + sex + " " + teachOrStudy + " " + student.getDepartmentName() + ".\n" +
                    sex + " is " + student.getCourseNumber() +"'th year " + student.getEducationLevel() + "\n");
        } else if (personInfo.getClass().getName() == "Teacher") {
            Teacher teacher = (Teacher) personInfo;
            teachOrStudy = "teaches";
            System.out.printf("This is " + personInfo.getSurname() + " " + personInfo.getName() +
                    ". " + sex + " " + teachOrStudy + " " + personInfo.getDepartmentName() + "\n" +
                    sex + " has " + teacher.getAcademicDegree() + " degree in " + teacher.getSpecialization() + "\n");
        } else {
            GraduatedStudent graduatedStudent = (GraduatedStudent) personInfo;
            if (sex == "He") {
                sex = "His";
            } else {
                sex = "Her";
            }

            System.out.println(sex + " thesis title is " + graduatedStudent.getDissertTheme() + "\n");
        }
    }
}
