
 class MyNewHealthCare {
	 void DrSounds() {
		 System.out.println ("The Dr makes a howling sound");	
	}
}
 
 class Trainee extends MyNewHealthCare {
	 
	 public void DrSounds() {
		 System.out.println("The Trainee makes a lower sound");
	 }
 }
 
 class Nurse extends MyNewHealthCare {
	 public void DrSounds() {
		 System.out.println("Nurse takes care of smaller tasks");
	 
 }
 }
