
package com.mycompany.poo_heranca;

//herança para diferença
//aluno é uma especialização de pessoa
//pessoa é uma generalização de aluno
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno: " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
