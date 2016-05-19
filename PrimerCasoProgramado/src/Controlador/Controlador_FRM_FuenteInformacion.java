/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_FuenteInformacion;
import Vista.FRM_MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author altna
 */
public class Controlador_FRM_FuenteInformacion implements ActionListener {
    FRM_FuenteInformacion fuenteInfo;
    FRM_MenuPrincipal menu;
    Controlador_FRM_MenuPrincipal controladorMenu;
    public Controlador_FRM_FuenteInformacion(FRM_FuenteInformacion fuenteInfo)
    {
       this.fuenteInfo=fuenteInfo;
       
    }
    public void actionPerformed(ActionEvent e)
    {
        fuenteInfo=new FRM_FuenteInformacion();
        if(e.getActionCommand().equals("Aceptar"))
        {
            if(this.fuenteInfo.archivosPlanosSeleccionado()==true)
              {
                    System.out.println("xD");
              }
            if(fuenteInfo.xMLSeleccionado()==true)
             {
            
             }
            if(fuenteInfo.basesDeDatosSeleccionado()==true)
            {
            
            }
            System.out.println("lol");
        }
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
    }
    
    
}
