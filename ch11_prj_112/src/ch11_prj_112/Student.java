package ch11_prj_112;



public class Student implements Comparable<Student>{
 private String firstName;
 private String lastName;
 private String firstAndLastName;
 private int score;

 public Student(){
	 super();
 }
 
 
 public Student(String firstName, String lastName, String firstAndLastName, int score) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.firstAndLastName = firstAndLastName;
	this.score = score;
	
}
 
 

@Override
public String toString() {
	return lastName + ", " + firstName + " : " + score ;
}



/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the firstAndLastName
 */
public String getFirstAndLastName() {
	return firstAndLastName;
}

/**
 * @param firstAndLastName the firstAndLastName to set
 */
public void setFirstAndLastName(String firstAndLastName) {
	this.firstAndLastName = firstAndLastName;
}

/**
 * @return the score
 */
public int getScore() {
	return score;
}

/**
 * @param score the score to set
 */
public void setScore(int score) {
	this.score = score;
}



@Override
public int compareTo(Student o) {
	
	
	int c =0;
	c = this.lastName.compareTo(o.getLastName());
	if (c ==0) {
		c = this.firstName.compareTo(o.getFirstName());
		
	}
	return c;
	
	
}
	
	
}
