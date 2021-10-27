/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Hilo1 extends Thread {
    JLabel label,label1,label2;
    public int con;
    public int con1;
    public int con2;
    public Hilo1(){
        con=0;
        con1=0;
        con2=0;
    }
    @Override
    public void run(){
        while(con<270){
            try{
        
        label.setBounds(0,0,con,700);
        label1.setBounds(0,98,con1,270);
        label2.setBounds(40, 380, con2, 80);
        con++;
        con1++; 
        con2++;
            sleep(1);
        }catch(InterruptedException e){
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE,null, e);
        }
        }
        
    }
    public void recibeLabel1(JLabel label, JLabel label1,JLabel label2){
        this.label=label;
        this.label1=label1;
        this.label2=label2;
    }
}
