package edu.jsp.company;

import org.springframework.stereotype.Component;

@Component
public class Vehicles {

	private int vid;
	private String vname;
	private String vno;
	private int no_of_vehicle;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVno() {
		return vno;
	}

	public void setVno(String vno) {
		this.vno = vno;
	}

	public int getNo_of_vehicle() {
		return no_of_vehicle;
	}

	public void setNo_of_vehicle(int no_of_vehicle) {
		this.no_of_vehicle = no_of_vehicle;
	}

	@Override
	public String toString() {
		return "Vehicles [vid=" + vid + ", vname=" + vname + ", vno=" + vno + ", no_of_vehicle=" + no_of_vehicle + "]";
	}

}
