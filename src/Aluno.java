
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
public class Aluno implements Secretaria {
   private final String nome [] = new String [5];
   private final int matricula[] = new int [5];
   private final double nota1 [] = new double [5];
   private final double nota2 [] = new double [5];
   private final double nota3 [] = new double [5];
   private final double media [] = new double [5];
   private final String chamada[] = new String[5];

   @Override
    public void getCadastrarAluno() {
        for(int k = 0;k<5; k++){
            System.out.println("Digite o nome do Aluno: ");
            nome[k]= new Scanner(System.in).nextLine();
            System.out.println("Digite a matricula do Aluno: ");
            matricula[k]= new Scanner(System.in).nextInt();
            
           
       }// for 
        
    }//getCadAluno

  private void listarTurma() {
        System.out.println("Digite a disciplina da turma: ");
        Turma.disciplina = new Scanner(System.in).toString();
        for(int k = 0; k< 5;k++){
            System.out.println("["+k+"] Aluno: "+nome[k]+ " Matricula: "+matricula[k]);  
        }//for 
        System.out.println("Disciplina: "+Turma.disciplina);
    }//

    @Override
    public void getAvaliacao() {
      listarTurma();
      
     for(int resp = 0;resp <5 ;resp ++){
      
        System.out.println("Digite o indice do aluno: ");
        resp = new Scanner(System.in).nextInt();
        System.out.println(" Digite a primeira nota do aluno " +nome[resp]);
        nota1[resp] = new Scanner(System.in).nextDouble();
        System.out.println(" Digite a segunda nota do aluno " +nome[resp]);
        nota2[resp] = new Scanner(System.in).nextDouble();
        System.out.println(" Digite a terceira nota do aluno " +nome[resp]);
        nota3[resp] = new Scanner(System.in).nextDouble();
         
        
      } //while 
      
    }//avaliacao 
    
   @Override
    public void getCalcularMedia(){
        for(int k = 0; k < 5;k++){
       double soma = nota1[k]+nota2[k]+nota3[k]; 
       double resultado = soma /3;
       media[k]= resultado;
        }//for 
    }//calMedia
    public void apresentarMedia(){
        String status ;
        for(int k =0; k < 5 ; k++){
        if(media[k] >7){
            status = " APROVADO ";
        }else{
            status = " REPROVADO ";
        }
         System.out.println("O aluno " +nome[k]+ " Ficou com média: " +media[k]+ " -- Situação: "+status);
      }//for
    }//apresentar 
    
   @Override
  public void getChamada() {
         int professor;
        System.out.println(" CHAMADA "); 
        System.out.println(" Digite 1 para PRESENTE | Digite 2 para AUSENTE ");
        for(int k = 0;k<5;k++){
        System.out.println(" O aluno: " +nome[k]+ " Está PRESENTE: ");
        professor = new Scanner(System.in).nextInt();
        
        if (professor == 1){
            chamada[k] = " PRESENTE ";
        }else if(professor == 2){
            chamada[k] = " AUSENTE ";
        }else{
            System.out.println(" OPÇÃO INVÁLIDA !!! ");
        }
        }//for
    }//chamada
    
    
}//
