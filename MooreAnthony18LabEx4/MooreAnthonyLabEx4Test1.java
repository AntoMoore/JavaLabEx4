// MooreAnthonyLabEx4Test1  - Anthony Moore G00170900
// test program to create and manipulate objects


public class MooreAnthonyLabEx4Test1 // to be reanmed
{
    public static void main (String[] args)
    {
		System.out.println("Anthony Moore: Lab Ex 4 April 2018 \n");
		System.out.println("Heli  Id  Make/Model AW     Range   Id Pilot    Hours");
		System.out.println("==========================================================================");

		//test Pilot class (embedded class)
		Pilot p1 = new Pilot();
		System.out.println("p1: \t\t\t\t " + p1.toString());

		p1.setPilot(98, "Pilot Z", 1234);
		System.out.println("p1: \t\t\t\t " + p1.toString());

		Pilot p2 = new Pilot(99, "Pilot Y", 4321);
		System.out.println("p2: \t\t\t\t " + p2.toString() + "\n");

		//test Helicopter class (super class)
		Helicopter h1 = new Helicopter();
		System.out.println("h1: " + h1.toString());

		h1.setHelicopter(1111, "Red Heli", true, 10001.1);
		h1.setPilot(101, "Pilot A", 1001);
		System.out.println("h1: " + h1.toString());

		Helicopter h2 = new Helicopter(2222, "Green Heli", false, 20002.2, 202, "Pilot B", 2002);
		System.out.println("h2: " + h2.toString());

		Helicopter h3 = new Helicopter(3333, "Blue Heli", true, 30003.3);
		System.out.println("h3: " + h3.toString());

		h3.setPilot(303, "Pilot C", 3003);
		System.out.println("h3: " + h3.toString());

		h3.setHeliRange(10);
		System.out.println("h3: overLoaded setHeliRange(10)" + h3.toString() + "\n");

		//System.out.println("h3: overLoaded getPilot()" + h3.Pilot.toString());

		//test AirAmbulance class (sub class)
		AirAmbulance a1 = new AirAmbulance();
		System.out.println("a1: " + a1.toString());

		a1.setHelicopter(4444, "Orange Heli", true, 40004.4);
		a1.setPilot(404, "Pilot D", 4004);
		System.out.println("a1: " + a1.toString());

		AirAmbulance a2 = new AirAmbulance(5555, "Brown Heli", false, 50005.5, 505, "Pilot E", 5005);
		System.out.println("a2: " + a2.toString() + "\n");

		//test AirTaxi class (sub class)
		AirTaxi t1 = new AirTaxi();
		System.out.println("t1: " + t1.toString());

		t1.setHelicopter(6666, "Grey Heli", true, 60006.6);
		t1.setMaxPassangers(7);
		t1.setPilot(606, "Pilot F", 6006);
		System.out.println("t1: " + t1.toString());

		AirTaxi t2 = new AirTaxi(7777, "White Heli", true, 70007.7, 707, "Pilot G", 7007, 8);
		System.out.println("t2: " + t2.toString() + "\n");

		//test AirCargo class (sub class)
		AirCargo c1 = new AirCargo();
		System.out.println("c1: " + c1.toString());

		c1.setHelicopter(8888, "Purple Heli", false, 80008.8);
		c1.setAirCargo(8.8, 888);
		c1.setPilot(808, "Pilot H", 8008);
		System.out.println("c1: " + c1.toString());

		AirCargo c2 = new AirCargo(9999, "Black Heli", true, 90009.9, 909, "Pilot I", 9009, 9.9, 999);
		System.out.println("c2: " + c2.toString());

    }// main

} // MooreAnthonyLabEx4Test1