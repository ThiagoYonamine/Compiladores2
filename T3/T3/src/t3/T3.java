package t3;

import java.io.IOException;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class T3 {

    public static void main(String args[]) throws IOException, RecognitionException {
        for (int i = 1; i <= 1; i++) {
            Saida out = new Saida();
            

            System.out.printf("CASO: " + Integer.toString(i));
            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            ANTLRInputStream input = new ANTLRInputStream(T3.class.getResourceAsStream("exemplos/" + Integer.toString(i) + ".txt"));
            LaLexer lexer = new LaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LaParser parser = new LaParser(tokens);
            //parser.removeErrorListeners();
            parser.addErrorListener(new T3ErrorListener(out));
            LaParser.ProgramaContext tree = parser.programa();
            System.out.println(out.getTexto());
            ParseTreeWalker walker = new ParseTreeWalker();
            ParserListener extractor = new ParserListener(out);
            walker.walk(extractor, tree);
            Semantico semantico = new Semantico();
            semantico.Programa(tree);
            System.out.println(semantico.getTexto());
            //GeradorDeCodigo gerador = new GeradorDeCodigo();
            //gerador.gerarCodigoPrograma(tree);
            //codigoGerado = gerador.gerarCodigoPrograma(tree);
            //System.out.println(ErrosSemanticos.getTexto());
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
}
