package ysf.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "jobNames")
public class jobNames {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name ="name" )
	private String name;
	
	
	
	
	public jobNames() {}
	
	public jobNames(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
