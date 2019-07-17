// MooreAnthonyLabEx4Test3  - Anthony Moore G00170900
// test program to create and manipulate an array of objects with a menu driven program

import java.util.Scanner;

public class MooreAnthonyLabEx4Test3 // to be renamed
{
	public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
		final int MAX_HELICOPTERS = 9;

		int i, choice, cnt, findHelicopterId, findPosition, changeCount, firstNum, secondNum, rangeInt;
		double rangeDouble;
		boolean found;

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

		choice = showMenu(); // Initial read

		while (choice != 0) // Continue until 0/End sentinel encountered
		{
			switch (choice)
			{
				case 1:
					outputHeader();
					listAllHelicopters(chopper);
					break;
				case 2:
					outputHeader();
					listAirAmbulances(chopper);
					break;
				case 3:
					outputHeader();
					listAirTaxis(chopper);
					break;
				case 4:
					outputHeader();
					listAirCargo(chopper);
					break;
				case 5:
					outputHeader();
					listOnlyHelicopters(chopper);
					break;
				case 6:
					outputHeader();
					listAllWeather(chopper);
					break;
				case 7:
					outputHeader();
					System.out.println("  Enter Pilot Hours Range (int, int): ");
					firstNum = console.nextInt();
					secondNum = console.nextInt();
					listPilotHours(chopper, firstNum, secondNum);
					break;
				case 8:
					outputHeader();
					System.out.print("  Enter Range Incresse amount (double, 0) or Range % incresse (0.00, int): ");
					rangeDouble = console.nextDouble();
					rangeInt = console.nextInt();
					updateHelicopterRange(chopper, rangeDouble, rangeInt);
					break;
				default:
					System.out.println("Invalid choice (must be 1..12 or 0/End)\n" );
			} // switch

			System.out.println();
			choice = showMenu(); // subsequent read

		} // while

    }// main
//===================================================================
 	public static int showMenu()
    {
		int choice;
		System.out.println();
        System.out.println("          Corrib Helicopter Menu Options - 0/End");
        System.out.println("=====================================================================");
        System.out.println(" 1: List Helicopters              2: List Air Ambulances");
        System.out.println(" 3: List Air Taxis                4: List Air Cargo");
        System.out.println(" 5: List Only Helicopters         6: List All Weather Non-Helicopters");
       	System.out.println(" 7: List Pilot Hours Range        8: Increase Helicopter Range");
       	System.out.println(" 9: Increase Air Cargo Capacity  10: Set Helicopter Make/Model");
       	System.out.println("11: Add Air Taxi Passengers      12: Rename Air Ambulance Pilot");
        System.out.println();

        System.out.print("Enter option: ");
        choice = console.nextInt();

        return choice;
    } // showMenu
//===================================================================
 	public static void outputHeader()
    {
		System.out.println();
		System.out.println("Class   Id  Make/Model AW     Range  Pilot        Hours ");
		System.out.println("============================================================================");
	} // outputHeader

//===================================================================
	public static void listAllHelicopters(Helicopter [] chopper)
	{
		int i;
		for (i = 0; i < chopper.length; ++i)
		{
			System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
		}
	}

//===================================================================
	public static void listAirAmbulances(Helicopter [] chopper)
	{
		int i;
		for (i = 0; i < chopper.length; ++i)
		{
			if(chopper[i] instanceof AirAmbulance)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}

//===================================================================
	public static void listAirTaxis(Helicopter [] chopper)
	{
		int i;
		for (i = 0; i < chopper.length; ++i)
		{
			if(chopper[i] instanceof AirTaxi)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}

//===================================================================
	public static void listAirCargo(Helicopter [] chopper)
	{
		int i;
		for (i = 0; i < chopper.length; ++i)
		{
			if(chopper[i] instanceof AirCargo)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}

//===================================================================
	public static void listOnlyHelicopters(Helicopter [] chopper)
	{
		int i;
		for (i = 0; i < chopper.length; ++i)
		{
			if (chopper[i] instanceof Helicopter && chopper[i] instanceof AirAmbulance == false && chopper[i] instanceof AirTaxi == false && chopper[i] instanceof AirCargo == false)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}

//===================================================================
	public static void listAllWeather(Helicopter [] chopper)
	{
		int i;
		boolean weather;
		for (i = 0; i < chopper.length; ++i)
		{
			weather = chopper[i].getHeliAllWeather(); //get boolean
			if (weather == true && (!(chopper[i] instanceof Helicopter && chopper[i] instanceof AirAmbulance == false && chopper[i] instanceof AirTaxi == false && chopper[i] instanceof AirCargo == false)))
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}

//===================================================================
	public static void listPilotHours(Helicopter [] chopper, int first, int second)
	{
		int i;
		int hours;

		for (i = 0; i < chopper.length; ++i)
		{
/*
			hours = chopper[i].getPilotHours(); //get range
			System.out.println(hours);

			if (range >= first && range <= second)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
*/
		}

	}

//===================================================================
	public static void updateHelicopterRange(Helicopter [] chopper, double rangeD, int rangeI)
	{
		int i;

		for (i = 0; i < chopper.length; ++i)
		{
			if (rangeD == 0)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
				chopper[i].setHeliRange(rangeI);
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
			else if (rangeD > 0)
			{
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
				chopper[i].setHeliRange(rangeD);
				System.out.println(chopper[i].getClass().getName().substring(0,4) + " " + chopper[i].toString());
			}
		}
	}



} // MooreAnthonyLabEx4Test3