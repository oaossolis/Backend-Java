public class TipoVariable{
    public static void main (String[] args){
        System.out.println("Hola Mundo!!!");

        int edad= 28; //int es variable para numeros enteros solamente
        System.out.println(edad);

        edad= 26;
        System.out.println("Mi edad es " + edad +" años");
        
        double salario =1250.50; //double es una variable que acepta decimales
        System.out.println(salario);

        double SalarioMitad = salario/2;
        System.out.println(SalarioMitad);
        
        double variable1 = 230.89;
        int variable1Entero = (int) variable1; //Cast, obligamos que el double se lea como int
        System.out.println(variable1Entero);

        long prueba = 1222222222222222222L;//Se debe colocar "L" al final del numero para especificar que se trata de variable long
        System.out.println(prueba);

        short numeroPequeno = 13555;
        System.out.println(numeroPequeno);

        byte numeroAunMasPequeno= 123;
        System.out.println(numeroAunMasPequeno);

        float numeroDecimalPequeno = 2.5F;//Float acepta decimales pero a menor cantidad de bits y se coloca "F" al final del numero
        System.out.println(numeroDecimalPequeno);
        
    }
}