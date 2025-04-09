package edu.jsp.autoWiring.byType;

public class State {
	
	private String stateName;
	private String language;
	private String captial;
	
	private CM cm;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCaptial() {
		return captial;
	}

	public void setCaptial(String captial) {
		this.captial = captial;
	}

	public CM getCm() {
		return cm;
	}

	public void setCm(CM cm) {
		this.cm = cm;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", captial=" + captial + ", cm=" + cm + "]";
	}
	
	

}
