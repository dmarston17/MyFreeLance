
public class ReptileMain {

	public static void main(String[] args) {
		
		Reptile myReptile;
//		Dragon myDragon = new Dragon();
//		Cheetah myCheetah = new Cheetah();
		
		myReptile = new Dragon();  //a is myReptile
		myReptile.reptileSound();
		
		myReptile = new Cheetah();
		myReptile.reptileSound();
		
		myReptile = new Reptile();
		myReptile.reptileSound();
	}
}