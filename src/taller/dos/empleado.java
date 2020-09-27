
package taller.dos;

import javax.swing.JOptionPane;

/**
 *
 * @author PRUEVA
 */
public  class empleado  extends persona {
    
    
    private int salario;

    public empleado() {
        salario=0;
    }
    public void establecerSalario(){
         boolean error = false;
        do{
           try{
            salario = Integer.parseInt(JOptionPane.showInputDialog("salario"));
            error = true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        
    }


    @Override
    public String toString() {
        return "empleado{" + "salario=" + salario + " " + super.mostrarDatos() +  '}';
    }
    
}
