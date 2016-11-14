package hospital;

import hospital.Appointment;
import hospital.Illiness;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class AppointmentcontaintIlliness extends Composition {
  public class appointment extends Composition.Container<Appointment> {
  }
  
  public class illiness extends Association.Many<Illiness> {
  }
}
