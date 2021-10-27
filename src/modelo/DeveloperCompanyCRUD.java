/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import vista.Vista1;

public class DeveloperCompanyCRUD extends ConexionDB{
    Connection coneBD;
    Vista1 vista;
    public DeveloperCompanyCRUD(){
        coneBD = ConexionDB.obtenerConexion();
    }
    public DeveloperCompanyCRUD(Vista1 vista){
        this.vista=vista;
    }    
    public String ingresarRegistro(DeveloperCompany Developer){
        String salida="";
        String sql ="INSERT INTO DeveloperCompany VALUES(?,?,?,?)";
        try{
                PreparedStatement sentencia = coneBD.prepareStatement(sql);
                sentencia.setInt(1, (int) Developer.getIdCompany());
                sentencia.setString(2,Developer.getName());
                sentencia.setString(3,Developer.getCountry());
                sentencia.setString(4,Developer.getDateCreaction());
                int rowsInserted = sentencia.executeUpdate();
                if ( rowsInserted > 0) {
                    salida="Se ingresó la compañía desarrolladora: "+Developer.getName()+" con exito";
                }
        }catch(SQLException ex){
            salida= "No se puedo ingresar la compañía desarrolladora: "+Developer.getName()+ "ex.getMessage()";
        }
        return salida;
    }
    
    public List<DeveloperCompany> mostrarRegistros(){
        List<DeveloperCompany> lista = new ArrayList<>();
        String sql = "SELECT * FROM DeveloperCompany";
        try{
            Statement sentencia = coneBD.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                int id = resultado.getInt(1);
                String nombre = resultado.getString(2);
                String pais= resultado.getString(3);
                String fecha=resultado.getString(4);
                lista.add(new DeveloperCompany(id,nombre,pais,fecha));
            }
        }catch(SQLException ex)
        {
            System.out.println("No se pudo traer datos: ");
        }
        return lista;
    }
    
    
    
    public String actualizarRegistro(DeveloperCompany Developer){
        String salida="";
        String sql ="UPDATE DeveloperCompany SET name=?, country=?, dateCreaction=? WHERE idCompany=?";
        try{
                PreparedStatement sentencia = coneBD.prepareStatement(sql);
                
                sentencia.setString(1,Developer.getName());
                sentencia.setString(2,Developer.getCountry());
                sentencia.setString(3,Developer.getDateCreaction());
                sentencia.setInt(4, (int) Developer.getIdCompany());
                
                int rowsInserted = sentencia.executeUpdate();
                if ( rowsInserted > 0) {
                    salida="Actualización exitosa!";
                }
        }catch(SQLException ex){
            salida="No se puedo actualizar: "+ ex.getMessage();
        }
        return salida;
    }
    
    public String borrarRegistro(int id){
        String salida ="";
        String sql ="DELETE FROM DeveloperCompany WHERE idCompany=?";
        try{
                PreparedStatement sentencia = coneBD.prepareStatement(sql);
                sentencia.setInt(1,id);
                int rowsInserted = sentencia.executeUpdate();
                if ( rowsInserted > 0) {
                    salida ="Borrado exitoso!";
                }
        }catch(SQLException ex){
            salida="No se pudo borrar: "+ ex.getMessage();
        }
        return salida;
    }

  }




