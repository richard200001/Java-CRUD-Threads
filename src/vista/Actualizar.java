/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import vista.*;
import modelo.*;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controlador.ButtonUpgrdeController;
import vista.Vista1;

/**
 *
 * @author Usuario
 */
public class Actualizar extends JFrame implements ActionListener {
    private JPanel pDatos, pBoton;
    public JLabel lNombre; 
    public JLabel lCountry; 
    public JLabel ldate; 
    public int id;
    public JTextField tfNombre; 
    public JTextField tfCountry; 
    public JTextField tfdate;
    public JButton bActualizar;
    
    Container ppal;
    private Vista1 vista;
  
    
    public Actualizar(){
        super("Actualizar datos");// - es igual a usar setTitle("Calculadora:  ")
        setSize(500,500); //Define el tamaño del FRAME
        setVisible(true); // Hace visible el FRAME(El objeto que contiene la interfaz)
        
        initComponente(); // Método que instancia todos los componentes de la interfaz
        ppal= getContentPane(); // Se crea el contenedor principal
        
        //1. Se define con un Layout la distribución de los Paneles dentro del contenedor principal
        ppal.setLayout(new GridLayout(2,1)); //Es como crear una tabla de 2X2
        //2. Adicionar los paneles a el panel Principal ppal (pDatos, pBotones, pResultados)    
        ppal.add(pDatos);
        ppal.add(pBoton);
        
        
        pack();
        
        //Cierra el proceso al dar clic en el boton de X del FRAME
       // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
  
    
    public void initComponente()
    {
        //Se crean los paneles que marcan la distribución de los elementos en el FRAME
        pDatos = new JPanel();
        pBoton = new JPanel();
      
        //Se crean los bordes y los titulos de los paneles
        pDatos.setBorder(BorderFactory.createTitledBorder("Actualice los datos: ")) ;
      
        
        
        //Se crean los botones a usar
        bActualizar = new JButton("Actualizar");
        ButtonUpgrdeController contro=new ButtonUpgrdeController(this , vista);
        bActualizar.addActionListener(contro);
        
         
        //Se crean los etiquetas que se mostraran al lado del cuadro de texto, para el ingreso de datos. 
       
        lNombre = new JLabel("Name : ") ;
        lCountry = new JLabel("Country:") ;       
        ldate = new JLabel("Date Creation: ") ;
        
        //Se crean los campos de textos donde el usuario ingresara los datos y 
        //se mostrarán los resultados. 
       
        tfNombre = new JTextField(10);
        tfNombre.setToolTipText("Actualice el nombre de la empresa");
        //tfNum2.setToolTipText("Si no ha seleccionado una celda de la tabla no podrá actualizar datos");
        tfCountry = new JTextField(10);
        tfCountry.setToolTipText("Actualice el nombre del país");
        tfdate = new JTextField(10);
        tfdate.setToolTipText("Actualice primero el año, luego el mes y por último el día, de lo contrario no se actualizará la fecha");
        
        //Construcción de la intefaz: 
        //1. Crear los Layout para cada Panel
        //2. Adicionar los componentes a los paneles
        
        
        //1. Crear el Layout para el Panel pDatos
        pDatos.setLayout(new GridLayout(3,2)); //Es como crear una tabla de 2X2
        //2. Adicionar los componentes a el panel pDatos (Etiquetas y campos de texto)
        
        pDatos.add(lNombre);
        pDatos.add(tfNombre);
        pDatos.add(lCountry);
        pDatos.add(tfCountry);
        pDatos.add(ldate);
        pDatos.add(tfdate);
        
        
        //1. Crear el Layout para el Panel pBotones
        pBoton.setLayout(new GridLayout(1,1)); //Es como crear una tabla de 1X4
        //2. Adicionar los componentes a el panel pBotones (Botones)
        pBoton.add(bActualizar);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
      
       
    }
}
        
        
        