package hospital;

import hospital.Hospitalization_room;
import hospital.Patient;
import hu.elte.txtuml.api.model.Association;

@SuppressWarnings("all")
public class Patient_has_HospitalizationRoom extends Association {
  public class hospitalization_room extends Association.One<Hospitalization_room> {
  }
  
  public class patient extends Association.Many<Patient> {
  }
}
