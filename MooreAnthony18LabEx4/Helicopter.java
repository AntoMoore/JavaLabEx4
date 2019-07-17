// Helicopter super class - Anthony Moore
// models and simulates the Helicopter class

public class Helicopter
{
//===  M e m b e r   V a r i a b l e s   ============================

	private int helicopterId;
    private String heliMakeModel;
    private boolean heliAllWeather;
    private double heliRange;
    private Pilot pilot; //embedded class

//== Member Methods - Constructors =======================================

    public Helicopter ( ) // Default constructor - no parameters
    {
		setHelicopter(0, "noMake", false, 0.00);
		pilot = new Pilot();
    }

    public Helicopter (int heliId, String make, boolean weather, double range, int id, String name, int hours) // Constructor with full parameters
    {
		setHelicopter(heliId, make, weather, range);
		pilot = new Pilot(id, name, hours);
    }

    public Helicopter (int heliId, String make, boolean weather, double range) // Constructor with partial parameters
	{
		setHelicopter(heliId, make, weather, range);
		pilot = new Pilot();
    }

//== Member Methods - Accesser & Mutater =================================

   	public void setHelicopter(int heliId, String make, boolean weather, double range)
    {
        setHelicopterId(heliId);
        setHeliMakeModel(make);
        setHeliAllWeather(weather);
        setHeliRange(range);
    }

//================================================================
    public int getHelicopterId( )
	{
		return helicopterId;
	}

	public void setHelicopterId(int heliId)
	{
		helicopterId = heliId;
	}

//================================================================
    public String getHeliMakeModel( )
	{
		return heliMakeModel;
	}

	public void setHeliMakeModel(String make)
	{
		heliMakeModel = make;
	}

//================================================================
    public boolean getHeliAllWeather( )
	{
		return heliAllWeather;
	}

	public void setHeliAllWeather(boolean weather)
	{
		heliAllWeather = weather;
	}

//================================================================
    public double getHeliRange( )
	{
		return heliRange;
	}

	public void setHeliRange(double range)
	{
		heliRange = range;
	}

	public void setHeliRange(int range) //overloaded
	{
		double currentRange = getHeliRange();
		heliRange += (currentRange * range) / 100;
	}

//=========== Embedded class  ========================================================

	public String getPilot ()
	{
		return pilot.toString();
	}
/*
	public Pilot getPilot (int over) //overloaded
	{
		return pilot();
	}
*/
	public void setPilot(int id, String name, int hours)
	{
		pilot.setPilot(id, name, hours);
	}

// == Other Methods (including toString) =================================

    public String toString()
	{
		String s = String.format("%6d %-12s %b %6.2f %s",getHelicopterId(),getHeliMakeModel(),getHeliAllWeather(),getHeliRange(),getPilot());

		return s;
    }

} // Helicopter