package customer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class GasConnection extends Customer{

    public int numberOfCylinder;

    static int connectionNumber = 100;
    {
        connectionNumber += 1;
    }
     String date;
    public Date lastDate = null;
    SimpleDateFormat dateFormat= new SimpleDateFormat("dd/mm/yyyy");

    public GasConnection(String name, String pinCode, String mobile, String street, String area, int numberOfCylinder) {
        super(name, pinCode, mobile, street, area);
        this.numberOfCylinder = numberOfCylinder;
    }

    public void getLastDate(){
        System.out.println("Enter the last Date");
        Scanner sc = new Scanner(System.in);
        date= sc.nextLine();

        try{
        lastDate = dateFormat.parse(date);
        } catch (Exception e){
            System.out.println("error in getLastDate: "+ e);
        }

        }
}
