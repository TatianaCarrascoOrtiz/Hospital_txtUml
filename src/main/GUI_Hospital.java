package main;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import hospital.Hospital_SM;
import hospital.Hospital_sig;
import hospital.New_Hospital_sig;
import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

public class GUI_Hospital extends JFrame implements GUI_Interface_H{
	
	
	  private javax.swing.JButton jButton1;
	  private javax.swing.JButton jButton2;
	  private javax.swing.JButton jButton3;
	  private javax.swing.JLabel jLabel1;
	  private javax.swing.JLabel jLabel2;
	  private javax.swing.JLabel jLabel3;
	  private javax.swing.JLabel jLabel4;
	  private javax.swing.JPanel jPanel1;
	  static Hospital_SM hospital;
	 
	  static void init() 
		{
		  hospital = Action.create(Hospital_SM.class);
			Action.start(hospital);
		}
	
		
	private void initComponents() {
		
		java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

       
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Desktop\\uml\\size\\New folder\\rsz_hospital.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 10, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Desktop\\uml\\size\\New folder\\rsz_patient.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jLabel2.setEnabled(true);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Desktop\\uml\\size\\New folder\\rsz_registration.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
       // jLabel3.setVisible(false);
        jLabel3.setEnabled(false);
        gridBagConstraints.insets = new java.awt.Insets(11, 26, 0, 55);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Desktop\\uml\\size\\New folder\\rsz_hospitals.png")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jLabel4.setEnabled(false);
        gridBagConstraints.insets = new java.awt.Insets(11, 20, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jButton1.setText("Go New Hospital");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 18, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setText("Open");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 11, 0, 0);
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 11, 0);
        jPanel1.add(jButton3, gridBagConstraints);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }
	
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
		jLabel3.setEnabled(true);
		jLabel2.setEnabled(false);
		jButton1.setEnabled(false);
		jButton2.setEnabled(false);
		jButton3.setEnabled(false);
		hospital.set_Hospital_guard(1);
		Action.send(new Hospital_sig(), hospital);
		
		
		
    }                                        

    void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {    
    	 jLabel2.setEnabled(true);
    	 jLabel3.setEnabled(false);
    	 jLabel4.setEnabled(false);
    	 jButton2.setEnabled(true);
 		 jButton3.setEnabled(true);
 		 jButton1.setEnabled(false);
    	 Action.send(new New_Hospital_sig(), hospital);
    }                                        

    void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	jLabel4.setEnabled(true);
    	jLabel2.setEnabled(false);
		jButton2.setEnabled(false);
		jButton3.setEnabled(false);
		jButton1.setEnabled(true);
    	hospital.set_Hospital_guard(0);
    	Action.send(new Hospital_sig(), hospital);
    }      
    
    
    public static void main (String args[])
    {
    	ModelExecutor.create().setTraceLogging(true).start(GUI_Hospital::init);
    	GUI_Hospital gui_hospital= new GUI_Hospital();
    	gui_hospital.initComponents();
    	gui_hospital.setBackground(Color.WHITE);
    	gui_hospital.setSize(new Dimension(250, 300));
		gui_hospital.setTitle("Hospital");
		gui_hospital.setVisible(true);
		
    }



}
