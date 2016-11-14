package hospital;

import hospital.Appointment;
import hospital.Medication;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class AppointmentcontaintMedication extends Composition {
  public class appointment extends Composition.Container<Appointment> {
  }
  
  public class medication extends Association.Many<Medication> {
  }
}
