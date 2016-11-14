package hospital;

import hospital.Appointment;
import hospital.Doctor;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class AppointmentcontaintDoctor extends Composition {
  public class appointment extends Composition.Container<Appointment> {
  }
  
  public class doctor extends Association.Many<Doctor> {
  }
}
