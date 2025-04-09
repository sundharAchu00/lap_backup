package edu.jsp.institute;

public class Branches {

	private int id;
	private String bname;
	private String manager;
	private String loc;

	public Branches(int id, String bname, String manager, String loc) {
		this.id = id;
		this.bname = bname;
		this.manager = manager;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Branches [id=" + id + ", bname=" + bname + ", manager=" + manager + ", loc=" + loc + "]";
	}
	
	

}
