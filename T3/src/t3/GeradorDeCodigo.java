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

/**
 *
 * @author thyonamine
 */
public class GeradorDeCodigo {

    Map<String, String> variaveis_tipo;
    Map<String, String> parametros;
    private StringBuffer codigo = new StringBuffer(); //Concatena todos as linhas de código

    public void println(String txt) {
        this.codigo.append(txt).append("\n");
    }

    public void print(String txt) {
        this.codigo.append(txt);
    }

    //Limpa a string para o próximo arquivo
    public void clear() {
        this.codigo = new StringBuffer();
    }

    public String getTexto() {
        return this.codigo.toString();
    }

    void gerarCodigoPrograma(LaParser.ProgramaContext ctx) {
        clear();
        variaveis_tipo = new HashMap<String, String>();
        parametros = new HashMap<String, String>();
        println("#include <stdio.h>");
        println("#include <stdlib.h>");
       // if (!ctx.declaracoes().getText().equals("")) {
        //    declaracoes(ctx.declaracoes());
        //}
        println("int main(){");
        //corpo(ctx.corpo());
        println("return 0;");
        println("}");

    }

}
