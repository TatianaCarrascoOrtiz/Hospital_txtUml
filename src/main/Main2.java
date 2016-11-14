package main;

import java.io.IOException;

import hospital.Hospital_SM;
import hospital.Hospital_sig;
import hospital.Need_Surgery_sig;
import hospital.New_Assignation_sig;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

public class Main2 
{
	static Hospital_SM hospital;
	static void init() 
	{
		hospital = Action.create(Hospital_SM.class);
		Action.start(hospital);
	}
	
	
	public static void main (String args[]) throws IOException
	{
		ModelExecutor.create().setTraceLogging(true).start(Main::init);
		System.in.read();
		Action.send(new Hospital_sig(), hospital);
		System.in.read();
		hospital.set_Hospital_guard(1);
		System.in.read();
		Action.send(new New_Assignation_sig(), hospital);
		System.in.read();
		hospital.set_Type_Appointment(3);
		System.in.read();
		Action.send(new Need_Surgery_sig(), hospital);
		hospital.set_Need_Surgery(0);

	}

}
