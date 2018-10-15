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
	private String semesterTaken;
	private ArrayList<Course> prereq;

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
        prereq = new ArrayList<Course>();
        
    }
    public Course(String code,String title,double cCredit, String status,String cGrade,String semesterTaken)
    {
        // Initialize instance variables
        this.code = code;
        this.title = title;
        this.cCredit= cCredit;
        this.status = status;
        this.cGrade = cGrade;
        this.semesterTaken = semesterTaken;
    }
    
    public Course(Course copy) {
    	System.out.println("copy constructor called");
    	Course newCourse = new Course();
    	newCourse.code = copy.code;
    	newCourse.title = copy.title;
    	newCourse.cCredit = copy.cCredit;
    	newCourse.status = copy.status;
    	newCourse.cGrade = copy.cGrade;
    	newCourse.semesterTaken = copy.semesterTaken;
    	newCourse.prereq = new ArrayList<Course>();
    	for(Course eachCourse: copy.prereq) {
    		newCourse.prereq.add(eachCourse);
    	}
    	
    }

    public String getCourseCode()
    {
        // put your code here
        return code;
    }
    
    public void setCourseCode(String courseCode)
    {
        // put your code here
    	if(courseCode!=null) {
    		code = courseCode;
    	}
    }
    
    public String getCourseTitle() {
    	return title;
    }
    
    public void setCourseTitle(String courseTitle)
    {
        // put your code here
    	if(courseTitle!=null) {
    		title = courseTitle;
    	}
    }
    
    public double getCourseCredit()
    {
        // put your code here
        return cCredit;
    }
    
    public void setCourseCredit(double credit)
    {
        // put your code here
    	if(credit>=0) {
    		cCredit = credit;
    	}
    }
      
    public ArrayList<Course> getPrerequisites()
    {
		
        // put your code here
    	return prereq;
    }
    
    public void setPrerequisites(ArrayList<Course> preReqList)
    {
    	if(preReqList != null) {
    		prereq = preReqList;
    	}
    }
    
    public void setCourseStatus(String courseStatus) {
    	if(courseStatus!=null) {
    		status = courseStatus;
    	}
    }
    
    public String getCourseStatus() {
    	return status;
    }
    
    public void setCourseGrade(String grade) {
    	if(grade!= null && grade.charAt(0)!= '-') {
    		cGrade = grade;
    	}
    }
    
    public String getCourseGrade() {
    	return cGrade;
    }
    
    public void setSemesterTaken(String semester) {
    	if(semester != null) {
    		semesterTaken = semester;
    		
    	}
    }
    
    public String getSemesterTaken() {
    	return semesterTaken;
    }

}
