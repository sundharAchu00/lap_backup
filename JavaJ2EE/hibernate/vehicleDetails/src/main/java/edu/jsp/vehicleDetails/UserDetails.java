package edu.jsp.vehicleDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne
	VeicleDetails v;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VeicleDetails getV() {
		return v;
	}

	public void setV(VeicleDetails v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name +  "]";
	}
	
	
}
