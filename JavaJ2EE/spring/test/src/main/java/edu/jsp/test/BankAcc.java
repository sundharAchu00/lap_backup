package edu.jsp.test;

public class BankAcc {

	private int id;
	private String bname;
	private Long accno;
	private String branch;
	
//	private Person person;

	public BankAcc(int id, String bname, Long accno, String branch) {
		this.id = id;
		this.bname = bname;
		this.accno = accno;
		this.branch = branch;
//		this.person = person;
	}

	@Override
	public String toString() {
		return "BankAcc [id=" + id + ", bname=" + bname + ", accno=" + accno + ", branch=" + branch + "]";
	}
	
	

}
