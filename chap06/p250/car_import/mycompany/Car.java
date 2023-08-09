package p250.car_import.mycompany;

import p250.car_import.hankook.*;
import p250.car_import.hyundai.Engine;
import p250.car_import.kumho.*;

public class Car {
	
	Engine engine = new Engine();
	
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	p250.car_import.hankook.Tire tire3 = new p250.car_import.hankook.Tire();
	p250.car_import.kumho.Tire tire4 = new p250.car_import.kumho.Tire();
}
