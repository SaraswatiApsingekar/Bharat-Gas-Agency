package customer;
 import gasSupplier.gasAgency;
public class Customer implements gasAgency {

   String name;

   String pinCode;

   String mobile;

   String street;

   public String area;

   public Customer(String name, String pinCode, String mobile, String street, String area) {
      this.name = name;
      this.pinCode = pinCode;
      this.mobile = mobile;
      this.street = street;
      this.area = area;
   }
}
