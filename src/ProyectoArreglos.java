// Se importan las librerías necesarias para el programa
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ProyectoArreglos {

    
    public static void main(String[] args) {
        ArrayList<String> Nombres = new ArrayList<String>();//Se crea el arreglo Nombres
    String cantNombres, frase;
    int cnom;
    Scanner sc = new Scanner(System.in);
    
    //Cantidad de nombres que se ocuparan para registrar
    cantNombres = JOptionPane.showInputDialog(null, "Ingresa la cantidad de nombres a escribir: ");
    cnom = Integer.parseInt(cantNombres); //Se transforma de String a Int para usarlo en los ciclos FOR
    
    Nombres.add(cantNombres); //Se limita la cantidad de arreglos por el usuario y se asigna al mismo
    
    //Se crea un ciclo for para ingresar los nombres
    for(int i=0; i<cnom; i++){
        frase = JOptionPane.showInputDialog(null,"Ingresa el nombre: ");
        Nombres.add(frase);
    }
    //Muestra los nombres que se guardaron en el arreglo
    System.out.println("Nombres guardados");
    for(int i = 0; i<Nombres.size();i++){
        System.out.println(Nombres.get(i));
    }  
    }
    
}
