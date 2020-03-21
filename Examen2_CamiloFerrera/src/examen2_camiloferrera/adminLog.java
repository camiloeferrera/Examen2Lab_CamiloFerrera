package examen2_camiloferrera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminLog {
    private ArrayList<String> log = new ArrayList();
    private File archivo = null;

    public adminLog(String path) {
        archivo = new File(path);
    }

    public ArrayList<String> getLog() {
        return log;
    }
    public File getArchivo() {
        return archivo;
    }

    public void setLog(ArrayList<String> log) {
        this.log = log;
    }
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    
    public void cargarArchivo(){
        try{
            log = new ArrayList();
            String temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (String)objeto.readObject())!=null) {
                        log.add(temp);
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
           for (String t : log) {
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
