package edu.ucalgary.oop;

/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/

/*
Ryan Pryor, 30117750
*/

public class Itinerary {
    private Trip[] trips = new Trip[20];

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
		String returning = new String(value + " (" + key + ")");
		return returning;
    }

    //Constructor
    public Itinerary(String[][] myTrips) {
		
		for(int i = 0; i < myTrips.length; i++)
		{
			trips[i] = new Trip(myTrips[i]);
		}
		
    }

    //Getter
    public Trip[] getTrips() {
		
		return trips;
		
    }

   public String formatByArrival() {
   		int i = 0;
		String arrival = trips[i].getArrival();
		
		System.out.println("Year (2021)");
		while (Trip.getYear(arrival) == 2021)
		{
			if(i == trips.length)
				break;
			if(trips[i] == null)
				break;
			arrival = trips[i].getArrival();
			System.out.println("----" + trips[i].getCity() + " (City), " + 
			trips[i].getCountry() + " (Country) (Place)");
			i++;
		
		}

		if(Trip.getYear(arrival) == 2022)
		System.out.println("Year (2022)");
		{
			while (Trip.getYear(arrival) == 2022)
			{
			if(i == trips.length)
				break;
			if(trips[i] == null)
				break;
			arrival = trips[i].getArrival();
			System.out.println("----" + trips[i].getCity() + " (City), " + 
			trips[i].getCountry() + " (Country) (Place)");
			i++;
			}
		}

		if(Trip.getYear(arrival) == 2023){
		System.out.println("Year (2023)");
		while (Trip.getYear(arrival) == 2023)
			{
			if(i == trips.length)
				break;
			if(trips[i]==null)
				break;
			arrival = trips[i].getArrival();
			System.out.println("----" + trips[i].getCity() + " (City), " + 
			trips[i].getCountry() + " (Country) (Place)");
			i++;
			}
		}	
		String returning ="";
		return returning;

		
		
   	}

    // The first array holds years (2021-2023).
    // The second array holds months.
    // The third array holds formatted locations occurring in the year/month
    //String[][][] byDate() {
		
		
	//}

}