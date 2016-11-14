package hospital;

import hu.elte.txtuml.api.model.ModelClass;

@SuppressWarnings("all")
public class Address extends ModelClass {
  String main_street;
  
  String number;
  
  int floor;
  
  String Code_Zip;
  
  String city;
  
  String country;
  
  public String get_Address() {
    return this.main_street;
  }
  
  public void set_Address(final String main_street, final String number, final int floor, final String Code_Zip, final String city, final String country) {
    this.main_street = main_street;
    this.number = number;
    this.floor = floor;
    this.Code_Zip = Code_Zip;
    this.city = city;
    this.country = country;
  }
}
