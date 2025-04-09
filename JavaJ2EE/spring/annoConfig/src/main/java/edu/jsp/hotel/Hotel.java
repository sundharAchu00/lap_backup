package edu.jsp.hotel;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	@Value("thalapakatti")
	private String name;
	@Value("Avadi")
	private String loc;
	@Value("Non-Veg")
	private String type;
	@Value("7871346890")
	private long ph_no;
	
	@Autowired
	private Set<String> dishes;

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", type=" + type + ", ph_no=" + ph_no + ", dishes=" + dishes
				+ "]";
	}
	
}
