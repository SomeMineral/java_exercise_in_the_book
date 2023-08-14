package ex07;

public class SnowTireExamlple {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run(); // hmm.. same 'run' button to SnowTire
		tire.run(); // hmm.. same 'run' button to SnowTire
	}
}
