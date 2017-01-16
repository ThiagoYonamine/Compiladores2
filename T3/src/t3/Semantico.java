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
    Map<String, String> variaveis_tipo;

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
        variaveis_tipo = new HashMap<String, String>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("Global"));
        if (Integer.parseInt(ctx.NUM_INT().getText()) < 1 || Integer.parseInt(ctx.NUM_INT().getText()) > 4) {
            println("[ERROR] Level " + ctx.NUM_INT() + " doesn't exist\nSet a value between 1 to 4");
        } else if (!ctx.corpo().getText().equals("")) {
            Corpo(ctx.corpo());
        } else {
            println("[ERROR] Body is empty");
        }
        pilhaDeTabelas.desempilhar();
    }

    void Corpo(LaParser.CorpoContext ctx) {

        Comandos(ctx.comandos());
    }

    void Comandos(LaParser.ComandosContext ctx) {
        Cmd(ctx.cmd());
        if (!ctx.comandos().getText().equals("")) {
            Comandos(ctx.comandos());
        }
    }

    void Cmd(LaParser.CmdContext ctx) {
        if (ctx.declaracoes() != null) {
            Declaracoes(ctx.declaracoes());
        }
        if (ctx.IDENT() != null) {
            String id = ctx.IDENT().getText();
            int id_line = ctx.IDENT().getSymbol().getLine();
            if (ctx.getStart().getText().equals("usar")) {
                if (!pilhaDeTabelas.existeSimbolo(id)) {
                    println("[ERROR] Line " + id_line + " : Magic " + id + " not defined");
                } else {
                    if (!variaveis_tipo.containsKey(id)) {
                        println("[ERROR] Line " + id_line + " : Magic " + id + " has no type");
                    }
                }
            } else if (!pilhaDeTabelas.existeSimbolo(id)) {
                println("[ERROR] Line " + id_line + " : Function " + id + " not defined");
            }
        }
        if (ctx.getStart().getText().equals("perguntar")) {
            if(!ctx.resultado().comandos().getText().equals(""))
                Comandos(ctx.resultado().comandos());
           
        }
        if (ctx.getStart().getText().equals("repetir")) {
           if(!ctx.repetir().getText().equals(""))
            Comandos(ctx.repetir().comandos());
        }
    }

    void Declaracoes(LaParser.DeclaracoesContext ctx) {
        if (ctx.getStart().getText().equals("magia")) {

            String id = ctx.declaracoes_objetos().obj_magia().IDENT().getText();
            int id_line = ctx.declaracoes_objetos().obj_magia().IDENT().getSymbol().getLine();
            if (!pilhaDeTabelas.existeSimbolo(id)) {
                pilhaDeTabelas.topo().adicionarSimbolo(id, "magia");
            } else {
                println("[ERROR] Line " + id_line + " : Magic " + id + " already defined");
            }

        } else if (ctx.getStart().getText().equals("bloco")) {

            String id = ctx.declaracoes_objetos().obj_bloco().IDENT().getText();
            int id_line = ctx.declaracoes_objetos().obj_bloco().IDENT().getSymbol().getLine();
            if (!pilhaDeTabelas.existeSimbolo(id)) {
                pilhaDeTabelas.topo().adicionarSimbolo(id, "bloco");
            } else {
                println("[ERROR] Line " + id_line + " : Block " + id + " already defined");
            }
        } else if (ctx.getStart().getText().equals("funcao")) {

            String id = ctx.declaracoes_funcao().IDENT().getText();
            int id_line = ctx.declaracoes_funcao().IDENT().getSymbol().getLine();
            if (!pilhaDeTabelas.existeSimbolo(id)) {
                pilhaDeTabelas.topo().adicionarSimbolo(id, "funcao");
                pilhaDeTabelas.empilhar(new TabelaDeSimbolos(id));
                Comandos(ctx.declaracoes_funcao().comandos());
                pilhaDeTabelas.desempilhar();
            } else {
                println("[ERROR] Line " + id_line + " : Function " + id + " already defined");
            }
        } else {
            String id = ctx.declaracoes_objetos().atribuicao().IDENT().getText();
            String at = ctx.declaracoes_objetos().atribuicao().tipo().getText();
            int id_line = ctx.declaracoes_objetos().atribuicao().IDENT().getSymbol().getLine();
            if (!pilhaDeTabelas.existeSimbolo(id)) {
                println("[ERROR] Line " + id_line + " : Variable " + id + " not defined");
            } else {
                if (variaveis_tipo.containsKey(id)) {
                    variaveis_tipo.remove(id);
                }
                variaveis_tipo.put(id, at);

                if (pilhaDeTabelas.tipo(id) == "magia") {
                    if (!at.equals("agua") && !at.equals("fogo") && !at.equals("ataque")) {
                        println("[ERROR] Line " + id_line + " : Variable " + id + " not compatible");
                    }
                } else if (pilhaDeTabelas.tipo(id) == "bloco") {
                    
                    if (!at.equals("grama") && !at.equals("lava") && !at.equals("pedra") && !at.equals("inimigo") && !at.equals("gelo") && !at.equals("espinho")&& !at.equals("arvore")&& !at.equals("caixa")) {
                        println("[ERROR] Line " + id_line + " : Variable " + id + " not compatible");
                    }
                }
            }

        }
    }

}
