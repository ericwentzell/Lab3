
public class RoadBike extends Bicycle 
{
	
	int tireWidth;
	public RoadBike(int startCadence, int startSpeed, int startGear, int tireWidth) 
	{
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(tireWidth);
	}
	
	public int getTireWidth()
	{
		return this.tireWidth;
	}
	
	public void setTireWidth(int tireWidth)
	{
		this.tireWidth = tireWidth;
	}
	
	public void printDescription()
	 
	 {
		super.printDescription();
		 System.out.println("The RoadBike has a " + getTireWidth() + " tire width");
		 
	 }
	
	

}
