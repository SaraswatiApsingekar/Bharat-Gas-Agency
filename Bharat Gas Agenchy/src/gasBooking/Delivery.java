package gasBooking;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Delivery extends Booking{

    public String delPersonName;

    int customerOtp;


    public Delivery(String name, String pinCode, String mobile, String street, String area, int numberOfCylinder) {
        super(name, pinCode, mobile, street, area, numberOfCylinder);
    }

    public void amoutCalculation(){

        Date dt_2=null;
        long daydiff= dt_2.getTime() - dt_1.getTime();

        long newdiff= TimeUnit.DAYS.convert(daydiff,TimeUnit.MILLISECONDS);

        if(newdiff > 7){
            refund=41.35;
            amount=amount-refund;
        }
         }

         // here we are checking the otp
         public void verifyOtp() {
             if (status.equals("B")) {  //if satus is booked then user will enter the otp
                 System.out.println("Enter the OTP:");

                 Scanner scn = new Scanner(System.in);
                 customerOtp = scn.nextInt();

                 if (customerOtp != otp) { // if usr otp and real otp mismatched then status is cancled
                     status = "C";
                 } else {
                     status = "B";        // if usr otp and real otp matched then status is booked
                 }
             } else {
                 System.out.println("Enter correct OTP");
             }
         }

         public void deliveryPersonDetails(){
             System.out.println("Enter the delivery person name:");

             Scanner sr= new Scanner(System.in);
             delPersonName = sr.nextLine();
         }

}
