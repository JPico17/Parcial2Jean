package modelo;

public class Cono extends FiguraGeometrica
{
    //Atributis
    private double radio;
    private double altura;

    //metodos construc
    public Cono(double r, double h)
    {
        super("Cono");
        radio=r;
        altura=h;
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
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo abstracto sobreescrito

    @Override
    public double calcularVolumen() 
    {
        return (Math.PI*Math.pow(radio, 2) * altura)/3 ;
    }
    
}
