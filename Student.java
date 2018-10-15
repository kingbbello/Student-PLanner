/**
 * The class Student is the most basic class in this project. It does not require any other class to function and is only called 
 *by one class(PlanOfStudy).
 *The class contains 6 methods and 3 fields. It is a simple class with a bunch of getters and setters
 *
 * @author (Bello Mustapha Olakitan)
 * @version (14/10/2018)
 */
public class Student
{
    // instance variables 
    private String firstName;
    private String lastName;
	private Integer studentNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // Initialize instance variables
        firstName = new String();
        lastName = new String();
        studentNumber = 0;
    }

    /**
     *gets the full name of a student
     *
     * @param  no parameter
     * @return the full name with first name followed by last name
     */
    public String getFullName()
    {
        // put your code here
        String fullName = firstName + " " + lastName;
        
        return fullName;
    }
    

    public void setFirstName(String first)
    {
        // put your code here
    	if(first!=null) {
    		firstName = first;
    	}
    }
    

    public void setLastName(String last)
    {
        // put your code here
    	if(last!=null) {
    		lastName = last;
    	}
    }
    

    public String getFirstName()
    {
        // put your code here
        return firstName;
    }
      

    public String getLastName()
    {
        // put your code here
        return lastName;
    }
    

    public void setStudentNumber(Integer studentNum)
    {
    	if(studentNum!=null) {
    		studentNumber = (int)(studentNum);
    	}
    }

    public Integer getStudentNumber()
    {
        return studentNumber;
    }
}
