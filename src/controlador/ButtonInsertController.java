
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;
public class ButtonInsertController implements ActionListener {
    public     Insertar in;
    public ButtonInsertController(Insertar in){
        this.in = in;
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
      if(e.getSource()==in.bInsertar){
            
            if(verificacionError1(in.tfId.getText())){
                String no= in.tfName.getText();
                int id= Integer.parseInt(in.tfId.getText());
                String co=in.tfCountry.getText();
                String da=in.tfDate.getText();
                DeveloperCompany un= new DeveloperCompany(id,no,co,da);
                DeveloperCompanyCRUD a=new DeveloperCompanyCRUD();
                a.ingresarRegistro(un);
                JOptionPane.showMessageDialog(null, "Inserción de datos Exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "Error, verifique los datos ingresados");
            }
            
        }
    }
    public boolean verificacionError1(String cadena){
        int num;
        try{
            num=Integer.parseInt(cadena);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}

