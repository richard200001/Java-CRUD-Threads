/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import Controlador.*;
import controlador.ButtonWindowPrincipalController;

import modelo.DeveloperCompanyCRUD;
import vista.*;
/**
 *
 * @author Dell
 */
public class Main {
    public static void main(String[] args) {
        Vista1 ob=new Vista1();
        ob.setVisible(true);
        DeveloperCompanyCRUD mo=new DeveloperCompanyCRUD();
        ButtonWindowPrincipalController c=new ButtonWindowPrincipalController(ob,mo);
       
        
    }
    
}
