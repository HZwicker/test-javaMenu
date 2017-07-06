package de;

import de.contadorAlunos.Aluno;
import de.contadorAlunos.Instituicao;
import java.util.Scanner;


public class ExecutarPrograma {

    Aluno alunos = new Aluno();

    public static void main(String[] args) {

        int MenuAtual = 0;
        Instituicao contadorAlunos = new Instituicao();


        do {

            System.out.println("*===================================================*");
			System.out.println("|                      MENU                         |");
			System.out.println("*===================================================*");
			System.out.println("|                                                   |");
			System.out.println("|[1] Registrar as notas de um novo aluno.           |");
			System.out.println("|[2] Consultar boletim de um aluno.                 |");
			System.out.println("|[3] Consultar notas da turma. 			    |");
			System.out.println("|[4] Sair. 			                    |");
			System.out.println("|                                                   |");
			System.out.println("*===================================================*");
            
                
            System.out.print("Escolha um numero do MENU: ");
            Scanner menu = new Scanner(System.in);

          

                MenuAtual = menu.nextInt();

                switch (MenuAtual) {

                    case 1:
                        contadorAlunos.registrarNota();
                        break;
                    case 2:
                        contadorAlunos.consultarBoletim();
                        break;
                    case 3:
                        contadorAlunos.consultarNotasDaTurma();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
			

        } while (MenuAtual != 4);
    }
}
