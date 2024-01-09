package gasSupplier;

public interface gasAgency {

  public   String agencyName="BHARAT GAS";

     public int agencyCode = 1234;

    public int phoneNumber = 123445;

    default void displayAgency(){
        System.out.println("The agency name is:" +agencyName);
        System.out.println("The agency code is:" +agencyCode);
        System.out.println("The agency contact is:" +phoneNumber);
    }
}
