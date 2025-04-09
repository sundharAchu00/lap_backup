package edu.jsp.vehicleDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VeicleDetails {
	@Id
	private int Driving_liecense_no;
	private String vName;
	private String color;
	private double price;
	@OneToOne
	UserDetails u;
	public int getDriving_liecense_no() {
		return Driving_liecense_no;
	}
	public void setDriving_liecense_no(int driving_liecense_no) {
		Driving_liecense_no = driving_liecense_no;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public UserDetails getU() {
		return u;
	}
	public void setU(UserDetails u) {
		this.u = u;
	}
	@Override
	public String toString() {
		return "VeicleDetails [Driving_liecense_no=" + Driving_liecense_no + ", vName=" + vName + ", color=" + color
				+ ", price=" + price + ", u=" + u + "]";
	}
	
	
}
