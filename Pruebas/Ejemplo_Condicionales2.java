/**
 * Ejemplo_Condicionales2
 */
public class Ejemplo_Condicionales2 {

    public static void main(String[] args) {
        int edad =18;
        int cantidadPersonas =2;

        boolean esPareja  = cantidadPersonas>1 ; //solo recibe true o false

        if(edad >= 18 && esPareja){ //se representa la accion OR por medio de ||
            // && representa una accion AND
            System.out.println("Puede entrar");
        }
        else{
            System.out.println("No puedes pasar");
        }
    }
}