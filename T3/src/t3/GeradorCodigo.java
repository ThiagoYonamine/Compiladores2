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
        println("#fase: " + ctx.NUM_INT().getText());
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
            for(int i=1;i <identacao ; i++)
                print("     ");
        }

        if (ctx.declaracoes() != null) {
            Declaracoes(ctx.declaracoes());
        } else if (ctx.IDENT() != null) {
            String id = ctx.IDENT().getText();
            int id_line = ctx.IDENT().getSymbol().getLine();
            if (ctx.getStart().getText().equals("usar")) {                  
                    println("player.usar(" +  id + ")");
            } else {
               
                    println(id +"(player)");
            }
        } else if (ctx.getStart().getText().equals("perguntar")) {

            String t = ctx.expressao().tipo_bloco().getText();
            
              
            println("if frente == '"+ t + "':");
            if(!ctx.resultado().comandos().getText().equals("")){
                identacao += 1;
            Comandos(ctx.resultado().comandos());
                identacao -= 1;
            }
            else
                println("nada = 0");
  
        }
        else if (ctx.getStart().getText().equals("repetir")){
            
            String n = ctx.repetir().NUM_INT().getText();
            
 
            println("for i in range(" + n + "): ");
            if(!ctx.repetir().comandos().getText().equals("")){
            identacao += 1;
            Comandos(ctx.repetir().comandos());
             identacao -= 1;
            }
            else
                println("nada = 0");
           
        }
        else  { //player.andar() e player.virar()    
                println("player."+ctx.getText());
        }
    }

    void Declaracoes(LaParser.DeclaracoesContext ctx) {
        if (ctx.getStart().getText().equals("funcao")) {

            String id = ctx.declaracoes_funcao().IDENT().getText();
            int id_line = ctx.declaracoes_funcao().IDENT().getSymbol().getLine();  
            println("");
            println("def " + id + "(player):");
            identacao += 1;
            Comandos(ctx.declaracoes_funcao().comandos());
            identacao -= 1;
        } else if (ctx.getStart().getText().equals("magia")) {
            String id = ctx.declaracoes_objetos().obj_magia().IDENT().getText();
            println(id + "= ''");
           

        } else if (ctx.getStart().getText().equals("bloco")) {
            String id = ctx.declaracoes_objetos().obj_bloco().IDENT().getText();
            
            println(id + "= ''");

        } else {

            String id = ctx.declaracoes_objetos().atribuicao().IDENT().getText();
            String at = ctx.declaracoes_objetos().atribuicao().tipo().getText();
            
            println(id + "='" + at + "'");
            
            pilhaDeTabelas.topo().adicionarSimbolo(id, at);
            if (variaveis_tipo.containsKey(id)) {
                variaveis_tipo.remove(id);
            }
            variaveis_tipo.put(id, at);
        }
    }

}
