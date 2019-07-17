// MooreAnthonyLabEx4Test2  - Anthony Moore G00170900
// test program to create and manipulate an array of objects

public class MooreAnthonyLabEx4Test2 // to be renamed
{
    public static void main (String[] args)
    {
		final int MAX_HELICOPTERS = 9;
		int i;

		// create array
		Helicopter chopper[]= new Helicopter[MAX_HELICOPTERS];

		//create objects
		chopper[0] = new Helicopter(1111, "Red Heli", true, 10001.1, 101, "Pilot A", 1001);
		chopper[1] = new Helicopter(2222, "Green Heli", false, 20002.2, 202, "Pilot B", 2002);
		chopper[2] = new Helicopter(3333, "Blue Heli", true, 30003.3, 303, "Pilot C", 3003);

		chopper[3] = new AirAmbulance(4444, "Orange Heli", true, 40004.4, 404, "Pilot D", 4004);
		chopper[4] = new AirAmbulance(5555, "Brown Heli", false, 50005.5, 505, "Pilot E", 5005);

		chopper[5] = new AirTaxi(6666, "Grey Heli", true, 60006.6, 606, "Pilot F", 6006, 7);
		chopper[6] = new AirTaxi(7777, "White Heli", true, 70007.7, 707, "Pilot G", 7007, 8);

		chopper[7] = new AirCargo(8888, "Purple Heli", false, 80008.8, 808, "Pilot H", 8008, 8.8, 888);
		chopper[8] = new AirCargo(9999, "Black Heli", true, 90009.9, 909, "Pilot I", 9009, 9.9, 999);

		System.out.println("Anthony Moore: Lab Ex 4 April 2018 \n");
		System.out.println("Heli  Id  Make/Model AW     Range   Id Pilot    Hours");
		System.out.println("==========================================================================");

		//print arrays
		for (i = 0; i < MAX_HELICOPTERS; ++i)
		{
			System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
		}
    }

} // MooreAnthonyLabEx4Test2