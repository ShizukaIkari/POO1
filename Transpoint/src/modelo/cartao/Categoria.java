/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.cartao;

import java.util.ArrayList;

/**
 *
 */
public class Categoria {         
    public boolean limiteDiario ;        //Se possui ou não
    public int qtdDiaria;  // Se possui, qual a quantidade
    public String tipo; //Vale transporte, Passe Facil, idoso... etc
    private boolean gratuita;
    private double desconto = 1;  // ValorPassagem * 1 == ValorPassagem;
    
    public Categoria(String descricao){
        //Verifica se a descriçao condiz com alguma das categorias gratuitas
        if((descricao.equalsIgnoreCase("Idoso")) || (descricao.equalsIgnoreCase("PasseLivre")) || (descricao.equalsIgnoreCase("Servico"))){
            this.setGratuita(true);      
            this.setLimiteDiario(false);
            this.desconto = 0;
        }
        else{
            this.setGratuita(false);     //Se a classe não é grauita, ela é paga
        }
        // Categorias pagas que possuem limite diário:
        if((descricao.equalsIgnoreCase("Estudante")) || descricao.equalsIgnoreCase("ValeTransporte")){
            this.setLimiteDiario(true);
            this.setQtdDiaria(6);
            if(descricao.equalsIgnoreCase("Estudante")){  //O estudante possui desconto de 50% 
                this.desconto = 0.5;
            }
        }
        this.setTipo(descricao); 
    }

    public boolean isLimiteDiario() {
        return limiteDiario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setLimiteDiario(boolean limiteDiario) {
        this.limiteDiario = limiteDiario;
    }
    public void setQtdDiaria(int l){
        if (this.limiteDiario) this.qtdDiaria = l;
    }
    
    public int getQtdDiaria() {
        return qtdDiaria;
    }
        
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo; 
    }
    
    public boolean getLimiteDiario(){
        return limiteDiario;
    }
    
     public boolean isGratuita() {
        return gratuita;
    }

    public void setGratuita(boolean gratuito) {
        this.gratuita = gratuito;
    }
 
}