package de.contadorAlunos;

public class Aluno {

    static int contador = 0;
	private String[] Mostrarnomes = new String[100];
    private float[] av1 = new float[100];
    private float[] av2 = new float[100];

    void adicionarAluno(String nome, float av1, float av2) {
        for (int i = 0; i < this.Mostrarnomes.length; i++) {

            if (this.Mostrarnomes[i] == null) {

                this.Mostrarnomes[i] = nome;
                this.av1[i] = av1;
                this.av2[i] = av2;
                break;
            }
        }
    }

    String[] getNomes() {
        return this.Mostrarnomes;
    }

    float[] getAv1() {
        return this.av1;
    }

    float[] getAv2() {
        return this.av2;
    }

}
