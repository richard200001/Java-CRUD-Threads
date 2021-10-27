
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.*;
import modelo.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class ButtonUpgrdeController implements ActionListener {
    Vista1 vista;
    public     Actualizar act;
    public ButtonUpgrdeController(Actualizar act,Vista1 vis){
        this.act = act;
        this.vista=vis;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
      if(e.getSource()==act.bActualizar){
        //  if(ParseFecha(act.tfdate.getText())){
            String nom= act.tfNombre.getText();
            int id= act.id;
            String country=act.tfCountry.getText();
            String date=act.tfdate.getText();
            DeveloperCompany unCli= new DeveloperCompany(id,nom,country,date);
            DeveloperCompanyCRUD u=new DeveloperCompanyCRUD();
            u.actualizarRegistro(unCli);
            JOptionPane.showMessageDialog(null, "Actualización de datos Exitosa");
         
            
        }
    }
    /*public boolean ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate;
        try {
           // fechaDate = (Date) formato.parse(fecha);
            java.util.Date nFechas=formato.parse(fecha);
            fechaDate= new java.sql.Date(nFechas.getTime());
            return true;
        } 
        catch (ParseException ex) 
        {
           JOptionPane.showMessageDialog(null, "Error, verifique los datos actualizados");
           return false;
        }
      
    }*/

}
