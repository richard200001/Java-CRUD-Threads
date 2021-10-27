
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;
public class ButtonWindowPrincipalController implements ActionListener {
    Vista1 vista;
    modelo.DeveloperCompanyCRUD modelo;

    public ButtonWindowPrincipalController(Vista1 vista,modelo.DeveloperCompanyCRUD modelo){
        this.vista = vista;
        this.modelo=modelo;
        vista.boton.addActionListener(this);
        vista.botonbor.addActionListener(this);
        vista.botoncon.addActionListener(this);
        vista.botoninsert.addActionListener(this);
        vista.botonborrar.addActionListener(this);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
     ;
        if(e.getSource()==vista.botoncon){
              
           DeveloperCompanyCRUD u=new DeveloperCompanyCRUD();
          vista.modelo.setRowCount(0);
           for(DeveloperCompany h:u.mostrarRegistros()){
               vista.modelo.addRow(h.toArray());
           }
      
        }
        if(e.getSource()==vista.boton){
            
            int row= vista.tabla1.getSelectedRow();
            try{
                Actualizar act=new Actualizar();
                vista.tabla1.getValueAt(row, 0);
                String name=(String) vista.tabla1.getValueAt(row, 1);
                String country=(String) vista.tabla1.getValueAt(row, 2);
                String date=(String) vista.tabla1.getValueAt(row, 3);
                act.tfNombre.setText(name);
                act.tfCountry.setText(country);
                act.tfdate.setText(date);
                act.id= (int) vista.tabla1.getValueAt(row, 0);
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error, tiene que seleccionar una casilla");
                
            }
        }
       
        
        if(e.getSource()==vista.botoninsert){
           Insertar ins=new Insertar();
        }
        if(e.getSource()==vista.botonbor){
            //este método borra la tabla por completo
           vista.modelo.setRowCount(0);
        }
        if(e.getSource()==vista.botonborrar){
            System.out.println("hola");
         int row= vista.tabla1.getSelectedRow();
            try{
                DeveloperCompanyCRUD d=new DeveloperCompanyCRUD();
                int vi=(int) vista.tabla1.getValueAt(row, 0);
                d.borrarRegistro(vi);
                JOptionPane.showMessageDialog(null, "Borrado Exitoso");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error, tiene que seleccionar una casilla");
                
            }
        }
    }
    
}
