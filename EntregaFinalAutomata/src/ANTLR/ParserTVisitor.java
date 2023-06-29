package ANTLR;

// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(ParserTParser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#escritura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritura(ParserTParser.EscrituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(ParserTParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ParserTParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ParserTParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#hacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer(ParserTParser.HacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(ParserTParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#calculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculo(ParserTParser.CalculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#resta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(ParserTParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(ParserTParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(ParserTParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#funcionmatematica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionmatematica(ParserTParser.FuncionmatematicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#raiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiz(ParserTParser.RaizContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#seno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeno(ParserTParser.SenoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#coseno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoseno(ParserTParser.CosenoContext ctx);
}