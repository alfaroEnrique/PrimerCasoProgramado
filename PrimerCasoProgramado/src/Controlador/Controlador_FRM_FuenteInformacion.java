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
 * @author altna
 */
public class Controlador_FRM_FuenteInformacion implements ActionListener {
    FRM_FuenteInformacion fuenteInfo;
    FRM_MenuPrincipal menu;
    Controlador_FRM_MenuPrincipal controladorMenu;
    FRM_MantenimientoLogin Login;
public int eleccion=0;
   
    public Controlador_FRM_FuenteInformacion(FRM_FuenteInformacion fuenteInfo)
    {
       this.fuenteInfo=fuenteInfo;
       this.menu=menu;
       Login=new FRM_MantenimientoLogin();
       
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getActionCommand().equals("Aceptar"))
        {
            Login.setVisible(true);
            if(this.fuenteInfo.archivosPlanosSeleccionados())
            {
                eleccion=1;
                System.out.println("archivoPlanos");
            }
            if(this.fuenteInfo.basesDeDatosSeleccionados())
            {
                eleccion=2;
                System.out.println("BaseDeDatos");
            }
            if(this.fuenteInfo.xMLSeleccionados())
            {
                eleccion=3;
                System.out.println("XML");
            }
            
            //En el caso de que se selecciones dos o mas opciones;
            
            if(this.fuenteInfo.xMLSeleccionados()&&this.fuenteInfo.basesDeDatosSeleccionados()&&this.fuenteInfo.archivosPlanosSeleccionados()
             ||this.fuenteInfo.xMLSeleccionados()&&this.fuenteInfo.basesDeDatosSeleccionados()||this.fuenteInfo.xMLSeleccionados()&&this.fuenteInfo.archivosPlanosSeleccionados()
             ||this.fuenteInfo.basesDeDatosSeleccionados()&&this.fuenteInfo.archivosPlanosSeleccionados())
            {
                System.out.println("Se pueden seleccionar solo una opcion a la vez");
            }
            
            fuenteInfo.setVisible(false);
        }
    
        if(e.getActionCommand().equals("Salir"))
        {
           System.exit(0);
        }
    }
   public int devolverEleccion()
   {
       return eleccion;
   }
}
