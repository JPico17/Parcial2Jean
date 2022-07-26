package modelo;

public abstract class FiguraGeometrica 
{
    //Metodo 
    protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularVolumen();

    public FiguraGeometrica(String n)
    {
        nombre=n;
    }

    public String toString()
    {
            return "Volumen "+ nombre + " = " + calcularVolumen();   
    }
    
}