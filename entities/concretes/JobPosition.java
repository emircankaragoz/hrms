package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="position")
public class JobPosition {
	
	@Id
	@GeneratedValue
	@Column(name="positionId")
	private int positionId;
	
	@Column(name="positionName")
	private String positionName;
	
	public JobPosition() {
		
	}
	public JobPosition(int positionId, String positionName) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
	}
}
