package edu.ucalgary.oop;

/*
Copyright Ann Barcomb and Emily Marasco, 2021-2023
All rights reserved.
*/


/*
Ryan Pryor, 30117750
*/
public class Trip {
    private String arrival;
    private String departure;
    private String city;
    private String country;

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
		String returning = new String(value + " (" + key + ")");
		return returning;
		
    }
	
	
    // Constructor
    public Trip(String[] array) {
		this.arrival = array[0];
		this.departure = array[1];
		this.city = array[2];
		this.country = array[3];
		
    }

    // Given a date string, return just the year
    public static int getYear(String date) {
		String yearString = date;
		String snipped = yearString.substring(0,4);
		int year = Integer.parseInt(snipped, 10);
		return year;
    }

    // Given a date string, return just the month
    // Since it is an int, a date like "2022-01-12" returns 1
    public static int getMonth(String date) {
		String monthString = date;
		String snipped = monthString.substring(5,7);
		int month = Integer.parseInt(snipped, 10);
		return month;
		
    }

    // Return a formatted string of key/value pairs, with commas
    // between each. See the output for an example.
    public String formatTrip() {
		String ftArrival = getArrival();
		String ftDeparture = getDeparture();
		String ftCity = getCity();
		String ftCountry = getCountry();
		String theFormatTrip = (ftArrival + " (Arrival), " + ftDeparture + " (Departure), " + ftCity + " (City), " + ftCountry + " (Country)");
		return theFormatTrip;
    }

    // Getter
    public String getArrival() {
		return arrival;
    }

    // Getter
    public String getDeparture() {
		return departure;
    }

    // Getter
    public String getCity() {
		return city;
    }

    // Getter
    public String getCountry() {
		return country;
    }

    // Setter
    public void setArrival(String date) {
		this.arrival = date;
		
    }

    // Setter
    public void setDeparture(String date) {
		this.departure = date;
		
    }

    // Setter 
    public void setCity(String city) {
		this.city = city;
		
    }

    // Setter 
    public void setCountry(String country) {
		this.country = country;
		
    }

}
