/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia_semana;

import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author MiriamLeticia
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel1.setText("Determinacion de los dias de la semana");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setText("Dia:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Mes:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Año:");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Esta aplicacion permite saber el dia de la semana de una fecha dada");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("a partir de Enero de 1700 hasta la fecha");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("Determinar dia de la semana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //haremos las excepciones
        try{
            String dia=jTextField1.getText();
            String mes=""+jComboBox1.getSelectedItem();
            String anyo=jTextField3.getText();
            int Dia=Integer.parseInt(dia);
            int Anyo=Integer.parseInt(anyo);
            Calendar cal = Calendar.getInstance();
            int valor1;
            try{
                if(Dia<31){
                    if(Anyo>=1700){
                        if(mes.equalsIgnoreCase("Enero") || mes.equalsIgnoreCase("Marzo") || mes.equalsIgnoreCase("Mayo") || mes.equalsIgnoreCase("Julio") || mes.equalsIgnoreCase("Agosto") || mes.equalsIgnoreCase("Octubre") || mes.equalsIgnoreCase("Diciembre")){
                            if(Dia<=31){
                                switch(mes){
                                    case "Enero":
                                        cal.set(Anyo,0,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Marzo":
                                        cal.set(Anyo,2,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Mayo":
                                        cal.set(Anyo,4,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Julio":
                                        cal.set(Anyo,6,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Agosto":
                                        cal.set(Anyo,7,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Octubre":
                                        cal.set(Anyo,9,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Diciembre":
                                        cal.set(Anyo,11,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    
                                }
                            }
                        }else if(mes.equalsIgnoreCase("Abril") || mes.equalsIgnoreCase("Junio") || mes.equalsIgnoreCase("Septiembre") || mes.equalsIgnoreCase("Noviembre")){
                            if(Dia<=30){
                                switch(mes){
                                    case "Abril":
                                        cal.set(Anyo,3,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Junio":
                                        cal.set(Anyo,5,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Septiembre":
                                        cal.set(Anyo,8,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                    case "Noviembre":
                                        cal.set(Anyo,10,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                                        break;
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "El mes de " + mes +" solo tiene 30 dias");
                            }
                        }else if(mes.equalsIgnoreCase("Febrero")){
                            if(Dia<=29){
                                cal.set(Anyo,1,Dia);
                                        valor1=cal.get(Calendar.DAY_OF_WEEK);
                                        if(valor1==1){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Domingo");
                                        }else if(valor1==2){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Lunes");
                                        }else if(valor1==3){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Martes");
                                        }else if(valor1==4){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Miercoles");
                                        }else if(valor1==5){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Jueves");
                                        }else if(valor1==6){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Viernes");
                                        }else if(valor1==7){
                                            JOptionPane.showMessageDialog(null, "El dia " + Dia + " del mes de " + mes + " de "+Anyo+", es Sabado");
                                        }
                            }else{
                                JOptionPane.showMessageDialog(null, "Febrero solo tiene 28 dias o 29 en año bisiesto");
                            }
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese años mayores a 1700");
                    }
                }else{
                JOptionPane.showMessageDialog(null, "el dia no es valido");
            }
            }catch(Exception f){
                JOptionPane.showMessageDialog(null, "El año "+Anyo+" no es Bisiesto, entonces Febrero solo trae 28 dias");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debe ingresar valores validos, numeros naturales");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}