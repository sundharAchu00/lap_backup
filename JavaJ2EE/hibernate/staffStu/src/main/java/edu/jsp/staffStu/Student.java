package edu.jsp.staffStu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stu_id;
	public Staff getS() {
		return s;
	}
	public void setS(Staff s) {
		this.s = s;
	}
	private String name;
	
	@ManyToOne
	@JoinColumn
	private Staff s;
	
	public int getId() {
		return stu_id;
	}
	public void setId(int id) {
		this.stu_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + stu_id + ", name=" + name + "]";
	}
	
	
	
}
