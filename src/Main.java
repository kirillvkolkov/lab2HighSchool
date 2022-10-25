public class Main {
    public static void main(String[] args) {
        Teacher rTurner = new Teacher();
        rTurner.setName("Ronald");
        rTurner.setSurname("Turner");
        rTurner.setSex(Sex.M);
        rTurner.setDepartmentName("Computer science");
        rTurner.setAcademicDegree(AcademicDegree.PHD);
        rTurner.setSpecialization("Programming paradigms");

        Teacher rHollings = new Teacher();
        rHollings.setName("Ruth");
        rHollings.setSurname("Hollings");
        rHollings.setSex(Sex.F);
        rHollings.setDepartmentName("Jurisprudence");
        rHollings.setAcademicDegree(AcademicDegree.MSC);
        rHollings.setSpecialization("Domestic arbitration");

        Student lWilkinson = new Student();
        lWilkinson.setName("Leo");
        lWilkinson.setSurname("Wilkinson");
        lWilkinson.setSex(Sex.M);
        lWilkinson.setDepartmentName("Computer science");
        lWilkinson.setCourseNumber("III");
        lWilkinson.setEducationLevel(EducationLevel.BACHELOR);

        Student aCunningham = new Student();
        aCunningham.setName("Anna");
        aCunningham.setSurname("Cunningham");
        aCunningham.setSex(Sex.F);
        aCunningham.setDepartmentName("World Economy");
        aCunningham.setCourseNumber("I");
        aCunningham.setEducationLevel(EducationLevel.BACHELOR);

        Student jLundqvist = new Student();
        jLundqvist.setName("Jill");
        jLundqvist.setSurname("Lundqvist");
        jLundqvist.setSex(Sex.F);
        jLundqvist.setDepartmentName("Jurisprudence");
        jLundqvist.setCourseNumber("I");
        jLundqvist.setEducationLevel(EducationLevel.MASTER);

        GraduatedStudent rCorrea = new GraduatedStudent();
        rCorrea.setName("Ronald");
        rCorrea.setSurname("Correa");
        rCorrea.setSex(Sex.M);
        rCorrea.setDepartmentName("Computer science");
        rCorrea.setDissertTheme("Design of a functional programming language");

        UniversityStaff[] universityStaff = new UniversityStaff[]{
                rTurner, rHollings, lWilkinson, aCunningham, jLundqvist, rCorrea};


        for (int i = 0; i < universityStaff.length; i++) {
            InformationPrinter.printAll(universityStaff[i]);
        }

    }
}