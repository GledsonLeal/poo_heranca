
package com.mycompany.poo_heranca;


public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno: " + this.getNome());
    }
    
    //método de sobreposição
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


    
}
