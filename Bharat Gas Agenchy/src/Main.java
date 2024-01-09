import gasBooking.*;
import customer.*;
import gasSupplier.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    static int count;
    static int bCount=0,cCount=0,dCount=0, pCount=0;
    static String deliveryPersonName;

    public static void cylinder_count(Delivery[] obj) {

        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};


        for (Delivery delivery : obj) {

            count = 0;
            System.out.println("In the month of" + (months[delivery.dt_2.getMonth()] + " :"));
            System.out.println(" * In" + delivery.area);
            if (delivery.status.equals("D")) {
                count += delivery.numberOfCylinder;
            }
            System.out.println("--" + count + "CylindersDeliverd");
        }
        System.out.println("/n");
    }

    public static void checkLateDel(Delivery[] obj) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        int[] month= new int[12];





    }

