package de.contadorAlunos;
import java.util.Scanner;


public class Instituicao {

    private Aluno alunos = new Aluno();
	
	private static String situacaoAluno(float media) {

            if (media < 4f) {

                return "Reprovado";
            } else if (media >= 4f && media < 7f) {

                return "Prova final";
            } else if (media >= 7f && media <= 10f) {

                return "Aprovado";
            } else {

                return "Não é possível calcular a média , insira números de 0 até 10.";
            }   
    }

    private static float calcularMediaFinal(float av1, float av2) {
        return (av1 + av2) / 2f;
    }

    public void registrarNota() {

        System.out.println("");
        System.out.println("*==========================================*");
        System.out.println("|      REGISTRAR NOTAS DO NOVO ALUNO       |");
        System.out.println("*==========================================*\n");

        

            System.out.print("Registre o nome do aluno: ");
            Scanner colocarNome = new Scanner(System.in);

            String nome = colocarNome.nextLine();

            System.out.print("Sua primeira nota: ");
            Scanner colocarAv1 = new Scanner(System.in);

            float av1 = colocarAv1.nextFloat();

            System.out.print("Sua segunda nota: ");
            Scanner colocarAv2 = new Scanner(System.in);

            float av2 = colocarAv2.nextFloat();

            if (!nome.isEmpty() && av1 <= 10 || av1 < 0 && av2 <= 10 || av2 < 0) {

                alunos.adicionarAluno(nome, av1, av2);

                Aluno.contador++;
				
                
                System.out.println("\nAluno cadastrado com sucesso.\n");
				
            } else {

                System.out
                        .println("\nO aluno não foi cadastrado. Coloque as medias das notas de 0 a 10 ");
            }
        
        
    }

    public void consultarBoletim() {

        System.out.println("");
        System.out.println("*===========================================*");
        System.out.println("|       CONSULTAR BOLETIM DO ALUNO          |");
        System.out.println("*===========================================*\n");

        
			System.out.print("Digite o nome do aluno para pesquisar: ");
            Scanner colocarNome = new Scanner(System.in);

            String nome = colocarNome.nextLine();

            if (!nome.isEmpty()) {

                float notaAv1 = 0, notaAv2 = 0;

                for (int i = 0; i < alunos.getNomes().length; i++) {

                    if (nome.equals(alunos.getNomes()[i])) {


                        notaAv1 = alunos.getAv1()[i];
                        notaAv2 = alunos.getAv2()[i];
                        
						float resultado = calcularMediaFinal(notaAv1, notaAv2);
                        String situacao = situacaoAluno(calcularMediaFinal(notaAv1,notaAv2));
				
						System.out.println("*===========================================*");
						System.out.println(" 	Nome:" + nome + "                          ");
						System.out.println(" 	Nota do AV1: " + notaAv1 + "               ");
						System.out.println(" 	Nota do AV2: " +  notaAv2 + "              ");
						System.out.println(" 	Media final: " + resultado + "             ");
						System.out.println(" 	Situacao:  " + situacao + "                ");
						System.out.println("*===========================================*");
                        
                      
                        break;

                    }

                    
				}
            }

	
    }

    public void consultarNotasDaTurma() {
        
		System.out.println("");
        System.out.println("*=============================================*");
        System.out.println("|         CONSULTAR NOTAS DA TURMA            |");
        System.out.println("*=============================================*\n");

        if (alunos.getNomes().length > 0) {
            for (int i = 0; i < alunos.getNomes().length; i++) {

                if (alunos.getNomes()[i] == null)
                    continue;

                float resultado = calcularMediaFinal(alunos.getAv1()[i],alunos.getAv2()[i]);
                String situacao = situacaoAluno(calcularMediaFinal(alunos.getAv1()[i],alunos.getAv2()[i]));

                System.out.println("*===========================================*");
                System.out.println("	Nome:" + alunos.getNomes()[i] + "          ");
                System.out.println("	Nota do AV1: " + alunos.getAv1()[i]+ "     ");
                System.out.println("	Nota do AV2: " + alunos.getAv2()[i]+ "     ");
                System.out.println("	Media final: " + resultado + "             ");
                System.out.println("	Situacao:  " + situacao + "                ");
				System.out.println("*===========================================*");
            }
        } else {

            System.out.println("\n=========== NAO FOI CADASTRADO NENHUM ALUNO ==============\n");
        }
    }
}
