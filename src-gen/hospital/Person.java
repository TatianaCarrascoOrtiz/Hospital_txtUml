package hospital;

import hu.elte.txtuml.api.model.ModelClass;

@SuppressWarnings("all")
public class Person extends ModelClass {
  int id;
  
  String names;
  
  String lastnames;
  
  String phone;
  
  String date_birth;
  
  String gender;
  
  public int calculate_age() {
    return 3;
  }
}
