/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_camiloferrera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class adminATM {
    private ArrayList<ATM> atms = new ArrayList();
    private File archivo = null;

    public adminATM(String path) {
        archivo = new File(path);
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    
    
    public void cargarArchivo(){
        try{
            atms = new ArrayList();
            ATM temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (ATM)objeto.readObject())!=null) {
                        atms.add(temp);
                    }
                }catch (EOFException ex) {
                    
                }
                objeto.close();
                entrada.close();
            }
        }catch (Exception ex) {
             ex.printStackTrace();
        }
    }
   public void escribirArchivo(){
       FileOutputStream fw = null;
       ObjectOutputStream bw = null;
       try{
           fw = new FileOutputStream(archivo);
           bw = new ObjectOutputStream(fw);
           for (ATM t : atms) {
               bw.writeObject(t);
            }
           bw.flush();
       }catch (Exception ex) {
           
       }finally{
           try {
               bw.close();
               fw.close();
           }catch (Exception ex) {
               
           }
       }
   }
}
