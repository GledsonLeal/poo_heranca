/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_heranca;

/**
 *
 * @author gledson
 */
public class Poo_heranca {

public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();// não podemos instanciar uma classe abstrata.
        Visitante v1 = new Visitante();
        
        v1.setNome("Gledson");
        v1.setIdade(37);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Gledson Leal");
        a1.setMatricula(1111);
        a1.setCurso("TADS");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(v1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Bolsista Gledson");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(v1.toString());
        
    }
}
