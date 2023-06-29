package MAIN;

import java.net.SocketPermission;
import java.util.*;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import org.antlr.v4.runtime.Vocabulary;


import ANTLR.LexerT;
import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTLexer;

import ANTLR.ParserTParser.ProgramContext;
import ANTLR.ParserTParser.CodigoContext;
import ANTLR.ParserTParser.EscrituraContext;
import ANTLR.ParserTParser.LecturaContext;
import ANTLR.ParserTParser.SiContext;
import ANTLR.ParserTParser.MientrasContext;
import ANTLR.ParserTParser.HacerContext;
import ANTLR.ParserTParser.DeclaracionContext;
import ANTLR.ParserTParser.CondicionContext;
import ANTLR.ParserTParser.CalculoContext;
import ANTLR.ParserTParser.SumaContext;
import ANTLR.ParserTParser.RestaContext;
import ANTLR.ParserTParser.MultiplicacionContext;
import ANTLR.ParserTParser.DivisionContext;
import ANTLR.ParserTParser.FuncionmatematicaContext;
import ANTLR.ParserTParser.RaizContext;
import ANTLR.ParserTParser.SenoContext;
import ANTLR.ParserTParser.CosenoContext;


public class MyVisitor extends ParserTBaseVisitor<Integer> {

	public String tokenName(Object nodo) {
		if (nodo instanceof TerminalNodeImpl) {
			TerminalNodeImpl nodoTerminal = ((TerminalNodeImpl) nodo);
			return LexerT.VOCABULARY.getSymbolicName(nodoTerminal.getSymbol().getType());
		}
		RuleContext nodoTerminal = (RuleContext) nodo;
		String nombre = nodoTerminal.getClass().getSimpleName();
		return nombre.substring(0, nombre.length() - 7);	
	}

	//»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»

	Map<String, String> variables = new HashMap<String, String>();

	// Programa
	@Override
	public Integer visitProgram(ParserTParser.ProgramContext ctx){

		return visitChildren(ctx);
	}

	// Código
	@Override
	public Integer visitCodigo(ParserTParser.CodigoContext ctx){
		return visitChildren(ctx);

	}
	
	// Declaración
	@Override
	public Integer visitDeclaracion(ParserTParser.DeclaracionContext ctx) {

		// Se obtiene el nombre de la variable y su valor
		String varname = ctx.getChild(1).getText();
		String value = ctx.getChild(3).getText();
		
		// Los valores obtenidos se colocan en el diccionario de variables
		variables.put(varname, value);

		return visitChildren(ctx);
	}

	// Escritura Print
	// Se indexan cada uno de los componentes a mostrar en un string (escritura)
	// Si se quiere mostrar una variable, se busca su valor en el diccionario
	// El texto se muestra entre comillas, soporta: A-Z, a-z, espacios y digitos.
	@Override
	public Integer visitEscritura(ParserTParser.EscrituraContext ctx) {

		String escritura = "";

		int i=2;
		do{
			if(tokenName(ctx.getChild(i)).equals("NAME_VAR")){
				escritura = escritura + variables.get(ctx.getChild(i).getText());
			}else{
				escritura = escritura + ctx.getChild(i).getText().substring(1, ctx.getChild(i).getText().length()-1);
			}
			i++;
			escritura = escritura + " ";
		}while(!tokenName(ctx.getChild(i)).equals("PAR_CLOSE"));

		System.out.println(escritura);

		return visitChildren(ctx);
	}

	// Lectura
	@Override
	public Integer visitLectura(ParserTParser.LecturaContext ctx){
		String texto = ctx.getChild(2).getText();
		String variable = ctx.getChild(4).getText();
		
		Scanner escaner = new Scanner(System.in);
		
		System.out.println(texto);
		String valor = escaner.nextLine();
		escaner.close();
		
		variables.put(variable, valor);


		return visitChildren(ctx);
	}

	// Cálculo
	@Override
	public Integer visitCalculo(ParserTParser.CalculoContext ctx){
		return visitChildren(ctx);
	}


	// SUMA
	@Override
	public Integer visitSuma(ParserTParser.SumaContext ctx){

		String resultado = ctx.getChild(0).getText();

		String primero = ctx.getChild(2).getText();
		String segundo = ctx.getChild(4).getText();

		if(tokenName(ctx.getChild(2)).equals("NAME_VAR")){
			primero = variables.get(primero);
		}

		if(tokenName(ctx.getChild(4)).equals("NAME_VAR")){
			segundo = variables.get(segundo);
		}

		float suma = Float.parseFloat(primero) + Float.parseFloat(segundo);

		variables.put(resultado, Float.toString(suma));


		return visitChildren(ctx);
	}

	// RESTA
	@Override
	public Integer visitResta(ParserTParser.RestaContext ctx){

		String resultado = ctx.getChild(0).getText();

		String primero = ctx.getChild(2).getText();
		String segundo = ctx.getChild(4).getText();

		if(tokenName(ctx.getChild(2)).equals("NAME_VAR")){
			primero = variables.get(primero);
		}

		if(tokenName(ctx.getChild(4)).equals("NAME_VAR")){
			segundo = variables.get(segundo);
		}

		float resta = Float.parseFloat(primero) - Float.parseFloat(segundo);

		variables.put(resultado, Float.toString(resta));


		return visitChildren(ctx);
	}

	// MULTIPLICACION
	public Integer visitMultiplicacion(ParserTParser.MultiplicacionContext ctx){

		String resultado = ctx.getChild(0).getText();

		String primero = ctx.getChild(2).getText();
		String segundo = ctx.getChild(4).getText();

		if(tokenName(ctx.getChild(2)).equals("NAME_VAR")){
			primero = variables.get(primero);
		}

		if(tokenName(ctx.getChild(4)).equals("NAME_VAR")){
			segundo = variables.get(segundo);
		}

		float multiplicacion = Float.parseFloat(primero) * Float.parseFloat(segundo);

		variables.put(resultado, Float.toString(multiplicacion));


		return visitChildren(ctx);
	}

	//DIVISION
	@Override
	public Integer visitDivision(ParserTParser.DivisionContext ctx){

		String resultado = ctx.getChild(0).getText();

		String primero = ctx.getChild(2).getText();
		String segundo = ctx.getChild(4).getText();

		if(tokenName(ctx.getChild(2)).equals("NAME_VAR")){
			primero = variables.get(primero);
		}

		if(tokenName(ctx.getChild(4)).equals("NAME_VAR")){
			segundo = variables.get(segundo);
		}

		float division = Float.parseFloat(primero) / Float.parseFloat(segundo);

		variables.put(resultado, Float.toString(division));


		return visitChildren(ctx);
	}

	// Función matemática
	@Override
	public Integer visitFuncionmatematica(ParserTParser.FuncionmatematicaContext ctx){
		return visitChildren(ctx);
	}

	// RAIZ
	@Override
	public Integer visitRaiz(ParserTParser.RaizContext ctx){

		String variable = ctx.getChild(0).getText();
		String valor = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(4)) == "NAME_VAR") {
			valor = variables.get(valor);
		}
		double raiz = Math.sqrt(Double.parseDouble(valor));
		variables.put(variable, Double.toString(raiz));
		return visitChildren(ctx);
	}

	// SENO
	@Override
	public Integer visitSeno(ParserTParser.SenoContext ctx){

		String variable = ctx.getChild(0).getText();
		String valor = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(4)) == "NAME_VAR") {
			valor = variables.get(valor);
		}
		double seno = Math.sin(Double.parseDouble(valor));
		variables.put(variable, Double.toString(seno));
		return visitChildren(ctx);
	}

	// COSENO
	@Override
	public Integer visitCoseno(ParserTParser.CosenoContext ctx){

		String variable = ctx.getChild(0).getText();
		String valor = ctx.getChild(4).getText();

		if (tokenName(ctx.getChild(4)) == "NAME_VAR") {
			valor = variables.get(valor);
		}
		double coseno = Math.cos(Double.parseDouble(valor));
		variables.put(variable, Double.toString(coseno));
		return visitChildren(ctx);
	}

	// SI
	@Override
	public Integer visitSi(ParserTParser.SiContext ctx) {
	
		int afirmacion = visitCondicion((CondicionContext) ctx.getChild(2));

		List<Object> listaAfirmacion = new ArrayList<>();
		int i = 0;
		do{
			//System.out.println(tokenName(ctx.getChild(i)));
			if (tokenName(ctx.getChild(i)).equals("Codigo")){
				listaAfirmacion.add(ctx.getChild(i));
			}
			i++;
		}while(!tokenName(ctx.getChild(i)).equals("BRACE_CLOSE"));

		List<Object> listaNoAfirmacion = new ArrayList<>();
		do{
			if (tokenName(ctx.getChild(i)).equals("Codigo")){
				listaNoAfirmacion.add(ctx.getChild(i));
			}
			i++;
		}while(!tokenName(ctx.getChild(i)).equals("BRACE_CLOSE"));

		if (afirmacion == 1){
			for (Object codigo : listaAfirmacion){
				visitCodigo((CodigoContext) codigo);
			}
		}else{
			for (Object codigo : listaNoAfirmacion){
				visitCodigo((CodigoContext) codigo);
			}
		}
		return 0;
	}

	// HACER
	@Override
	public Integer visitHacer(ParserTParser.HacerContext ctx){

		List<Object> listaAfirmacion = new ArrayList<>();
		int i = 0;
		do{
			//System.out.println(tokenName(ctx.getChild(i)));
			if (tokenName(ctx.getChild(i)).equals("Codigo")){
				listaAfirmacion.add(ctx.getChild(i));
			}
			i++;
		}while(!tokenName(ctx.getChild(i)).equals("BRACE_CLOSE"));

		do{
			for (Object codigo : listaAfirmacion){
				visitCodigo((CodigoContext) codigo);
			}

		}while(visitCondicion((CondicionContext) ctx.getChild(ctx.getChildCount()-2))==1);

		return 0;
	}
	
	//MIENTRAS
	@Override
	public Integer visitMientras(ParserTParser.MientrasContext ctx){

		List<Object> listaAfirmacion = new ArrayList<>();
		int i = 0;
		do{
			//System.out.println(tokenName(ctx.getChild(i)));
			if (tokenName(ctx.getChild(i)).equals("Codigo")){
				listaAfirmacion.add(ctx.getChild(i));
			}
			i++;
		}while(!tokenName(ctx.getChild(i)).equals("BRACE_CLOSE"));

		while(visitCondicion((CondicionContext) ctx.getChild(2))==1){
			for (Object codigo : listaAfirmacion){
				visitCodigo((CodigoContext) codigo);
			}
		}
		return 0;
	}


	// CONDICION
	@Override
	public Integer visitCondicion(ParserTParser.CondicionContext ctx){
		if(tokenName(ctx.getChild(1)).equals("EQUAL")){
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)==Float.parseFloat(ladoDerecho)){
				return 1;
			}

		}else if(tokenName(ctx.getChild(1)).equals("NOT_EQUAL")){
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)!=Float.parseFloat(ladoDerecho)){
				return 1;
			}
		}else if(tokenName(ctx.getChild(1)).equals("GREATER")){
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)>Float.parseFloat(ladoDerecho)){
				return 1;
			}
		}else if(tokenName(ctx.getChild(1)).equals("LESSER")){
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)<Float.parseFloat(ladoDerecho)){
				return 1;
			}
		}else if(tokenName(ctx.getChild(1)).equals("GREATER_OR_EQUAL")){
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)>=Float.parseFloat(ladoDerecho)){
				return 1;
			}
		}else{
			String ladoIzquierdo = variables.get(ctx.getChild(0).getText());
			String ladoDerecho = ctx.getChild(2).getText();
			if(Float.parseFloat(ladoIzquierdo)<=Float.parseFloat(ladoDerecho)){
				return 1;
			}
		}
		return 0;
	}

}
