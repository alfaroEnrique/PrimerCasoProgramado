/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.FRM_MantenimientoLogin;
import Vista.FRM_MantenimientoUsuario;
import Vista.FRM_MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Enrique
 */
public class Controlador_FRM_MantenimientoLogin implements ActionListener
{
    FRM_MantenimientoLogin mantenimientoLogin;
    FRM_MantenimientoUsuario mantenimientoUsuario;
    FRM_MenuPrincipal menuPrincipal;
    
   public Controlador_FRM_MantenimientoLogin(FRM_MantenimientoLogin mantenimientoLogin,FRM_MantenimientoUsuario mantenimientoUsuario)
   {
     this.mantenimientoLogin=mantenimientoLogin;
     this.mantenimientoUsuario=mantenimientoUsuario;
     menuPrincipal=new FRM_MenuPrincipal();
     mantenimientoLogin.setVisible(true);
   }
   
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getActionCommand().equals("Login")) 
      {
          
      }
      if(e.getActionCommand().equals("Ingresar"))
      {
          System.exit(0);
      }
   }
}
