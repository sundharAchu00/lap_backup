package relaionship;

import java.util.Scanner;

class Sim {
	String Sname, band_width;
	long contact;

	Sim() {
	}

	Sim(String Sname, String band_width, long contact) {
		this.Sname = Sname;
		this.band_width = band_width;
		this.contact = contact;
	}

	public void simDetails() {
		System.out.println("Sim Name :" + Sname);
		System.out.println("Sim band_width :" + band_width);
		System.out.println("Contact number :" + contact);
	}
}

class Mobile {
	String Mname, Mram, Mstorage;
	double price;
	Sim slot, slot1;

	Mobile() {
	}

	Mobile(String nam, String ra, String stor, double pri) {
		Mname = nam;
		Mram = ra;
		Mstorage = stor;
		price = pri;
	}

	public void addSim(Sim s) {
		if (slot == null) {
			slot = s;
			System.out.println("SIM Added.........");// + slot.simDetails());
		} else
			System.out.println("Can't Add already SIM is presrnt...");

	}

	public void addSim1(Sim s) {
		if (slot1 == null) {
			slot1 = s;
			System.out.println("SIM Added.........");// + slot.simDetails());
		} else
			System.out.println("Can't Add already SIM is presrnt...");

	}

	public void removeSim() {
		if (slot != null) {
			slot = null;
			System.out.println("SIM Removed...");
		} else
			System.out.println("No SIM is to remove...");
	}

	public void removeSim1() {
		if (slot1 != null) {
			slot1 = null;
			System.out.println("SIM Removed...");
		} else
			System.out.println("No SIM is to remove...");
	}

	public boolean isSimPresent() {
		if (slot != null && slot1 != null)
			return true;
		else
			return false;
	}

	// details of mobile
	public void detOfMobile() {
		System.out.println("Mobile name :" + Mname);
		System.out.println("RAM : " + Mram);
		System.out.println("Storage :" + Mstorage);
		System.out.println("price :" + price);
		System.out.println("**********************");
	}
}

class ElderBro extends Mobile {
	String Ename;
	int Age;
	boolean can_i_contact;

	ElderBro() {
	}

	ElderBro(String Mname, String Mram, String Mstorage, double price, String Enam, int Age) {
		super(Mname, Mram, Mstorage, price);
		this.Ename = Enam;
		this.Age = Age;
	}
}

class YoungBro extends Mobile {
	String Ename;
	int Age;
	boolean can_i_contact;

	YoungBro() {
	}

	YoungBro(String Mname, String Mram, String Mstorage, double price, String Enam, int Age) {
		super(Mname, Mram, Mstorage, price);
		this.Ename = Enam;
		this.Age = Age;
	}
}

public class DriverMSim {
	static Scanner s = new Scanner(System.in);
	static ElderBro e = new ElderBro("Oppo", "8gb", "256gb", 34000, "pandian", 20);
	static YoungBro y = new YoungBro("Vivo", "12gb", "256gb", 38000, "Watson", 24);

//	static ElderBro e2=new ElderBro("Redmi","4gb","126gb",24000,"jagan",19);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		System.out.println("\t\tWelcome to Sangeeta.");
		do {
			System.out.println("1.Dinga\n2.Manga\n3.Exit");
			int n = s.nextInt();
			switch (n) {
			case 1: {
				boolean b = true;
				do {
					System.out.println("1.Details of mobile\n2.Details of Sim\n3.Add_Sim\n4.Remove_sim\n5.Is_Sim_Present\n6.Exit");
					int input = s.nextInt();
					switch (input) {
					case 1: {
						e.detOfMobile();
						break;
					}
					case 2: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {
							if (e.isSimPresent()) {
								System.out.println(e.Ename + " SIM is Present");
								e.slot.simDetails();
							} else
								System.out.println("SIM is not present");
						} else if (slot_no == 2) {
							if (e.isSimPresent()) {
								System.out.println(e.Ename + " SIM is Present");
								e.slot1.simDetails();
							} else
								System.out.println("SIM is not present");

						}
						break;
					}
					case 3: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {
							System.out.println("Enter SIM Name ");
							s.nextLine();
							String name = s.nextLine();
							System.out.println("Enter SIM Bandwidth ");
							String b_w = s.nextLine();
							System.out.println("Enter SIM Number ");
							long Num = s.nextLong();
							e.addSim(new Sim(name, b_w, Num));
						} else if (slot_no == 2) {
							System.out.println("Enter SIM Name ");
							s.nextLine();
							String name = s.nextLine();
							System.out.println("Enter SIM Bandwidth ");
							String b_w = s.nextLine();
							System.out.println("Enter SIM Number ");
							long Num = s.nextLong();
							e.addSim1(new Sim(name, b_w, Num));
						}
						break;
					}
					case 4: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {// removing sim 1
							e.removeSim();
						} else if (slot_no == 2) {// removing sim 2
							e.removeSim1();
						}
						break;
					}
					case 5: {// checking sim is present or not
						if (e.isSimPresent())
							System.out.println("sim is present...");
						else
							System.out.println("sim not present....");
						break;
					}
					case 6: {// exit
						b=false;
						break;}
					default: {
						System.out.println("lee User select from the given input.." + (char) 2);
						break;
					}
					}
				} while (b);
				break;
			}
			case 2: {
				boolean b = true;
				do {
					System.out.println(
							"1.Details of mobile\n2.Details of Sim\n3.Add_Sim\n4.Remove_sim\n5.Is_Sim_Present\n6.Exit");
					int input = s.nextInt();
					switch (input) {
					case 1: {
						y.detOfMobile();
						break;
					}
					case 2: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {
							if (y.isSimPresent()) {
								System.out.println(e.Ename + " SIM is Present");
								e.slot.simDetails();
							} else
								System.out.println("SIM is not present");
						} else if (slot_no == 2) {
							if (y.isSimPresent()) {
								System.out.println(e.Ename + " SIM is Present");
								y.slot1.simDetails();
							} else
								System.out.println("SIM is not present");

						}
						break;
					}
					case 3: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {
							System.out.println("Enter SIM Name ");
							s.nextLine();
							String name = s.nextLine();
							System.out.println("Enter SIM Bandwidth ");
							String b_w = s.nextLine();
							System.out.println("Enter SIM Number ");
							long Num = s.nextLong();
							y.addSim(new Sim(name, b_w, Num));
						} else if (slot_no == 2) {
							System.out.println("Enter SIM Name ");
							s.nextLine();
							String name = s.nextLine();
							System.out.println("Enter SIM Bandwidth ");
							String b_w = s.nextLine();
							System.out.println("Enter SIM Number ");
							long Num = s.nextLong();
							y.addSim1(new Sim(name, b_w, Num));
						}
						break;
					}
					case 4: {
						System.out.println("\t\tSelect the SIM Slot\n1.Slot one\n2.Slot two");
						int slot_no = s.nextInt();
						if (slot_no == 1) {// removing sim 1
							y.removeSim();
						} else if (slot_no == 2) {// removing sim 2
							y.removeSim1();
						}
						break;
					}
					case 5: {// checking sim is present or not
						if (y.isSimPresent())
							System.out.println("sim is present...");
						else
							System.out.println("sim not present....");
						break;
					}
					case 6: {// exit
						b = false;
						break;
					}
					default: {
						System.out.println("lee User select from the given input.." + (char) 2);
						break;
					}
					}

				} while (b);
				break;
			}
			case 3: {
				b1 = false;
				System.out.println("Tata......byee...."+(char)3);
				break;
			}
			default: {
				System.out.println("lee User select from the given input.." + (char) 2);
				break;
			}
			}
		} while (b1);
	}
}
