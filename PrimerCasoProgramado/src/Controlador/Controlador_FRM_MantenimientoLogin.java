/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_FuenteInformacion;
import Vista.FRM_MantenimientoLogin;
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
    FRM_MenuPrincipal menu;
    Controlador_FRM_MenuPrincipal controladorMenu;

    
    public Controlador_FRM_MantenimientoLogin(FRM_MantenimientoLogin mantenimientoLogin)
    {
       this.mantenimientoLogin=mantenimientoLogin;
       this.menu=menu;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Login"))
        {
            
        }
        if(e.getActionCommand().equals("Registrar"))
        {
            
        }
        
    }
}

