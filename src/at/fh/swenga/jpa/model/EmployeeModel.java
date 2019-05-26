package at.fh.swenga.jpa.model;
 
import java.util.Date;
 
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
 
public class EmployeeModel implements java.io.Serializable {
 
	private String firstName;
 
	private String lastName;
 
	private Date dayOfBirth;
 
 
 	public EmployeeModel() {
	}
 
	public EmployeeModel(String firstName, String lastName, Date dayOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
	}
 
 
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
 
	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
 
	public Date getDayOfBirth() {
		return dayOfBirth;
	}
 
	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
 
 
}
