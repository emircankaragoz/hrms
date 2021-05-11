package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employer")
public class Employer{
	
	@Id
	@GeneratedValue
	@Column(name="employerId")
	private int employerId;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="websiteAdress")
	private String websiteAdress;
	
	@Column(name="phoneNumber")
	private int phoneNumber;
	
	public Employer() {}
	
	public Employer(int employerId, String companyName, String websiteAdress, int phoneNumber) {
		super();
		this.employerId = employerId;
		this.companyName = companyName;
		this.websiteAdress = websiteAdress;
		this.phoneNumber = phoneNumber;
	}
	
}
