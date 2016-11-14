package diagram;

import hospital.Address;
import hospital.Appointment;
import hospital.Doctor;
import hospital.Hospital;
import hospital.Hospitalization_room;
import hospital.Illiness;
import hospital.Medication;
import hospital.Operation;
import hospital.Patient;
import hospital.Person;
import hospital.Room;
import hospital.Surgery_room;
import hospital.Doctor_room;
import hu.elte.txtuml.api.layout.Above;
import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Left;
import hu.elte.txtuml.api.layout.Right;

public class Diagram_Class extends ClassDiagram {
	@Right(val= Hospital.class, from= Address.class)
	@Above(val= Hospital.class, from= Person.class)
	@Left(val= Person.class, from= Hospitalization_room.class)
	@Left(val= Hospitalization_room.class, from= Doctor_room.class)
	@Above(val= Room.class, from= Doctor_room.class)
	@Left(val= Doctor_room.class, from= Surgery_room.class)
	@Above(val= Surgery_room.class, from= Operation.class)
	@Above(val= Doctor_room.class, from= Doctor.class)
	@Above(val= Doctor.class, from= Medication.class)
	@Left(val= Appointment.class, from= Medication.class)
	@Above(val= Patient.class, from= Illiness.class)
	@Left(val= Patient.class, from= Appointment.class)

	class HospitalLayout extends Layout {}
}