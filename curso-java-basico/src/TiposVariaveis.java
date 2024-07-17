import javax.swing.JOptionPane;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        //casting na variavel int para short
        short numeroCurto2 = (short) numeroNormal;

        //Declaração sem a palavra reserva final, aceita mudar o valor
        int numero = 1;

        numero = 2;

        //Variáveis e constantes

        System.out.println("Aceitou mudar o valor: "+numero);

        //Constantes deverão ser escrita em CAIXA ALTA
        final int DIA_MES = 30;

        DIA_MES = 30;

       




      

        

      
    }
}
