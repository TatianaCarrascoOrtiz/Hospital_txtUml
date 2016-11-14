package hospital;

import hospital.Person;

@SuppressWarnings("all")
public class Patient extends Person {
  String date_admission;
  
  String date_discharger;
  
  public void register_admission(final String date_admission) {
  }
  
  public String register_discharger() {
    return this.date_discharger;
  }
}
