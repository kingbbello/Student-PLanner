import java.util.ArrayList;
public class Degree
{
    // instance variables - replace the example below with your own
    private String degreeTitle;
    private ArrayList<String> requiredCoursecodes;

    /**
     * Constructor for objects of class Degree
     */
    public Degree()
    {
        degreeTitle =new String();
        requiredCoursecodes = new ArrayList<String>();
    }


    public String getDegreeTitle()
    {
        // put your code here
        return degreeTitle;
    }
    
    public void setDegreeTitle(String title) {
    	degreeTitle = title;
    }
    
    public void setRequiredCourse(ArrayList<String> listOfRequiredCourseCodes) {
    	int i =0;
    	if(listOfRequiredCourseCodes!=null) {
	    	for(i=0; i<listOfRequiredCourseCodes.size();i++) {
	    		requiredCoursecodes.add(listOfRequiredCourseCodes.get(i));
	    	}
    	}
    }
    
    public ArrayList<Course> getRequiredCourses(){
    	CourseCatalog catalog = new CourseCatalog();
    	ArrayList<Course> requiredCourses = new ArrayList<Course>();
    	
    	for(int i =0; i<requiredCoursecodes.size(); i++) {
    		requiredCourses.add(catalog.findCourse(requiredCoursecodes.get(i)));
    	}
    	return requiredCourses;
    }
    
    public boolean meetRequirements(PlanOfStudy thePlan) {
    	return false;
    }
    
    public double numberOfCreditsRemaining(PlanOfStudy thePlan) {
    	return 0.0;
    }
    
    public ArrayList<Course> remainingRequiredCourses(PlanOfStudy thePlan){
    	ArrayList<Course> uncompleted = new ArrayList<Course>();
    	return uncompleted;
    }
    
}
