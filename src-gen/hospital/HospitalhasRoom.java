package hospital;

import hospital.Hospital;
import hospital.Room;
import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;

@SuppressWarnings("all")
public class HospitalhasRoom extends Composition {
  public class hospital extends Composition.Container<Hospital> {
  }
  
  public class room extends Association.Many<Room> {
  }
}
