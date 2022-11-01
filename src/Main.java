
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[]args) throws IOException{
        
        int size = 100;
        String user;
        String passw;
        String username [] = new String [size];
        username[0]="tiherrod";
        username[1]="pacololo";
        String password [] = new String [size];
        password[0]="ale0203";
        password[1]="123456";
        int option;
        int i=0;
        i++;
        
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema del tajo CEJOFATI");
        
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n0- Salir"
                    +"\n1- Registrar un usuario"
                    +"\n2- Iniciar sesión"));
            
            
            switch (option) {
                case 1:
                    user = JOptionPane.showInputDialog(null, "Digite el nombre de usuario nuevo");
                    for (int i = 0; i < username[size]; i++) {
                        if (user!=(username[i])){
                            JOptionPane.showMessageDialog(null, "Registro exitoso");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Usuario ya existente");
                        }
                    }
                    break;
                 
                case 2:
                    user = JOptionPane.showInputDialog(null, "Digite su nombre de usuario");
                    passw = JOptionPane.showInputDialog(null, "Digite su contraseña");
                    for (i = 0; i < size; i++) {
                        if (user.equals(username[i]) && passw.equals(password[i])){ 
                        JOptionPane.showMessageDialog(null, "Usuario correcto, ingreso al sistema exitoso");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrectas");
                        }
                        break;
                        
                        
                        
                        
                        
                        
                    }
                break;  
            }
        }while(option != 0);
     }
}
