package principal;

import Puntosiete.person;

public class principaljava {

	public static void main (String[] args) {
	
		Student st = new Student(); 
		System.out.println(st. Name + "\n" + st.id + "/n"+ st.status); 
		
		punto7();
		
	}
	
	public static void punto7() {
		
		person p1 = new person(37, "arial");
		person p2 = new person(15, "Joseph");
		
		if (p1.getage() == p2.getage()) {
			
			System.out.println(p1.getage() + "tiene el mismo nombre que" + p2.getage());
			
			
		}
		
		else {
			
		System.out.println(p1.getage() + "NO tiene el mismo nombre " + p2.getage());
		
		
		}
	}
}



