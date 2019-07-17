// AirAmbulance sub class - Anthony Moore
// models and simulates the AirAmbulance class

public class AirAmbulance extends Helicopter
{
//===  M e m b e r   V a r i a b l e s   ============================

	//no new variables

//===  M e m b e r   M e t h o d s  =================================
	public AirAmbulance ( ) // Default constructor - no parameters
	{
		super();
	}

	public AirAmbulance (int heliId, String make, boolean weather, double range, int id, String name, int hours) // Constructor with parameters
	{
		super(heliId, make, weather, range, id, name, hours);
    }

// == Other Methods (including toString) =================================

    public String toString()
    {
		return (super.toString());
    }


} // AirAmbulance