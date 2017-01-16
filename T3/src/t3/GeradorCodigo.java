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

public class GeradorCodigo {

    private int identacao = 1;
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    private StringBuffer codigo = new StringBuffer(); //Concatena todos as linhas de código
    private StringBuffer funcoes = new StringBuffer();
    Map<String, String> variaveis_tipo;

    public void println(String txt) {
        this.codigo.append(txt).append("\n");
    }

    public void print(String txt) {
        this.codigo.append(txt);
    }

    public void printF(String txt) {
        this.funcoes.append(txt);
    }

      public void printlnF(String txt) {
        this.funcoes.append(txt).append("\n");
    }
    

    //Limpa a string para o próximo arquivo
    public void clear() {
        this.codigo = new StringBuffer();
    }

    public String getTexto() {
        return this.codigo.toString();
    }

    public String getFuncao() {
        return this.funcoes.toString();
    }

    void Programa(LaParser.ProgramaContext ctx) {
        
        variaveis_tipo = new HashMap<String, String>();
        clear();
        println(ctx.NUM_INT().getText());
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("Global"));
        if (!ctx.corpo().getText().equals("")) {
            Corpo(ctx.corpo());
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
        if (identacao == 1 && ctx.declaracoes() == null) {
            println("");
        } else {
            printF("     ");
        }

        if (ctx.declaracoes() != null) {
            Declaracoes(ctx.declaracoes());
        } else if (ctx.IDENT() != null) {
            String id = ctx.IDENT().getText();
            int id_line = ctx.IDENT().getSymbol().getLine();
            if (ctx.getStart().getText().equals("usar")) {  
                if(identacao == 4)
                    printF("player.usar(" + "'"+ variaveis_tipo.get(id) +"'"+ ");");
                else if(identacao == 3)
                    print("player.usar(" + "'"+ variaveis_tipo.get(id) +"'"+ ");");
                else if(identacao == 2)
                    printlnF("player.usar(" + "'"+ variaveis_tipo.get(id) +"'"+ ")");             
                else 
                    print("player.usar(" + "'"+ variaveis_tipo.get(id) +"'"+ ")");
            } else {
                if(identacao == 4)
                    printF(id +"(player);");
                else if(identacao == 3)
                    print(id +"(player);");
                else if(identacao == 2)
                    printlnF(id +"(player)");
                else
                    print(id +"(player)");
            }
        } else if (ctx.getStart().getText().equals("perguntar")) {

            String t = ctx.expressao().tipo().getText();
            if(identacao ==1){
            identacao = 3;
              
            print("if frente == '"+ t + "': " );
            Comandos(ctx.resultado().comandos());
            identacao = 1;
            }
            else if(identacao == 2){
            identacao = 4;
            print("if frente == '"+ t + "': " );
            Comandos(ctx.resultado().comandos());
            identacao = 2;
            }
        }
        else if (ctx.getStart().getText().equals("repetir")){
            
            String n = ctx.repetir().NUM_INT().getText();
            
            
            if(identacao == 1){
                print("for i in range(" + n + "): ");
            identacao = 3;
            Comandos(ctx.repetir().comandos());
            identacao = 1;
            }
            else if(identacao == 2){
                printF("for i in range(" + n + "): ");
            identacao = 4;
            Comandos(ctx.repetir().comandos());
            printF("\n");
            identacao = 2;
            }
        }
        else  { //player.andar() e player.virar()
                if(identacao == 4)
                    printF("player."+ctx.getText()+";");
                else if(identacao == 3)
                    print("player."+ctx.getText()+";");
                else if (identacao == 2)
                    printlnF("player."+ctx.getText());
                else
                    print("player."+ctx.getText());
        }
    }

    void Declaracoes(LaParser.DeclaracoesContext ctx) {
        if (ctx.getStart().getText().equals("funcao")) {

            String id = ctx.declaracoes_funcao().IDENT().getText();
            int id_line = ctx.declaracoes_funcao().IDENT().getSymbol().getLine();
            println("from funcoes import " + id);
            printF("\n");
            printF("def " + id + "(player):\n");
            identacao = 2;
            Comandos(ctx.declaracoes_funcao().comandos());
            identacao = 1;
        } else if (ctx.getStart().getText().equals("magia")) {

        } else if (ctx.getStart().getText().equals("bloco")) {

        } else {

            String id = ctx.declaracoes_objetos().atribuicao().IDENT().getText();
            String at = ctx.declaracoes_objetos().atribuicao().tipo().getText();

            pilhaDeTabelas.topo().adicionarSimbolo(id, at);
            if (variaveis_tipo.containsKey(id)) {
                variaveis_tipo.remove(id);
            }
            variaveis_tipo.put(id, at);
        }
    }

}
