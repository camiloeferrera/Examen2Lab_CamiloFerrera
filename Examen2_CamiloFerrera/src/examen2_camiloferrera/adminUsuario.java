package examen2_camiloferrera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminUsuario {

    private ArrayList<Usuario> usuarios = new ArrayList();
    private File archivo = null;

    public adminUsuario(String path) {
        archivo = new File(path);
    }


    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    
    public void cargarArchivo(){
        try{
            usuarios = new ArrayList();
            Usuario temp;
            if(archivo.exists()){
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try{
                    while ((temp = (Usuario)objeto.readObject())!=null) {
                        usuarios.add(temp);
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
           for (Usuario t : usuarios) {
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
