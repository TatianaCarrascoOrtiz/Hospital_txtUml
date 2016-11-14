package diagram;

import hospital.Hospital_SM;
import hospital.Hospital_SM.Arrived_Patient_st;
import hospital.Hospital_SM.Assiged_Room_ch;
import hospital.Hospital_SM.Consultation_st;
import hospital.Hospital_SM.Discharged_st;
import hospital.Hospital_SM.Find_Hospital_st;
import hospital.Hospital_SM.Have_surgery_st;
import hospital.Hospital_SM.Hospitalization_st;
import hospital.Hospital_SM.Init;
import hospital.Hospital_SM.Need_Hospitalization_ch;
import hospital.Hospital_SM.Need_Surgery_ch;
import hospital.Hospital_SM.Registration_patient_st;
import hospital.Hospital_SM.State_Hospital_ch;
import hospital.Hospital_SM.Surgery_st;
import hu.elte.txtuml.api.layout.Below;
import hu.elte.txtuml.api.layout.Right;
import hu.elte.txtuml.api.layout.StateMachineDiagram;


public class Diagram_State extends StateMachineDiagram<Hospital_SM>
{
	@Below(from = Init.class, val = Arrived_Patient_st.class)
	@Below(from = Arrived_Patient_st.class, val = State_Hospital_ch.class)
	@Below(from= State_Hospital_ch.class, val= Registration_patient_st.class)
	@Right(from= State_Hospital_ch.class, val= Find_Hospital_st.class)
	@Below(from = Arrived_Patient_st.class, val = State_Hospital_ch.class)
	@Below(from = Registration_patient_st.class, val = Assiged_Room_ch.class)
	@Below(from = Assiged_Room_ch.class, val = Hospitalization_st.class)
	@Right(from = Consultation_st.class, val = Hospitalization_st.class)
	@Right(from = Hospitalization_st.class, val = Surgery_st.class)
	@Below(from = Surgery_st.class, val = Have_surgery_st.class)
	@Below(from = Hospitalization_st.class, val = Need_Surgery_ch.class)
	@Below(from = Consultation_st.class, val = Need_Hospitalization_ch.class)
	@Below(from = Need_Surgery_ch.class, val = Discharged_st.class)
	
	
	class HospitalLayoutSM extends Layout {}
}
