/**
 * Description of class Student here.
 *
 *The class contains 6 methods and 3 fields. It is a simple class with a bunch of getters and setters
 *
 * @author (Bello Mustapha Olakitan)
 * @version (01/10/2018)
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
        // initialise instance variables
        firstName = new String();
        lastName = new String();
        studentNumber = 0;
    }

    /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public String getFullName()
    {
        // put your code here
        String fullName = firstName + " " + lastName;
        
        return fullName;
    }
    
    /**
     * method to get the full name of a student
     *
     * @param  S
     * @return the full name in manner (firstname) (lastname)
     */
    public void setFirstName(String first)
    {
        // put your code here
        firstName = first;
    }
    
    /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public void setLastName(String last)
    {
        // put your code here
        lastName = last;
    }
    
       /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public String getFirstName()
    {
        // put your code here
        return firstName;
    }
      
           /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public String getLastName()
    {
        // put your code here
        return lastName;
    }
    
    /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public void setStudentNumber(Integer studentNum)
    {
        studentNumber = (int)(studentNum);
    }
    
        /**
     * method to get the full name of a student
     *
     * @param  no parameter
     * @return the full name in manner (firstname) (lastname)
     */
    public Integer getStudentNumber()
    {
        return studentNumber;
    }
}
