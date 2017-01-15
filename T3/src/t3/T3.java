package t3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class T3 {

    public static void main(String args[]) throws IOException, RecognitionException, InterruptedException {

        Saida out = new Saida();

        ANTLRInputStream input = new ANTLRInputStream(T3.class.getResourceAsStream("codigo.txt"));
        //ANTLRInputStream input = new ANTLRInputStream(T3.class.getResourceAsStream("/home/thyonamine/NetBeansProjects/Compiladores2/T3Grammar/cod.txt"));
        LaLexer lexer = new LaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LaParser parser = new LaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new T3ErrorListener(out));
        LaParser.ProgramaContext tree = parser.programa();

        ParseTreeWalker walker = new ParseTreeWalker();
        ParserListener extractor = new ParserListener(out);
        walker.walk(extractor, tree);

        Semantico semantico = new Semantico();
        GeradorCodigo gerador = new GeradorCodigo();

        //codigoGerado = gerador.gerarCodigoPrograma(tree);
        //System.out.println(gerador.getTexto());
        //System.out.println(gerador.getFuncao());
        if (out.getTexto().length() > 2) {
            System.out.println(out.getTexto());
        } else {
            semantico.Programa(tree);
            if (semantico.getTexto().length() > 2) {
                System.out.println(semantico.getTexto());
            } else {
                gerador.Programa(tree);
                try {
                    PrintWriter writer = new PrintWriter("codigoGerado.txt", "UTF-8");
                    writer.print(gerador.getTexto());
                    writer.close();
                } catch (IOException e) {
                    System.out.println("erro");
                }
                try {
                    PrintWriter writer = new PrintWriter("funcoes.py", "UTF-8");
                    writer.print(gerador.getFuncao());
                    writer.close();
                } catch (IOException e) {
                    // do something
                }
                try {
                    String cmd = "python code.py";
                    Process p = Runtime.getRuntime().exec(cmd);

                    //p.waitFor();
                    // System.out.println(p.getErrorStream());
                } catch (IOException ex) {
                    System.out.println("erro");
                }
            }
        }

        //out.print(ErrosSemanticos.getTexto());
        //ErrosSemanticos.clear();
        //System.out.print(out);
        //System.out.print(gerador.getTexto());
        //System.out.print(ErrosSemanticos.mapaFuncoes.get("modulo"));
        //if (!out.isModificado()) {
        //out.println("Fim da analise. Sem erros sintaticos.");
        //System.out.println(ErrosSemanticos.getTexto());
        //ErrosSemanticos.clear();
        //System.out.println("Tabela de simbolos:");
        //System.out.println(Saida.getTexto());
        //TabelaDeSimbolos.imprimirTabela(out);
        //System.out.print(out);
        //} else {
        //out.println("Fim da analise. Com erros sintaticos.");
        //}
        //System.out.println("Fim da compilacao");
    }
}
