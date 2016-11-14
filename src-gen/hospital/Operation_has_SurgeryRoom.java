package hospital;

import hospital.Operation;
import hospital.Surgery_room;
import hu.elte.txtuml.api.model.Association;

@SuppressWarnings("all")
public class Operation_has_SurgeryRoom extends Association {
  public class surgery_room extends Association.One<Surgery_room> {
  }
  
  public class operation extends Association.Many<Operation> {
  }
}
