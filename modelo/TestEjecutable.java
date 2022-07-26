package modelo;
import modelo.Cilindro;
import modelo.Cubo;
import modelo.Esfera;
import modelo.Cono;
public class TestEjecutable
{
    //Metodo ejecutable
    public static void main(String[] args) 
    {
        Cilindro ci = new Cilindro(3,5);
        Cono co = new Cono(8,18);
        Esfera e = new Esfera(5);
        Cubo cu = new Cubo(3);

        System.out.println(ci);
        System.out.println(co);
        System.out.println(e);
        System.out.println(cu);
        System.exit(0);
    }
}