import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CourseCatalog {
	
	public CourseCatalog() {
		
	}
	
	public void initializeCatalog(String filename) {
		if(filename!=null) {
			File file = new File(filename);
			try {
				Scanner input = new Scanner(file);
				String data = input.nextLine();
				while(input.hasNext()) {
					data += ('\n'+input.next());
					data ="";
				}
				System.out.println(data);
				input.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void addCourse(Course toAdd) {
		
	}
	
	public void removeCourse(Course toRemove) {
		
	}
	
	public void saveCatalog() {
		
	}
	
	public Course findCourse(String courseCode) {
		return null;
		
	}
}
