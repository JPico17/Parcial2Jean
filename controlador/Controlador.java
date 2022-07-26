package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.VentanaPrincipal;
import modelo.Cilindro;
import modelo.Cubo;
import modelo.Cono;
import modelo.Esfera;
import modelo.FiguraGeometrica;
import vista.PanelEntradaDatos;

public class Controlador implements ActionListener
{
    
        //------------
        // Atributos
        //------------
    
        private VentanaPrincipal vista;
        private FiguraGeometrica modelo;
        private Cilindro modelo2;
        private Cono modelo3;
        private Cubo modelo4;
        private Esfera modelo5;
        
    
        //------------
        // Metodos
        //------------
    
        //metodo constructor
        public Controlador(VentanaPrincipal pVista, FiguraGeometrica pModelo, Cilindro pModelo2, Cono pModelo3, Cubo pModelo4, Esfera pModelo5)
        {
            this.vista = pVista;
            this.modelo= pModelo;
            this.modelo2= pModelo2;
            this.modelo3= pModelo3;
            this.modelo4= pModelo4;
            this.modelo5= pModelo5;
            this.vista.miPanelOperaciones.agregarOyentesBotones(this);      
        }
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
        String comando = ae.getActionCommand();
        
        if(comando.equals("M. Datos"))
        {   
            //Validar datos entrada
            try
            {
                
                String nombre = vista.miPanelEntradaDatos.getNombre();
                //Double area = vista.miPanelEntradaDatos.getArea();
                
            
                //Creación del objeto tipo Carro
                modelo = new Cubo(6);
                
                vista.miPanelResultados.toString();
                
                //Activar botones
                vista.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("Salir"))
            {
                System.exit(0);
            }
            
    }
}