// AirTaxi sub class - Anthony Moore
//models and simulates the AirTaxi class

public class AirTaxi extends Helicopter
{
//===  M e m b e r   V a r i a b l e s   ============================

	private int maxPassangers;

//===  M e m b e r   M e t h o d s  =================================
	public AirTaxi ( ) // Default constructor - no parameters
	{
		super();
		setMaxPassangers(0);
	}

	public AirTaxi (int heliId, String make, boolean weather, double range, int id, String name, int hours, int pass) // Constructor with parameters
	{
		super(heliId, make, weather, range, id, name, hours);
		setMaxPassangers(pass);
    }

//================================================================
    public int getMaxPassangers( )
	{
		return maxPassangers;
	}

	public void setMaxPassangers(int pass)
	{
		maxPassangers = pass;
	}

// == Other Methods (including toString) =================================

    public String toString()
    {
		return (super.toString() + " Pass: " + getMaxPassangers());
    }

} // AirTaxi