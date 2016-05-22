/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_FuenteInformacion;
import Controlador.Controlador_FRM_MenuPrincipal;

/**
 *
 * @author altna
 */
public class FRM_FuenteInformacion extends javax.swing.JFrame {

  
    public Controlador_FRM_FuenteInformacion controlador_FRM_FuenteInformacion;
    FRM_MenuPrincipal menu;
    
    public FRM_FuenteInformacion(FRM_MenuPrincipal frm_MenuPrincipal) 
    {
        initComponents();
       controlador_FRM_FuenteInformacion=new Controlador_FRM_FuenteInformacion(this,frm_MenuPrincipal);
       gUI_BotonesInformacionFuente1.agregarEventos(controlador_FRM_FuenteInformacion);
       setLocation(400,300);
               setVisible(true);
       
    }
    

    
    public boolean archivosPlanosSeleccionados()
    {
        return this.jrb_ArchivosPlanos.isSelected();
    }
    public boolean basesDeDatosSeleccionados()
    {
        return this.jrb_BasesDatos.isSelected();
    }
    public boolean xMLSeleccionados()
    {
        return this.jrb_XML.isSelected();
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
        gUI_BotonesInformacionFuente1 = new Vista.GUI_BotonesInformacionFuente();
        jrb_ArchivosPlanos = new javax.swing.JRadioButton();
        jrb_BasesDatos = new javax.swing.JRadioButton();
        jrb_XML = new javax.swing.JRadioButton();

        jLabel1.setText("¡Bienvenido!");

        jLabel2.setText("Por favor, elija la fuente de informacion con la que desea trabajar");

        jrb_ArchivosPlanos.setText("Archivos Planos");

        jrb_BasesDatos.setText("Bases de Datos");

        jrb_XML.setText("XML");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrb_BasesDatos)
                                    .addComponent(jrb_XML))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gUI_BotonesInformacionFuente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrb_ArchivosPlanos)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jrb_ArchivosPlanos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(gUI_BotonesInformacionFuente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jrb_BasesDatos)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_XML)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void jrb_ArchivosPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_ArchivosPlanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_ArchivosPlanosActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.GUI_BotonesInformacionFuente gUI_BotonesInformacionFuente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrb_ArchivosPlanos;
    private javax.swing.JRadioButton jrb_BasesDatos;
    private javax.swing.JRadioButton jrb_XML;
    // End of variables declaration//GEN-END:variables
}
