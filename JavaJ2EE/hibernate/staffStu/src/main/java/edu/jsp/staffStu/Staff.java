package edu.jsp.staffStu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int st_id;
	private String name;
	private String sub;
	
	@OneToMany(mappedBy = "s",cascade = CascadeType.ALL)
	private List<Student> s;

	public int getId() {
		return st_id;
	}

	public void setId(int id) {
		this.st_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public List<Student> getS() {
		return s;
	}

	public void setS(List<Student> s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Staff [id=" + st_id + ", name=" + name + ", sub=" + sub + ", s=" + s + "]";
	}
	
	
}
