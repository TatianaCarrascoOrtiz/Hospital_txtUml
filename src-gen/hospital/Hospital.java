package hospital;

import hu.elte.txtuml.api.model.ModelClass;

@SuppressWarnings("all")
public class Hospital extends ModelClass {
  int code;
  
  String name;
  
  String phone;
  
  public String get_phone() {
    return this.phone;
  }
}
