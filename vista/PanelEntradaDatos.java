package vista;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lw;
    private JLabel lw2;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JComboBox cbFigura;
    private String[] figura = {"Cubo","Cilindro","Cono","Esfera"};
    private JLabel lImagen;
    private ImageIcon iImagen;
    

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {
        //crear y agregar imagen
        iImagen = new ImageIcon(("Figura.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(50,27,238,212);
        this.add(lImagen);

        lw = new JLabel("Figuras=");
        lw.setBounds(290, 20, 200, 20);

        cbFigura = new JComboBox();
        for(int i=0; i<figura.length;i++)
        {
            cbFigura.addItem(figura[i]);
        }
        cbFigura.setBounds(480,20,100,20);
        this.add(cbFigura);

        // crear y agregar etiqueta x
        lx = new JLabel("Radio =");
        lx.setBounds(290, 50, 200, 20);
        this.add(lx);

        //crear caja de texto x
        tfx = new JTextField("Cilindro, Cono ,Esfera");
        tfx.setBounds(480,50,150,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel(" Altura =");
        ly.setBounds(290, 90, 200, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField("Cilindro, Cono");
        tfy.setBounds(480,90,150,20);
        this.add(tfy);

        // crear y agregar etiqueta y
        lz = new JLabel(" Area =");
        lz.setBounds(290, 140, 300, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField("Cubo");
        tfz.setBounds(480,140,150,20);
        this.add(tfz);

        // crear y agregar etiqueta x
        
        this.add(lx);
        this.add(ly);
        this.add(lz);
        this.add(lw);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getRadio()
    {
        return tfx.getText();
    }

    public String getAltura()
    {
        return tfy.getText();
    }

    //public Double getArea()
    //{
        //return tfz.getText();
    //}

    public String getNombre()
    {
        return (String) cbFigura.getSelectedItem();
    }

    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
    }
    

}
