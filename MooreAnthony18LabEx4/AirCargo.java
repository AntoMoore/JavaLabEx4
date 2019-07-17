// AirCargo sub class - Anthony Moore
//models and simulates the AirCargo class

public class AirCargo extends Helicopter
{
//===  M e m b e r   V a r i a b l e s   ============================
	private final static double DEFAULT_CAPACITY = 3.3;
	private final static int DEFAULT_WEIGHT = 101;
	private double maxCapacity;
	private int maxWeight;

//===  M e m b e r   M e t h o d s  =================================
	public AirCargo ( ) // Default constructor - no parameters
	{
		super();
		setAirCargo(DEFAULT_CAPACITY, DEFAULT_WEIGHT);
	}

	public AirCargo (int heliId, String make, boolean weather, double range, int id, String name, int hours, double cap, int weight) // Constructor with parameters
	{
		super(heliId, make, weather, range, id, name, hours);
		setAirCargo(cap, weight);
    }
/*
    public AirCargo (AirCargo h) // copy object constructor
	{
		setAirCargo(h.heliId, h.make, h.weather, h.range, h.id, h.name, h.hours, h,cap, h.weight);
	}
*/
//================================================================

	public void setAirCargo(double cap, int weight)
	{
		setMaxCapacity(cap);
		setMaxWeight(weight);
	}

//================================================================
    public double getMaxCapacity( )
	{
		return maxCapacity;
	}

	public void setMaxCapacity(double cap)
	{
		maxCapacity = cap;
	}

//================================================================
    public int getMaxWeight( )
	{
		return maxWeight;
	}

	public void setMaxWeight(int weight)
	{
		maxWeight = weight;
	}

// == Other Methods (including toString) =================================

    public String toString()
    {
		return (super.toString() + " Cap: " + getMaxCapacity() + " Wght: " + getMaxWeight());
    }

} // AirCargo