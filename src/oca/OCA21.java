package oca;

public class OCA21 {
	static int teeth;
	double scaleToughness;
	public OCA21() {
		teeth++;
	}
	
	public void snap(int teeth) {
		System.out.println(teeth + " ");
		teeth--;
	}

	public static void main(String[] unused) {
		new OCA21().snap(teeth);
		new OCA21().snap(teeth);
		
	}

}
