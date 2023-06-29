// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(ParserTParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(ParserTParser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(ParserTParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(ParserTParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(ParserTParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(ParserTParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#hacer}.
	 * @param ctx the parse tree
	 */
	void enterHacer(ParserTParser.HacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#hacer}.
	 * @param ctx the parse tree
	 */
	void exitHacer(ParserTParser.HacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#calculo}.
	 * @param ctx the parse tree
	 */
	void enterCalculo(ParserTParser.CalculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#calculo}.
	 * @param ctx the parse tree
	 */
	void exitCalculo(ParserTParser.CalculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(ParserTParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void enterResta(ParserTParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 */
	void exitResta(ParserTParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#funcionmatematica}.
	 * @param ctx the parse tree
	 */
	void enterFuncionmatematica(ParserTParser.FuncionmatematicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#funcionmatematica}.
	 * @param ctx the parse tree
	 */
	void exitFuncionmatematica(ParserTParser.FuncionmatematicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 */
	void enterRaiz(ParserTParser.RaizContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 */
	void exitRaiz(ParserTParser.RaizContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#seno}.
	 * @param ctx the parse tree
	 */
	void enterSeno(ParserTParser.SenoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#seno}.
	 * @param ctx the parse tree
	 */
	void exitSeno(ParserTParser.SenoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#coseno}.
	 * @param ctx the parse tree
	 */
	void enterCoseno(ParserTParser.CosenoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#coseno}.
	 * @param ctx the parse tree
	 */
	void exitCoseno(ParserTParser.CosenoContext ctx);
}