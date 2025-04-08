package diadasemana;
import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[] args) {
        int dia;
        String  diaDaSemana = "Domingo";
        
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha um dia da Semana : ");
        dia = s.nextInt();
        
        if (dia >= 1 && dia <= 7) {
            switch (dia) {
            case 1 :
                diaDaSemana = "Domingo";
                break;
            case 2 :
                diaDaSemana = "Segunda";
                break;
            case 3 :
                diaDaSemana = "Terça";
                break;
            case 4 :
                diaDaSemana = "Quarta";
                break;
            case 5 :
                diaDaSemana = "Quinta";
                break;
            case 6 :
                diaDaSemana = "Sexta";
                break;    
            case 7 :
                diaDaSemana = "Sabado";
                break;  
        }
            System.out.println("O dia da semana é " + diaDaSemana);
        }else{
            System.out.println("A semana digitado deve ser um valor entre 1 e 7");
        }
        
    }
    
}
