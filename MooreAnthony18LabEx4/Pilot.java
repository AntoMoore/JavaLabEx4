// Pilot (embedded class) - Anthony Moore
// models and simulates the Pilot class

public class Pilot
{
//===  M e m b e r   V a r i a b l e s   ============================
	private int pilotId;
	private String pilotName;
	private int pilotHours;

//===  M e m b e r   M e t h o d s  =================================

	public Pilot ( ) // Default constructor - no parameters
    {
		setPilot(0, "noPilot",0);
    }

    public Pilot (int id, String name, int hours) // Constructor with parameters
    {
		setPilot(id, name, hours);
    }

//===  M e m b e r   M e t h o d s  =================================

	public void setPilot(int id, String name, int hours)
	{
		setPilotId(id);
		setPilotName(name);
		setPilotHours(hours);
    }

//===================================================================

	public int getPilotId( )
	{
		return pilotId;
	}

	public void setPilotId(int id)
	{
		pilotId = id;
    }

//===================================================================

	public String getPilotName( )
	{
		return pilotName;
	}

	public void setPilotName(String name)
	{
		pilotName = name;
    }

//===================================================================

	public int getPilotHours( )
	{
		return pilotHours;
	}

	public void setPilotHours(int hours)
	{
		pilotHours = hours;
    }

// == Other Methods (including toString) =================================

 	public String toString()
 	{
		String s = String.format("%4d %-8s %6d",getPilotId(),getPilotName(),getPilotHours());

 		return s;
    }
} // Pilot