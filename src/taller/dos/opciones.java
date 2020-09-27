
package taller.dos;


import javax.swing.JOptionPane;

public class opciones {
    ProcesoEmpleado escoger = new ProcesoEmpleado();
    public void selecccionar(){
        boolean error = false;
        int numero;
        do{
           try{
            do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("1: agregar \n 2: actualizar \n 3: borrar \n 4: mostrar \n  5: salir"));
            switch(numero){
                case 1:
                    escoger.agregarEmpleado();
                    
                    break;
                case 2:
                    escoger.actualizar();
                    break;
                case 3:
                    escoger.borrar();
                    break;
                case 4:
                    escoger.mostrarLista();
                break;
            }
        }while(numero!=5);
            break;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "escoja numeros no letras");
        } 
        }while(!error);
        
        
       
    }
}

