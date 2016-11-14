package hospital;

import hospital.Address;
import hospital.Hospital;
import hu.elte.txtuml.api.model.Association;

@SuppressWarnings("all")
public class Hospital_has_Address extends Association {
  public class hospital extends Association.One<Hospital> {
  }
  
  public class address extends Association.One<Address> {
  }
}
