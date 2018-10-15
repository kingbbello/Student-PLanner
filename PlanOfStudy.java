public class PlanOfStudy
{
    @SuppressWarnings("unused") private Student student;
    private Degree degree;

    public PlanOfStudy()
    {
        student = new Student();
        degree = new Degree();
    }

    public void setDegreeProgram(Degree deg)
    {
        degree = deg;
    }

    public Degree getDegreeProgram()
    {
        return degree;
    }

    public void importData(String filename)
    {

    }

    public void savestate()
    {

    }

    public void addCourse(String courseCode, String semester)
    {

    }

    public void removeCourse(String courseCode, String semester)
    {

    }

    public void setCourseStatus(String courseCode, String semester, String courseStatus)
    {

    }

    public void setCourseGrade(String courseCode, String semester, String grade)
    {

    }

    public Course getCourse(String courseCode, String semester)
    {
        return null;

    }

}
