package DAY6ASSIGNMENT;

public class SmartParking {
	String vehicleNumber;
    int hoursParked;
    String vehicleType;
    int parkingFee;

    SmartParking(String v, int h, String t)
    {
        vehicleNumber = v;
        hoursParked = h;
        vehicleType = t;

        if(vehicleType.equals("Bike"))
            parkingFee = hoursParked * 10;
        else if(vehicleType.equals("Car"))
            parkingFee = hoursParked * 30;
        else if(vehicleType.equals("Bus"))
            parkingFee = hoursParked * 50;
    }

    void display()
    {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Hours Parked : " + hoursParked);
        System.out.println("Vehicle Type : " + vehicleType);
        System.out.println("Parking Fee : " + parkingFee);
    }

    public static void main(String args[])
    {
        SmartParking p = new SmartParking("OD02AB1234", 5, "Car");
        p.display();
    }
}
