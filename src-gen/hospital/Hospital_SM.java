package hospital;

import hospital.Hospital_sig;
import hospital.Hospitalization_Surgery_sig;
import hospital.Need_Hospitalization_sig;
import hospital.Need_Surgery_sig;
import hospital.New_Assignation_sig;
import hospital.New_Hospital_sig;
import hospital.Surgery_sig;
import hu.elte.txtuml.api.model.From;
import hu.elte.txtuml.api.model.ModelClass;
import hu.elte.txtuml.api.model.StateMachine;
import hu.elte.txtuml.api.model.To;
import hu.elte.txtuml.api.model.Trigger;

@SuppressWarnings("all")
public class Hospital_SM extends ModelClass {
  public class Init extends StateMachine.Initial {
  }
  
  public class Arrived_Patient_st extends StateMachine.State {
  }
  
  public class State_Hospital_ch extends StateMachine.Choice {
  }
  
  public class Assiged_Room_ch extends StateMachine.Choice {
  }
  
  public class Need_Surgery_ch extends StateMachine.Choice {
  }
  
  public class Need_Hospitalization_ch extends StateMachine.Choice {
  }
  
  public class Registration_patient_st extends StateMachine.State {
  }
  
  public class Find_Hospital_st extends StateMachine.State {
  }
  
  public class Consultation_st extends StateMachine.State {
  }
  
  public class Hospitalization_st extends StateMachine.State {
  }
  
  public class Surgery_st extends StateMachine.State {
  }
  
  public class Discharged_st extends StateMachine.State {
  }
  
  public class Have_surgery_st extends StateMachine.State {
  }
  
  int Hospital_guard;
  
  int Type_Appointment;
  
  int Need_Surgery;
  
  int Need_Hospitalization;
  
  @From(Hospital_SM.Init.class)
  @To(Hospital_SM.Arrived_Patient_st.class)
  public class Initialisation_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Arrived_Patient_st.class)
  @To(Hospital_SM.State_Hospital_ch.class)
  @Trigger(Hospital_sig.class)
  public class Hospital_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.State_Hospital_ch.class)
  @To(Hospital_SM.Registration_patient_st.class)
  public class Hospital_Open_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Hospital_guard == 1);
    }
  }
  
  @From(Hospital_SM.State_Hospital_ch.class)
  @To(Hospital_SM.Find_Hospital_st.class)
  public class Hospital_Close_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Hospital_guard == 0);
    }
  }
  
  public int set_Hospital_guard(final int Hospital_guard) {
    return this.Hospital_guard = Hospital_guard;
  }
  
  @From(Hospital_SM.Find_Hospital_st.class)
  @To(Hospital_SM.Arrived_Patient_st.class)
  @Trigger(New_Hospital_sig.class)
  public class New_Hospital_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Registration_patient_st.class)
  @To(Hospital_SM.Assiged_Room_ch.class)
  @Trigger(New_Assignation_sig.class)
  public class Assignation_Appointment_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Assiged_Room_ch.class)
  @To(Hospital_SM.Consultation_st.class)
  public class Appointment_Consultation_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Type_Appointment == 1);
    }
  }
  
  @From(Hospital_SM.Assiged_Room_ch.class)
  @To(Hospital_SM.Hospitalization_st.class)
  public class Appointment_Hospitalization_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Type_Appointment == 2);
    }
  }
  
  @From(Hospital_SM.Assiged_Room_ch.class)
  @To(Hospital_SM.Surgery_st.class)
  public class Appointment_Surgery_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Type_Appointment == 3);
    }
  }
  
  public void set_Type_Appointment(final int Type_Appointment) {
    this.Type_Appointment = Type_Appointment;
  }
  
  @From(Hospital_SM.Surgery_st.class)
  @To(Hospital_SM.Have_surgery_st.class)
  @Trigger(Surgery_sig.class)
  public class Have_Surgery_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Have_surgery_st.class)
  @To(Hospital_SM.Hospitalization_st.class)
  @Trigger(Hospitalization_Surgery_sig.class)
  public class Hospitalization_Surgery_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Hospitalization_st.class)
  @To(Hospital_SM.Need_Surgery_ch.class)
  @Trigger(Need_Surgery_sig.class)
  public class Need_Surgery_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Need_Surgery_ch.class)
  @To(Hospital_SM.Discharged_st.class)
  public class No_Need_Surgery_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Need_Surgery == 0);
    }
  }
  
  @From(Hospital_SM.Need_Surgery_ch.class)
  @To(Hospital_SM.Surgery_st.class)
  public class Yes_Need_Surgery_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Need_Surgery == 1);
    }
  }
  
  public void set_Need_Surgery(final int Need_Surgery) {
    this.Need_Surgery = Need_Surgery;
  }
  
  @From(Hospital_SM.Consultation_st.class)
  @To(Hospital_SM.Need_Hospitalization_ch.class)
  @Trigger(Need_Hospitalization_sig.class)
  public class Need_Hospitalization_tr extends StateMachine.Transition {
  }
  
  @From(Hospital_SM.Need_Hospitalization_ch.class)
  @To(Hospital_SM.Discharged_st.class)
  public class No_Need_Hospitalization_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Need_Hospitalization == 0);
    }
  }
  
  @From(Hospital_SM.Need_Hospitalization_ch.class)
  @To(Hospital_SM.Hospitalization_st.class)
  public class Yes_Need_Hospitalization_tr extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (Hospital_SM.this.Need_Hospitalization == 1);
    }
  }
  
  public void set_Need_Hospitalization(final int Need_Hospitalization) {
    this.Need_Hospitalization = Need_Hospitalization;
  }
}
