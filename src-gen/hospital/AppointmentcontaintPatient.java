package hospital;

import hospital.Appointment;
import hospital.Patient;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class AppointmentcontaintPatient extends Composition {
  public class appointment extends Composition.Container<Appointment> {
  }
  
  public class patient extends Association.One<Patient> {
  }
}
