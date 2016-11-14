package hospital;

import hospital.Hospital;
import hospital.Person;
import hu.elte.txtuml.api.model.Association;

@SuppressWarnings("all")
public class Hospital_has_Person extends Association {
  public class hospital extends Association.One<Hospital> {
  }
  
  public class person extends Association.Many<Person> {
  }
}
