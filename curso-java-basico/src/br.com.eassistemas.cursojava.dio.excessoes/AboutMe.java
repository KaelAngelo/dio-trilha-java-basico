import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe{

public static void main(String[] args) {
    
    try{  

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String nome = scan.next();


    System.out.println("Digite seu Sobrenome: ");
    String sobreNome = scan.next();

    System.out.println("Digite sua idade: ");
    int idade = scan.nextInt();

    System.out.println("Digite sua Altura: ");
    double altura = scan.nextDouble();

    System.out.println("===========================");
    System.out.println("          RESULTADO        ");
    System.out.println("===========================");

    System.out.println("Olá, meu nome é "+nome+" "+sobreNome);
    System.out.println("Tenho "+idade+" anos de idade e "+altura+" de altura.");

    }catch (InputMismatchException e) {
           e.printStackTrace();
           System.out.println("Você colocou uma virgula ao invés de ponto na altura.");

    }


}


}