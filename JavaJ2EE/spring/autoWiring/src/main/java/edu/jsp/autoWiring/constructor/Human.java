package edu.jsp.autoWiring.constructor;

public class Human {

		private Heart heart;
		
		public Human(Heart heart) {
			
			this.heart = heart;
		}

		public void m1() {
			if (heart == null) {
				System.out.println("Single");
			} else {
				System.out.println("Going To Broke Soon..!");
			}

		}
}
