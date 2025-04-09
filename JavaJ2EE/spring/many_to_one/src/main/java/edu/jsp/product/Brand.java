package edu.jsp.product;

public class Brand {
	
	private String b_name;
	private String loc;
	
	
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "Brand [b_name=" + b_name + ", loc=" + loc + "]";
	}
	
	
}
