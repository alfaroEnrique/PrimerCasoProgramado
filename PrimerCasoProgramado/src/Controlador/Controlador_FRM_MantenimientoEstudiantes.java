/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ArchivoEstudiantes;
import Modelo.MetodosEstudiantes;
import Vista.FRM_MantenimientoEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tecnologiamultimedia
 */
public class Controlador_FRM_MantenimientoEstudiantes implements ActionListener{
    
    
    public MetodosEstudiantes metodos;
    FRM_MantenimientoEstudiantes mantenimientoEstudiantes;
    ArchivoEstudiantes archivo;
    Controlador_FRM_FuenteInformacion fuente;
    
    public Controlador_FRM_MantenimientoEstudiantes(FRM_MantenimientoEstudiantes mantenimientoEstudiantes)
    {
        this.mantenimientoEstudiantes=mantenimientoEstudiantes;
        metodos = new MetodosEstudiantes();
        mantenimientoEstudiantes.estadoInicial();
        archivo=new ArchivoEstudiantes();
        
        if(archivo.cargarArchivoEstudiantes()){
     metodos.setArray(archivo.devolverInformacionDeEstudiantes());
     }
     else
     {
         archivo.crearArchivoEstudiantes();         
     }
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Consultar") || e.getActionCommand().equals("ConsultaRapida"))
        {
            buscar();
        }
       
        if(e.getActionCommand().equals("Agregar"))
        {
            if(this.fuente.devolverEleccion()==1)
            {
            metodos.agregarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mostrarInformacion();     
            metodos.mensaje("El estudiante ha sido agregado exitosamente");
            mantenimientoEstudiantes.posicionInicial();
            }
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            if(this.fuente.devolverEleccion()==1)
            {
           metodos.modificarEstudiante(mantenimientoEstudiantes.devolverInformacion());
           metodos.mensaje("Los datos han sido modificados exitosamente");
           mantenimientoEstudiantes.desabilirAgregar();
           mantenimientoEstudiantes.posicionInicial();
            }
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            if(this.fuente.devolverEleccion()==1)
            {
            metodos.eliminarEstudiante(mantenimientoEstudiantes.devolverInformacion());
            metodos.mensaje("El estudiante ha sido eliminado exitosamente");
            mantenimientoEstudiantes.desabilirAgregar();
            mantenimientoEstudiantes.posicionInicial();
            }
        }
    
    }
    
    public void guardarArchivos()
    {
        archivo.crearArchivoEstudiantes();
        for(int contador=0; contador<metodos.getTamano();contador++)
        {
            
        archivo.ingresarInformacionEstudiantes(metodos.get(contador));
          
        }
        
    }
    public void buscar()
    {
            if(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()))
            {
                mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
                mantenimientoEstudiantes.habilirModificar();
                mantenimientoEstudiantes.habilirEliminar();
            }
            else
            {
                metodos.mensaje("El estudiante consultado no se encontró");
                mantenimientoEstudiantes.habilirAgregar();
            }
    }
    
   
    
}
