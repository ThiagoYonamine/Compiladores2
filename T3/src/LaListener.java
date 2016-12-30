// Generated from La.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LaParser}.
 */
public interface LaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#declaracoes_objetos}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_objetos(LaParser.Declaracoes_objetosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracoes_objetos}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_objetos(LaParser.Declaracoes_objetosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#obj_magia}.
	 * @param ctx the parse tree
	 */
	void enterObj_magia(LaParser.Obj_magiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#obj_magia}.
	 * @param ctx the parse tree
	 */
	void exitObj_magia(LaParser.Obj_magiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#obj_bloco}.
	 * @param ctx the parse tree
	 */
	void enterObj_bloco(LaParser.Obj_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#obj_bloco}.
	 * @param ctx the parse tree
	 */
	void exitObj_bloco(LaParser.Obj_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#declaracoes_funcao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_funcao(LaParser.Declaracoes_funcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracoes_funcao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_funcao(LaParser.Declaracoes_funcaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(LaParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(LaParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#tipo_bloco}.
	 * @param ctx the parse tree
	 */
	void enterTipo_bloco(LaParser.Tipo_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo_bloco}.
	 * @param ctx the parse tree
	 */
	void exitTipo_bloco(LaParser.Tipo_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#tipo_magia}.
	 * @param ctx the parse tree
	 */
	void enterTipo_magia(LaParser.Tipo_magiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#tipo_magia}.
	 * @param ctx the parse tree
	 */
	void exitTipo_magia(LaParser.Tipo_magiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LaParser#resultado}.
	 * @param ctx the parse tree
	 */
	void enterResultado(LaParser.ResultadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LaParser#resultado}.
	 * @param ctx the parse tree
	 */
	void exitResultado(LaParser.ResultadoContext ctx);
}