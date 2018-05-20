

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
public class Instituicao {
     public static void main(String[] args) {
         Aluno aluno = new Aluno();
         Aula aula = new Aula();
         
          String menu = "";
	      menu += "Menu";
	      menu += "\n1- Cadastrar Aluno: ";
	      menu += "\n2- Realizar Chamada: ";
              menu += "\n3- Cadastrar Aula: ";
              menu += "\n4- Cadastrar Avaliação: ";
              menu += "\n5- Apresentar Média: ";
              menu += "\n6- Apresentar Diário de Aula: ";
              menu += "\n0- Encerrar";
		
		while(true){
			switch(opcao(menu)){
			case '1': aluno.getCadastrarAluno();
                        break;
			case '2': aluno.getChamada();
                        break;
                        case '3': Aula.cadastrarAula();
                        break;
                        case '4': aluno.getAvaliacao();
                        break;
                        case '5': aluno.apresentarMedia();
                        break;
                        case '6' :Aula.apresentarDiario();
			case '0': System.exit(0);//finaliza o programa
			}//switch 1
		}//while 1
     }//main

    private static int opcao(String menu) {
        System.out.println(menu);
	return new Scanner(System.in).next().charAt(0);
    }//opcao 
}//
