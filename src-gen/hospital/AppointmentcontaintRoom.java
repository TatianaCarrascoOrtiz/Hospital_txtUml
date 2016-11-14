package hospital;

import hospital.Appointment;
import hospital.Room;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class AppointmentcontaintRoom extends Composition {
  public class appointment extends Composition.Container<Appointment> {
  }
  
  public class room extends Association.Many<Room> {
  }
}
