/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.FRM_MantenimientoLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Enrique
 */
public class Controlador_FRM_MantenimientoLogin implements ActionListener
{
    FRM_MantenimientoLogin mantenimientoLogin;
    
   public Controlador_FRM_MantenimientoLogin(FRM_MantenimientoLogin mantenimientoLogin)
   {
     this.mantenimientoLogin=mantenimientoLogin;
   }
   
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getActionCommand().equals("Ingresar")) 
      {
          
      }
      if(e.getActionCommand().equals("Salir"))
      {
          System.exit(0);
      }
   }
}
