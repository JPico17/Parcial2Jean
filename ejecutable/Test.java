package ejecutable;

import controlador.Controlador;
import modelo.Cilindro;
import modelo.Cubo;
import modelo.Cono;
import modelo.Esfera;
import modelo.FiguraGeometrica;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        FiguraGeometrica miFiguraGeometrica = null;
        Cilindro miCilindro = null;
        Cubo miCubo = null;
        Esfera miEsfera = null;
        Cono miCono = null;
        Controlador miControlador = new Controlador(miVentana, miFiguraGeometrica, miCilindro, miCono, miCubo, miEsfera);
        
    }
    
}
