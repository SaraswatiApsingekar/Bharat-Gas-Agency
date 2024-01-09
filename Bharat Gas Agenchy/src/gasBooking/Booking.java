package gasBooking;

import customer.GasConnection;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Booking extends GasConnection {

     public double otp=5678, amount=456.0, refund=0;

     public String deliveryDate, status, deliveryPersonMbNo="1234567890";
     public  String dt;
    Date dt_1 = null;

    public Booking(String name, String pinCode, String mobile, String street, String area, int numberOfCylinder) {
        super(name, pinCode, mobile, street, area, numberOfCylinder);
    }
    public void getLastDate() {
        System.out.println("Enter the last Date");
        Scanner sc = new Scanner(System.in);
        dt = sc.nextLine();

        Date dt_1 = null, dt_2=null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

        try {
            dt_1 = dateFormat.parse(dt);
        } catch (Exception e) {
            System.out.println("error in getLastDate: " + e);
        }

        //delivery details

        System.out.println("Enter delivery date:");
        Scanner SC = new Scanner(System.in);
        deliveryDate = SC.nextLine();

        try {
            dt_2 = dateFormat.parse(deliveryDate);
        } catch (Exception e) {
            System.out.println("error in parsing second date");
        }

        // find the difference between to dates to check the status

        try {

            long difference = dt_2.getTime() - dt_1.getTime();

            //calculating and converting difference in date in DAYS;
            long newDifference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);

            if (newDifference > 7) {
                status = "P";
                System.out.println("Your Booking is Pending");
            }

        } catch (Exception e) {
            System.out.println("Error while finding difference between days");
        }
    }

        public void validate(){
            //getting the difference between two days

            long difference_2= dt_1.getTime() - lastDate.getTime();
            long diff= TimeUnit.DAYS.convert(difference_2,TimeUnit.MILLISECONDS);
            System.out.println("Difference between two days is:"+diff);

            // if else condition for both single connection and double connection

            //for single connection

            if(diff > 30) {
                // if the difference is more than 30 days then

                System.out.println("Booking can not be done");
                status= "C";   //here it's showing the status of Booking is cancelled
            }else{
                System.out.println("Status:Booked");
                status="B";// here it is showing the status of Booking is booked
                lastDate=dt_1;
            }
            //for double connection

            if(diff<50) {
                System.out.println("Booking cannot be done");
                status = "C";
            }else{
                System.out.println("Status:Booked");
                status="B";// here it is showing the status of Booking is booked
                lastDate=dt_1;
            }
        };



}
