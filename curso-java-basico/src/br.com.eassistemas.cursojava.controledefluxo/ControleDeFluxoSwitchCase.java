import java.util.Scanner;

class ControleDeFluxoSwitchCase {

    public static void main(String[] args) {
        
     String sigla = "";

     Scanner scan = new Scanner(System.in);

     System.out.println("Informe um tamanho: ");
     sigla = scan.nextLine();

     switch (sigla) {
      case "P": {
        System.out.println("Pequeno");         
        break;
      }
      case "M": {
        System.out.println("Médio");         
        break;
      }
      case "G": {
        System.out.println("GrandGGe");         
        break;
      }  
      case "GG": {
        System.out.println("Extra Grande");         
        break; 
      } 
      case "XG": {
        System.out.println("Extra Baleia Grande");         
        break;
      }       
      default:
        break;
     }

     

    }
}