/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Didier
 */
public class GUIRadio extends javax.swing.JFrame {

    /**
     * Creates new form GUIRadio
     */
    Radio radi;
    public GUIRadio() {
        radi=new Radio();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        RadioSencillo = new javax.swing.JPanel();
        power = new javax.swing.JButton();
        interfaz = new javax.swing.JTextField();
        frecu = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        bot1 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        bot5 = new javax.swing.JButton();
        bot6 = new javax.swing.JButton();
        bot7 = new javax.swing.JButton();
        bot8 = new javax.swing.JButton();
        bot9 = new javax.swing.JButton();
        bot10 = new javax.swing.JButton();
        bot11 = new javax.swing.JButton();
        bot12 = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        guardar = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jButton4.setText("jButton3");

        jButton11.setText("jButton3");

        jButton17.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RadioSencillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        power.setBackground(new java.awt.Color(255, 0, 0));
        power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hojadetrabajo1/descarga.png"))); // NOI18N
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });
        RadioSencillo.add(power, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 70));

        interfaz.setEditable(false);
        interfaz.setBackground(new java.awt.Color(0, 204, 204));
        interfaz.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        interfaz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        RadioSencillo.add(interfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 107, 343, 49));

        frecu.setBackground(new java.awt.Color(204, 255, 204));
        frecu.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        frecu.setText("AM/FM");
        frecu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecuActionPerformed(evt);
            }
        });
        RadioSencillo.add(frecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 55, -1, -1));

        bot3.setBackground(new java.awt.Color(255, 102, 102));
        bot3.setText("3");
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 187, 48, -1));

        bot2.setBackground(new java.awt.Color(255, 102, 102));
        bot2.setText("2");
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 187, 47, -1));

        bot1.setBackground(new java.awt.Color(255, 102, 102));
        bot1.setText("1");
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 187, 47, -1));

        bot4.setBackground(new java.awt.Color(255, 102, 102));
        bot4.setText("4");
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot4, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 187, 45, -1));

        bot5.setBackground(new java.awt.Color(255, 102, 102));
        bot5.setText("5");
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot5, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 187, 45, -1));

        bot6.setBackground(new java.awt.Color(255, 102, 102));
        bot6.setText("6");
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot6, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 187, 45, -1));

        bot7.setBackground(new java.awt.Color(255, 102, 102));
        bot7.setText("7");
        bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot7ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot7, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 221, 47, -1));

        bot8.setBackground(new java.awt.Color(255, 102, 102));
        bot8.setText("8");
        bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot8ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot8, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 221, 47, -1));

        bot9.setBackground(new java.awt.Color(255, 102, 102));
        bot9.setText("9");
        bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot9ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot9, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 221, 48, -1));

        bot10.setBackground(new java.awt.Color(255, 102, 102));
        bot10.setText("10");
        bot10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot10ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot10, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 221, -1, -1));

        bot11.setBackground(new java.awt.Color(255, 102, 102));
        bot11.setText("11");
        bot11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot11ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot11, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 221, -1, -1));

        bot12.setBackground(new java.awt.Color(255, 102, 102));
        bot12.setText("12");
        bot12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot12ActionPerformed(evt);
            }
        });
        RadioSencillo.add(bot12, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 221, -1, -1));

        anterior.setBackground(new java.awt.Color(255, 255, 0));
        anterior.setText("<<");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        RadioSencillo.add(anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 262, 82, -1));

        siguiente.setBackground(new java.awt.Color(255, 255, 0));
        siguiente.setText(">>");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        RadioSencillo.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 262, 82, -1));

        guardar.setBackground(new java.awt.Color(153, 153, 255));
        guardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 153, 0));
        guardar.setText("Guardar Estacion");
        RadioSencillo.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 262, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 255));
        jButton1.setFocusable(false);
        RadioSencillo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 30, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hojadetrabajo1/fondo_loco3.jpg"))); // NOI18N
        RadioSencillo.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, 0, 1310, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RadioSencillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RadioSencillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        radi.OnOff();
        if (radi.isOn()==true)
        interfaz.setText(String.valueOf(radi.getStation()));
        else
        interfaz.setText("");
    }//GEN-LAST:event_powerActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        int position=5;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot6ActionPerformed

    private void frecuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecuActionPerformed
        if(radi.isOn()==true){
        radi.changeFrecuency();
        radi.setStation();
        interfaz.setText(String.valueOf(radi.getStation()));
        }
    }//GEN-LAST:event_frecuActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if(radi.isOn()==true){
        radi.Forward();
        interfaz.setText(String.valueOf(radi.getStation()));
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if(radi.isOn()==true){
        radi.Backward();
        interfaz.setText(String.valueOf(radi.getStation()));
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        int position=0;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }    
    }//GEN-LAST:event_bot1ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        int position=1;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot2ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        int position=2;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot3ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
       int position=3;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        int position=4;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot5ActionPerformed

    private void bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot7ActionPerformed
        int position=6;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot7ActionPerformed

    private void bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot8ActionPerformed
        int position=7;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot8ActionPerformed

    private void bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot9ActionPerformed
        int position=8;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot9ActionPerformed

    private void bot10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot10ActionPerformed
        int position=9;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot10ActionPerformed

    private void bot11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot11ActionPerformed
        int position=10;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot11ActionPerformed

    private void bot12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot12ActionPerformed
        int position=11;
        if(radi.isOn()==true&&radi.getMemory(position)!=0){
        if(guardar.isSelected()){
           radi.setMemory(position);
        }
        else{
           radi.changeStation(position);
           interfaz.setText(String.valueOf(radi.getMemory(position)));
        }
        }
    }//GEN-LAST:event_bot12ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRadio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new GUIRadio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RadioSencillo;
    private javax.swing.JButton anterior;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot10;
    private javax.swing.JButton bot11;
    private javax.swing.JButton bot12;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot4;
    private javax.swing.JButton bot5;
    private javax.swing.JButton bot6;
    private javax.swing.JButton bot7;
    private javax.swing.JButton bot8;
    private javax.swing.JButton bot9;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton frecu;
    private javax.swing.JCheckBox guardar;
    private javax.swing.JTextField interfaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton power;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
