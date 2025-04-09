package edu.jsp.company;

import org.springframework.stereotype.Component;

@Component
public class Jobs {

	private int jid;
	private String jname;
	private int no_of_emps;

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public int getNo_of_emps() {
		return no_of_emps;
	}

	public void setNo_of_emps(int no_of_emps) {
		this.no_of_emps = no_of_emps;
	}

	@Override
	public String toString() {
		return "Jobs [jid=" + jid + ", jname=" + jname + ", no_of_emps=" + no_of_emps + "]";
	}

}
