public class TestReference {
  public static void main(String[] args) {
    Cuenta primeraCuenta =  new Cuenta();
    primeraCuenta.saldo = 200;

    Cuenta segundaCuenta = primeraCuenta;
    segundaCuenta.saldo=100;

    System.out.println("Saldo primera cuenta: " + primeraCuenta.saldo);
    System.out.println("Saldo segunda cuenta: " + segundaCuenta.saldo);

}  
}
