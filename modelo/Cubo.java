package modelo;

public class Cubo extends FiguraGeometrica
{
    //Atributis
    private double area;

    

    //metodos construc
    public Cubo(double a)
    {
        super("Cubo");
        area=a;
    }


    //Metodo de acceso 
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    //Metodo abstracto sobreescrito

    @Override
    public double calcularVolumen() 
    {
        return Math.pow(area, 3);
    }
    
}
