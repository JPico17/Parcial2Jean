package modelo;

public class Esfera extends FiguraGeometrica
{
    //Atributis
    private double radio;

    //metodos construc
    public Esfera(double r)
    {
        super("Esfera");
        radio=r;
    }

    //Metodo de acceso 
    public void setRadio(double r)
    {
        this.radio=r;
    }
    public double getRadio()
    {
        return radio;
    }

    //Metodo abstracto sobreescrito

    @Override
    public double calcularVolumen() 
    {
        return (Math.PI*Math.pow(radio, 3))*4/3 ;
    }
    
}
