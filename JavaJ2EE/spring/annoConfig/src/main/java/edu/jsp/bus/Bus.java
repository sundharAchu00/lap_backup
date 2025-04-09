package edu.jsp.bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	
	@Value("8945")
    private int	bus_no;
	@Value("sundara travels")
    private String	name ;
	@Value("RGB")
    private String color;
    
    @Autowired
    private List<Passeneger> passenegers;

	@Override
	public String toString() {
		return "Bus [bus_no=" + bus_no + ", name=" + name + ", color=" + color + ", passenegers=" + passenegers + "]";
	}
    
    
}
