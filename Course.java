/**
 * Description of class Student here.
 *
 *The class contains 6 methods and 3 fields. Itis a simple class with a bunch of getters and setters
 *
 * @author (Bello Mustapha Olakitan)
 * @version (01/10/2018)
 */
import java.util.ArrayList;
public class Course
{
    // instance variables 
    private String code;
	private String title;
    private double cCredit;
	private String status;
	private String cGrade;
	private String semesterTaken;;

    /**
     * Constructor for objects of class Student
     */
    public Course()
    {
        // initialise instance variables
        code = new String();
        title = new String();
        cCredit = 0.0;
        status = new String();
        cGrade = new String();
        semesterTaken = new String();
    }

    public String getCourseCode()
    {
        // put your code here
        return code;
    }
    
    public void setCourseCode(String courseCode)
    {
        // put your code here
        code = courseCode;
    }
    
    public String getCourseTitle() {
    	return title;
    }
    
    public void setCourseTitle(String courseTitle)
    {
        // put your code here
        title = courseTitle;
    }
    
    public double getCourseCredit()
    {
        // put your code here
        return cCredit;
    }
    
    public void setCourseCredit(double credit)
    {
        // put your code here
        cCredit = credit;
    }
      
    public ArrayList<Course> getPrerequisites()
    {
		
        // put your code here
    	return null;
    }
    
    public void setPrerequisites(ArrayList<Course> preReqList)
    {
        
    }
    
    public void setCourseStatus(String courseStatus) {
    	status = courseStatus;
    }
    
    public String getCourseStatus() {
    	return status;
    }
    
    public void setCourseGrade(String grade) {
    	cGrade = grade;
    }
    
    public String getCourseGrade() {
    	return cGrade;
    }
    
    public void setSemesterTaken(String semester) {
    	semesterTaken = semester;
    }
    
    public String getSemesterTaken() {
    	return semesterTaken;
    }

}
