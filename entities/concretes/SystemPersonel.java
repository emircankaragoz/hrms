package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="systemPersonel")
public class SystemPersonel {

		@Id
		@GeneratedValue
		@Column(name="personelId")
		private int personelId;
		
		@Column(name="firstName")
		private String firstName;
		
		@Column(name="lastName")
		private String lastName;
		
		public SystemPersonel() {}

		public SystemPersonel(int personelId, String firstName, String lastName) {
			super();
			this.personelId = personelId;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
}
