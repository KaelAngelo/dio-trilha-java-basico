
import java.util.Scanner;

class ControleDeFluxoIf {

    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      
      double saldo =  150.00;
      double valorSolicitado = 0.00;

      System.out.println("Informe o valor Solicitado: ");
      valorSolicitado = scan.nextDouble();



      if(valorSolicitado <= saldo){
        System.out.println("Saldo.: "+saldo);   
        saldo = saldo - valorSolicitado;
      }

      System.out.println("O Saldo atual é: "+saldo);


      

    }
}