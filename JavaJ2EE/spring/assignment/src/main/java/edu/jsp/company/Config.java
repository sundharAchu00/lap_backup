package edu.jsp.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "edu.jsp.company" })
public class Config {

	@Bean
	public Set<Jobs> jobs(){
		
		
		Jobs j1 = new Jobs();
		j1.setJid(1);
		j1.setJname("developer");
		j1.setNo_of_emps(80);
		
		Jobs j2 = new Jobs();
		j2.setJid(1);
		j2.setJname("Test Engineer");
		j2.setNo_of_emps(20);
		
		Jobs j3 = new Jobs();
		j3.setJid(1);
		j3.setJname("Devops Engineer");
		j3.setNo_of_emps(50);
		
		Set<Jobs> job = new HashSet<Jobs>();
		job.add(j1);
		job.add(j2);
		job.add(j3);
		
		return job;
	}
	
	@Bean
	public List<Vehicles> vehicles(){
		
		Vehicles v1 = new Vehicles();
		v1.setVid(1);
		v1.setVname("xylo");
		v1.setVno("TN 32 GH 8667");
		v1.setNo_of_vehicle(2);
		
		Vehicles v2 = new Vehicles();
		v2.setVid(2);
		v2.setVname("Innova");
		v2.setVno("TN 32 GH 2354");
		v2.setNo_of_vehicle(2);
		
		
		Vehicles v3 = new Vehicles();
		v3.setVid(3);
		v3.setVname("Fortuner");
		v3.setVno("TN 32 GH 9867");
		v3.setNo_of_vehicle(1);
		
		List<Vehicles> veh = new ArrayList<Vehicles>();
		veh.add(v1);
		veh.add(v2);
		veh.add(v3);
		
		return veh;
		
	}
	
	
	@Bean
	public Map<Integer, Employees> employees(){
		
		Employees e1 =  new Employees(1, "Sundhar Raj", "Developer", 45000.677);
		Employees e2 =  new Employees(2, "Kumara Vel", "Test Engineer", 35000.677);
		Employees e3 =  new Employees(3, "Sathish Kumar", "Devops Engineer", 65000.677);
		
		Map<Integer, Employees> emp =  new HashMap<Integer, Employees>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		return emp;
	}
}
