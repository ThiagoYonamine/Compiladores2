/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Semantico {
    
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    private StringBuffer erros = new StringBuffer(); //Concatena todos as linhas de código

    public void println(String txt) {
        this.erros.append(txt).append("\n");
    }

    public void print(String txt) {
        this.erros.append(txt);
    }

    //Limpa a string para o próximo arquivo
    public void clear() {
        this.erros = new StringBuffer();
    }

    public String getTexto() {
        return this.erros.toString();
    }

    void Programa(LaParser.ProgramaContext ctx) {
        clear();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("Global"));
        if(Integer.parseInt(ctx.NUM_INT().getText()) < 1 || Integer.parseInt(ctx.NUM_INT().getText()) > 3)
                println("[ERROR] Level " + ctx.NUM_INT() + " doesn't exist\nSet a value between 1 to 3");
            else
                if(!ctx.corpo().getText().equals(""))
                    Corpo(ctx.corpo());
                else
                    println("[ERROR] Body is empty");
                pilhaDeTabelas.desempilhar();
    }
    void Corpo(LaParser.CorpoContext ctx){
        
        Comandos(ctx.comandos());
    }
    void Comandos(LaParser.ComandosContext ctx){
         Cmd(ctx.cmd());
         if(!ctx.comandos().getText().equals(""))
            Comandos(ctx.comandos());
    }
    void Cmd(LaParser.CmdContext ctx){
        if(ctx.declaracoes() != null){
            Declaracoes(ctx.declaracoes());
        }
        if(ctx.IDENT() != null){
            String id = ctx.IDENT().getText();
            int id_line = ctx.IDENT().getSymbol().getLine();
            if (ctx.getStart().getText().equals("usar")){
                if(!pilhaDeTabelas.existeSimbolo(id)){
                println("[ERROR] Line " + id_line +" : Magic " + id +" not declared");
                }
            
             }
            
            else if(!pilhaDeTabelas.existeSimbolo(id)){
                println("[ERROR] Line " + id_line +" : Function " + id +" not declared");
            }
        }
        if (ctx.getStart().getText().equals("perguntar")){
            return;
        }
        if (ctx.getStart().getText().equals("repetir")){
            return;
        }
    }
    
    void Declaracoes(LaParser.DeclaracoesContext ctx){
        if (ctx.getStart().getText().equals("magia")){
            
            String id = ctx.declaracoes_objetos().obj_magia().IDENT().getText();
            int id_line = ctx.declaracoes_objetos().obj_magia().IDENT().getSymbol().getLine();
            if(!pilhaDeTabelas.existeSimbolo(id)){
                pilhaDeTabelas.topo().adicionarSimbolo(id, "magia");
            }
            else{
                println("[ERROR] Line " + id_line +" : Magic" + id +" already declared");
            }
            
        }
        else if(ctx.getStart().getText().equals("bloco")){
            
            String id = ctx.declaracoes_objetos().obj_bloco().IDENT().getText();
            int id_line = ctx.declaracoes_objetos().obj_bloco().IDENT().getSymbol().getLine();
            if(!pilhaDeTabelas.existeSimbolo(id)){
                pilhaDeTabelas.topo().adicionarSimbolo(id, "bloco");
            }
            else{
                println("[ERROR] Line " + id_line +" : Block" + id +" already declared");
            }
        }
        else if(ctx.getStart().getText().equals("funcao")){
             
            String id = ctx.declaracoes_funcao().IDENT().getText();
            int id_line = ctx.declaracoes_funcao().IDENT().getSymbol().getLine();
            if(!pilhaDeTabelas.existeSimbolo(id)){     
                pilhaDeTabelas.topo().adicionarSimbolo(id, "funcao");
            }
            else{
                println("[ERROR] Line " + id_line +" : Function " + id +" already declared");
            }
        }
        else{
            String id = ctx.declaracoes_objetos().atribuicao().IDENT().getText();
            String at = ctx.declaracoes_objetos().atribuicao().tipo().getText();
            int id_line = ctx.declaracoes_objetos().atribuicao().IDENT().getSymbol().getLine();
            if(!pilhaDeTabelas.existeSimbolo(id)){
                println("[ERROR] Line " + id_line +" : Variable " + id +" not declared");
            }
            else{
                if(pilhaDeTabelas.tipo(id) == "magia"){
                    if( !at.equals("agua") && !at.equals("fogo") && !at.equals("ataque")){
                     println("[ERROR] Line " + id_line +" : Variable " + id +" not compatible");
                    }
                }
                else if(pilhaDeTabelas.tipo(id) == "bloco"){
                     if( !at.equals("grama") && !at.equals("fogo") && !at.equals("parede") && !at.equals("inimigo") && !at.equals("proximo_bloco")){
                     println("[ERROR] Line " + id_line +" : Variable " + id +" not compatible");
                    }
                }
            }
            
        }
    }

}
