/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainapp;

/**
 *
 * @author temuulen
 */
public class MainGUI extends javax.swing.JFrame {
    
    public MainGUI() {
        
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonsPNL = new javax.swing.JPanel();
        RequestTestBTN = new javax.swing.JButton();
        NextPatientBTN = new javax.swing.JButton();
        ViewListBTN = new javax.swing.JButton();
        AbsentListBTN = new javax.swing.JButton();
        BackgroundPNL = new javax.swing.JPanel();
        RequestTestPNL = new javax.swing.JPanel();
        NameTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        PriorityTF = new javax.swing.JTextField();
        PatientTF = new javax.swing.JTextField();
        gpDetailsTF = new javax.swing.JTextField();
        NameLBL = new javax.swing.JLabel();
        AgeLBL = new javax.swing.JLabel();
        PriorityLBL = new javax.swing.JLabel();
        PatientLBL = new javax.swing.JLabel();
        gpDetailsLBL = new javax.swing.JLabel();
        InfoBTN = new javax.swing.JButton();
        SubmitBTN = new javax.swing.JButton();
        ViewListPNL = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewListTA = new javax.swing.JTextArea();
        NextPatientPNL = new javax.swing.JPanel();
        TestTakenBTN = new javax.swing.JButton();
        MissingBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientDetailTA = new javax.swing.JTextArea();
        AbsentListPNL = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AbsentListTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RequestTestBTN.setText("Request a Test");
        RequestTestBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestTestBTNActionPerformed(evt);
            }
        });

        NextPatientBTN.setText("Next Patient");
        NextPatientBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPatientBTNActionPerformed(evt);
            }
        });

        ViewListBTN.setText("View Request List");
        ViewListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewListBTNActionPerformed(evt);
            }
        });

        AbsentListBTN.setText("Absent List");
        AbsentListBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsentListBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonsPNLLayout = new javax.swing.GroupLayout(ButtonsPNL);
        ButtonsPNL.setLayout(ButtonsPNLLayout);
        ButtonsPNLLayout.setHorizontalGroup(
            ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPNLLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RequestTestBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewListBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NextPatientBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AbsentListBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        ButtonsPNLLayout.setVerticalGroup(
            ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPNLLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RequestTestBTN)
                    .addComponent(NextPatientBTN))
                .addGap(18, 18, 18)
                .addGroup(ButtonsPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewListBTN)
                    .addComponent(AbsentListBTN))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonsPNL, java.awt.BorderLayout.PAGE_START);

        BackgroundPNL.setLayout(new java.awt.CardLayout());

        NameLBL.setText("Name");

        AgeLBL.setText("Age");

        PriorityLBL.setText("Priority(High/Medium/Low)");

        PatientLBL.setText("Patient(Yes/No)");

        gpDetailsLBL.setText("Gp Detail");

        InfoBTN.setText("?");
        InfoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBTNActionPerformed(evt);
            }
        });

        SubmitBTN.setText("Submit");
        SubmitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestTestPNLLayout = new javax.swing.GroupLayout(RequestTestPNL);
        RequestTestPNL.setLayout(RequestTestPNLLayout);
        RequestTestPNLLayout.setHorizontalGroup(
            RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestTestPNLLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestTestPNLLayout.createSequentialGroup()
                        .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PatientLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gpDetailsLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AgeLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestTestPNLLayout.createSequentialGroup()
                                .addComponent(PriorityLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InfoBTN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PatientTF, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(gpDetailsTF)
                            .addComponent(PriorityTF)
                            .addComponent(AgeTF)
                            .addComponent(NameTF))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestTestPNLLayout.createSequentialGroup()
                        .addComponent(SubmitBTN)
                        .addContainerGap())))
        );
        RequestTestPNLLayout.setVerticalGroup(
            RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestTestPNLLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriorityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InfoBTN)
                    .addComponent(PriorityLBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PatientLBL)
                    .addComponent(PatientTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RequestTestPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gpDetailsLBL)
                    .addComponent(gpDetailsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubmitBTN)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        BackgroundPNL.add(RequestTestPNL, "card5");

        ViewListTA.setColumns(20);
        ViewListTA.setRows(5);
        jScrollPane1.setViewportView(ViewListTA);

        javax.swing.GroupLayout ViewListPNLLayout = new javax.swing.GroupLayout(ViewListPNL);
        ViewListPNL.setLayout(ViewListPNLLayout);
        ViewListPNLLayout.setHorizontalGroup(
            ViewListPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewListPNLLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        ViewListPNLLayout.setVerticalGroup(
            ViewListPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewListPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        BackgroundPNL.add(ViewListPNL, "card3");

        TestTakenBTN.setText("Test Taken");
        TestTakenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestTakenBTNActionPerformed(evt);
            }
        });

        MissingBTN.setText("Missing");
        MissingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MissingBTNActionPerformed(evt);
            }
        });

        PatientDetailTA.setColumns(20);
        PatientDetailTA.setRows(5);
        jScrollPane2.setViewportView(PatientDetailTA);

        javax.swing.GroupLayout NextPatientPNLLayout = new javax.swing.GroupLayout(NextPatientPNL);
        NextPatientPNL.setLayout(NextPatientPNLLayout);
        NextPatientPNLLayout.setHorizontalGroup(
            NextPatientPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NextPatientPNLLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(NextPatientPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(NextPatientPNLLayout.createSequentialGroup()
                        .addComponent(TestTakenBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MissingBTN))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        NextPatientPNLLayout.setVerticalGroup(
            NextPatientPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NextPatientPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(NextPatientPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TestTakenBTN)
                    .addComponent(MissingBTN))
                .addGap(58, 58, 58))
        );

        BackgroundPNL.add(NextPatientPNL, "card2");

        AbsentListTA.setColumns(20);
        AbsentListTA.setRows(5);
        jScrollPane3.setViewportView(AbsentListTA);

        javax.swing.GroupLayout AbsentListPNLLayout = new javax.swing.GroupLayout(AbsentListPNL);
        AbsentListPNL.setLayout(AbsentListPNLLayout);
        AbsentListPNLLayout.setHorizontalGroup(
            AbsentListPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbsentListPNLLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        AbsentListPNLLayout.setVerticalGroup(
            AbsentListPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbsentListPNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        BackgroundPNL.add(AbsentListPNL, "card4");

        getContentPane().add(BackgroundPNL, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //this button is to enable the request test panel
    private void RequestTestBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestTestBTNActionPerformed
        BackgroundPNL.removeAll();
        BackgroundPNL.add(RequestTestPNL);
        BackgroundPNL.repaint();
        BackgroundPNL.revalidate();
    }//GEN-LAST:event_RequestTestBTNActionPerformed

    private void NextPatientBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPatientBTNActionPerformed
        BackgroundPNL.removeAll();
        BackgroundPNL.add(NextPatientPNL);
        Requests headRequest = Requests.getHead();
    
        // get the highest priority request
        Requests nextPatient = Patient.getHighestPriorityRequest(headRequest);

        // display the patient details
        if (nextPatient != null) {
            PatientDetailTA.setText(nextPatient.toString());
        } else {
            PatientDetailTA.setText("No pending blood test requests.");
        }
        BackgroundPNL.repaint();
        BackgroundPNL.revalidate();
    }//GEN-LAST:event_NextPatientBTNActionPerformed
    // this button will display the Request list
    private void ViewListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewListBTNActionPerformed
        BackgroundPNL.removeAll();
        BackgroundPNL.add(ViewListPNL);
        
        //stringbuilder to contain multiple strings
        StringBuilder sb = new StringBuilder();
        Requests.displayRequestsToStringBuilder(sb);
        ViewListTA.setText(sb.toString());
        
        BackgroundPNL.repaint();
        BackgroundPNL.revalidate();
    }//GEN-LAST:event_ViewListBTNActionPerformed
    //this button show the people who missed their appointment
    private void AbsentListBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsentListBTNActionPerformed
        BackgroundPNL.removeAll();
        BackgroundPNL.add(AbsentListPNL);
        
        AbsentListTA.setText(Requests.getAbsentRequestsAsString());
        
        BackgroundPNL.repaint();
        BackgroundPNL.revalidate();
    }//GEN-LAST:event_AbsentListBTNActionPerformed
    // this button submit the users input to the linked list
    private void SubmitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBTNActionPerformed
        String name = NameTF.getText();
        int age;
        try {
            age = Integer.parseInt(AgeTF.getText());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid age.");
            return;
        }

        String priority = PriorityTF.getText();
        boolean isPatient = PatientTF.getText().equalsIgnoreCase("Yes");
        String gpDetails = gpDetailsTF.getText();

        // Add the request to the list
        Requests.addRequest(name, age, priority, isPatient, gpDetails);

        // Clear the fields
        NameTF.setText("");
        AgeTF.setText("");
        PriorityTF.setText("");
        PatientTF.setText("");
        gpDetailsTF.setText("");

        javax.swing.JOptionPane.showMessageDialog(this, "Blood test request submitted.");
    }//GEN-LAST:event_SubmitBTNActionPerformed
    
    // this button shows the Priority Information
    private void InfoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBTNActionPerformed
         String infoMessage = "Priority Levels:\n\n" +
                         "High - Urgent cases requiring immediate attention\n" +
                         "Medium - Standard cases with normal processing time\n" +
                         "Low - Non-urgent cases that can be processed when resources are available";
    
        javax.swing.JOptionPane.showMessageDialog(this, 
                                             infoMessage,
                                             "Priority Information", 
                                             javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_InfoBTNActionPerformed
    //this button removes the test taken patient and shows the next person who is in line
    private void TestTakenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestTakenBTNActionPerformed
        // gets the highest priority patient
        Requests highestPriorityRequest = Patient.getHighestPriorityRequest(Requests.getHead());

        if (highestPriorityRequest != null) {
            // removes the request from the list
            Requests.removeRequest(highestPriorityRequest);

            // updates the display
            Requests nextPatient = Patient.getHighestPriorityRequest(Requests.getHead());
            if (nextPatient != null) {
                PatientDetailTA.setText(nextPatient.toString());
            } else {
                PatientDetailTA.setText("No more pending blood test requests.");
            }
        }
    }//GEN-LAST:event_TestTakenBTNActionPerformed

    private void MissingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MissingBTNActionPerformed
        Requests highestPriorityRequest = Patient.getHighestPriorityRequest(Requests.getHead());
    
        if (highestPriorityRequest != null) {
            // this adds it to absent list
            Requests.addToAbsentList(highestPriorityRequest);

            // this will remove the request from main list
            Requests.removeRequest(highestPriorityRequest);

            // update the display
            Requests nextPatient = Patient.getHighestPriorityRequest(Requests.getHead());
            if (nextPatient != null) {
                PatientDetailTA.setText(nextPatient.toString());
            } else {
                PatientDetailTA.setText("No more pending blood test requests.");
            }
        }
    }//GEN-LAST:event_MissingBTNActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsentListBTN;
    private javax.swing.JPanel AbsentListPNL;
    private javax.swing.JTextArea AbsentListTA;
    private javax.swing.JLabel AgeLBL;
    private javax.swing.JTextField AgeTF;
    private javax.swing.JPanel BackgroundPNL;
    private javax.swing.JPanel ButtonsPNL;
    private javax.swing.JButton InfoBTN;
    private javax.swing.JButton MissingBTN;
    private javax.swing.JLabel NameLBL;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton NextPatientBTN;
    private javax.swing.JPanel NextPatientPNL;
    private javax.swing.JTextArea PatientDetailTA;
    private javax.swing.JLabel PatientLBL;
    private javax.swing.JTextField PatientTF;
    private javax.swing.JLabel PriorityLBL;
    private javax.swing.JTextField PriorityTF;
    private javax.swing.JButton RequestTestBTN;
    private javax.swing.JPanel RequestTestPNL;
    private javax.swing.JButton SubmitBTN;
    private javax.swing.JButton TestTakenBTN;
    private javax.swing.JButton ViewListBTN;
    private javax.swing.JPanel ViewListPNL;
    private javax.swing.JTextArea ViewListTA;
    private javax.swing.JLabel gpDetailsLBL;
    private javax.swing.JTextField gpDetailsTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
