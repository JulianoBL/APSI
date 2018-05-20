
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juliano Brasil Lopes
 */

   public class Aula extends Turma {
   private static String dataAula;
   private static String relatorioAula;

   

   /**
     *
     * @return
     */
    public String getDataAula(){
        return dataAula;
    }//get data

    public void setDataAula(String dataAula) {
        Aula.dataAula = dataAula;
    }//set data 

    public String getRelatorioAula() {
        return relatorioAula;
    }//get relatorio 

    public void setRelatorioAula(String relatorioAula) {
        Aula.relatorioAula = relatorioAula;
    }//get relatorio 
   
   // metodos personalizados 
    
     static void cadastrarAula() {
        
    System.out.println(" Digite a data da aula: ");
    dataAula = new Scanner(System.in).nextLine();
    System.out.println(" Digite o relatório da aula : ");
    relatorioAula = new Scanner(System.in).nextLine();
    
     }//cadAula
     
      static void apresentarDiario() {
          System.out.println(" Data Aula: "+dataAula);
          System.out.println(" RELATÓRIO AULA: ");
          System.out.println(relatorioAula);
    }//apresentar 
}//aula

