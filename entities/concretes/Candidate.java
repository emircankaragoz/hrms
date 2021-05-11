package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="candidate")
public class Candidate{
	
	@Id
	@GeneratedValue
	@Column(name="candidateId")
	private int candidateId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="indentityNumber")
	private String identityNumber;
	
	@Column(name="birthDate")
	private String birthDate;
	
	public Candidate() {}

	public Candidate(int candidateId, String firstName, String lastName, String identityNumber, String birthDate) {
		super();
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}
	
	
}
