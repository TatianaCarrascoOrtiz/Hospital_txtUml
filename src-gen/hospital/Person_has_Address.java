package hospital;

import hospital.Address;
import hospital.Person;
import hu.elte.txtuml.api.model.Association;

@SuppressWarnings("all")
public class Person_has_Address extends Association {
  public class person extends Association.One<Person> {
  }
  
  public class address extends Association.One<Address> {
  }
}
