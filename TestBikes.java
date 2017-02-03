import java.util.ArrayList;

public class TestBikes 

{

	public static void main(String[] args)
	{
		ArrayList<Bicycle> bikes = new ArrayList<Bicycle>();
		Bicycle b1 = new MountainBike(2, 2, 2, "downhill");
		Bicycle b2 = new MountainBike(2, 2, 2, "street");
		Bicycle b3 = new RoadBike(2, 2, 2, 4);
		Bicycle b4 = new RoadBike(2, 2, 2, 6);
		
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		
		printList(bikes);
	}

	
	private static void printList(ArrayList<Bicycle> bikes) 
	{
		for(int i = 0; i < bikes.size(); i++)
		{
			if(bikes.get(i) instanceof MountainBike)
			{
				 System.out.println("This is a MountainBike");
				 bikes.get(i).printDescription();
			}
			else
			{
				System.out.println("This is a RoadBike"); 
				bikes.get(i).printDescription();
			}
		}
		
		
	}
} 