
package taller.dos;

import javax.swing.JOptionPane;



public class persona {
    private int id;
    private String nombre;
    private String apellido;

    public persona() {
        id = 0;
        nombre = "";
        apellido = "";
        
    }
    public void obtenerDatos(){
        boolean error = false;
        do{
           try{
            id = Integer.parseInt(JOptionPane.showInputDialog("id"));
            error = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        nombre = JOptionPane.showInputDialog("nombre");
        apellido = JOptionPane.showInputDialog("apellido");
        
    }
    public int mostrarId(){
        return id; 
    }
    
    public String mostrarDatos(){
        return "ID = " + id + " NOMBRE = " + nombre + " APELLIDO = " + apellido;
    }
}