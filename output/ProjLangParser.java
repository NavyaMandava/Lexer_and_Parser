// $ANTLR 3.5.2 ProjLang.g 2020-04-30 18:07:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "BINA", "BINAND", "BIND", 
		"BINM", "BINOR", "BINS", "COLON", "DIGIT", "DO", "ELSE", "END", "EQUALS", 
		"FALSE", "FUNCTION", "ID", "IF", "IN", "LEFTCUB", "LET", "LETTER", "LPAR", 
		"NOT", "NUMBER", "RELOP", "RIGHTCUB", "RPAR", "SEMICOLON", "THEN", "TRUE", 
		"VAL", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int BINA=5;
	public static final int BINAND=6;
	public static final int BIND=7;
	public static final int BINM=8;
	public static final int BINOR=9;
	public static final int BINS=10;
	public static final int COLON=11;
	public static final int DIGIT=12;
	public static final int DO=13;
	public static final int ELSE=14;
	public static final int END=15;
	public static final int EQUALS=16;
	public static final int FALSE=17;
	public static final int FUNCTION=18;
	public static final int ID=19;
	public static final int IF=20;
	public static final int IN=21;
	public static final int LEFTCUB=22;
	public static final int LET=23;
	public static final int LETTER=24;
	public static final int LPAR=25;
	public static final int NOT=26;
	public static final int NUMBER=27;
	public static final int RELOP=28;
	public static final int RIGHTCUB=29;
	public static final int RPAR=30;
	public static final int SEMICOLON=31;
	public static final int THEN=32;
	public static final int TRUE=33;
	public static final int VAL=34;
	public static final int WHILE=35;
	public static final int WS=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProjLangParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProjLangParser.tokenNames; }
	@Override public String getGrammarFileName() { return "ProjLang.g"; }



	// $ANTLR start "input"
	// ProjLang.g:43:1: input returns [Expr value] : expr SEMICOLON ;
	public final Expr input() throws RecognitionException {
		Expr value = null;


		Expr expr1 =null;

		try {
			// ProjLang.g:43:28: ( expr SEMICOLON )
			// ProjLang.g:43:30: expr SEMICOLON
			{
			pushFollow(FOLLOW_expr_in_input311);
			expr1=expr();
			state._fsp--;

			value = expr1;
			match(input,SEMICOLON,FOLLOW_SEMICOLON_in_input315); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// ProjLang.g:45:1: expr returns [Expr value] : ( IF c1= expr THEN c2= expr ELSE c3= expr | LET VAL l1= ID EQUALS c1= expr IN c2= expr END | LET FUNCTION f1= ID LPAR f2= ID RPAR EQUALS c1= expr IN c2= expr 'end' | WHILE c1= expr DO c2= expr | LEFTCUB c1= expr ( SEMICOLON c2= expr )* RIGHTCUB | NOT c1= expr |i= ID ASSIGN c1= expr |r= relexpr );
	public final Expr expr() throws RecognitionException {
		Expr value = null;


		Token l1=null;
		Token f1=null;
		Token f2=null;
		Token i=null;
		Expr c1 =null;
		Expr c2 =null;
		Expr c3 =null;
		Expr r =null;

		try {
			// ProjLang.g:45:27: ( IF c1= expr THEN c2= expr ELSE c3= expr | LET VAL l1= ID EQUALS c1= expr IN c2= expr END | LET FUNCTION f1= ID LPAR f2= ID RPAR EQUALS c1= expr IN c2= expr 'end' | WHILE c1= expr DO c2= expr | LEFTCUB c1= expr ( SEMICOLON c2= expr )* RIGHTCUB | NOT c1= expr |i= ID ASSIGN c1= expr |r= relexpr )
			int alt2=8;
			switch ( input.LA(1) ) {
			case IF:
				{
				alt2=1;
				}
				break;
			case LET:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==VAL) ) {
					alt2=2;
				}
				else if ( (LA2_2==FUNCTION) ) {
					alt2=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case WHILE:
				{
				alt2=4;
				}
				break;
			case LEFTCUB:
				{
				alt2=5;
				}
				break;
			case NOT:
				{
				alt2=6;
				}
				break;
			case ID:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ASSIGN) ) {
					alt2=7;
				}
				else if ( ((LA2_6 >= BINA && LA2_6 <= BINS)||(LA2_6 >= DO && LA2_6 <= EQUALS)||LA2_6==IN||LA2_6==LPAR||(LA2_6 >= RELOP && LA2_6 <= THEN)) ) {
					alt2=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FALSE:
			case LPAR:
			case NUMBER:
			case TRUE:
				{
				alt2=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// ProjLang.g:45:29: IF c1= expr THEN c2= expr ELSE c3= expr
					{
					match(input,IF,FOLLOW_IF_in_expr328); 
					pushFollow(FOLLOW_expr_in_expr332);
					c1=expr();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_expr334); 
					pushFollow(FOLLOW_expr_in_expr338);
					c2=expr();
					state._fsp--;

					match(input,ELSE,FOLLOW_ELSE_in_expr340); 
					pushFollow(FOLLOW_expr_in_expr344);
					c3=expr();
					state._fsp--;

					value =new IfExp (c1,c2,c3);
					}
					break;
				case 2 :
					// ProjLang.g:46:8: LET VAL l1= ID EQUALS c1= expr IN c2= expr END
					{
					match(input,LET,FOLLOW_LET_in_expr355); 
					match(input,VAL,FOLLOW_VAL_in_expr357); 
					l1=(Token)match(input,ID,FOLLOW_ID_in_expr361); 
					match(input,EQUALS,FOLLOW_EQUALS_in_expr363); 
					pushFollow(FOLLOW_expr_in_expr367);
					c1=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr369); 
					pushFollow(FOLLOW_expr_in_expr373);
					c2=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr375); 
					value =new LetValExp ((l1!=null?l1.getText():null),c1,c2);
					}
					break;
				case 3 :
					// ProjLang.g:47:8: LET FUNCTION f1= ID LPAR f2= ID RPAR EQUALS c1= expr IN c2= expr 'end'
					{
					match(input,LET,FOLLOW_LET_in_expr386); 
					match(input,FUNCTION,FOLLOW_FUNCTION_in_expr388); 
					f1=(Token)match(input,ID,FOLLOW_ID_in_expr392); 
					match(input,LPAR,FOLLOW_LPAR_in_expr394); 
					f2=(Token)match(input,ID,FOLLOW_ID_in_expr398); 
					match(input,RPAR,FOLLOW_RPAR_in_expr400); 
					match(input,EQUALS,FOLLOW_EQUALS_in_expr402); 
					pushFollow(FOLLOW_expr_in_expr406);
					c1=expr();
					state._fsp--;

					match(input,IN,FOLLOW_IN_in_expr408); 
					pushFollow(FOLLOW_expr_in_expr412);
					c2=expr();
					state._fsp--;

					match(input,END,FOLLOW_END_in_expr414); 
					value =new LetFunExp ((f1!=null?f1.getText():null),(f2!=null?f2.getText():null),c1,c2);
					}
					break;
				case 4 :
					// ProjLang.g:48:8: WHILE c1= expr DO c2= expr
					{
					match(input,WHILE,FOLLOW_WHILE_in_expr425); 
					pushFollow(FOLLOW_expr_in_expr429);
					c1=expr();
					state._fsp--;

					match(input,DO,FOLLOW_DO_in_expr431); 
					pushFollow(FOLLOW_expr_in_expr435);
					c2=expr();
					state._fsp--;

					value =new WhileExp (c1,c2);
					}
					break;
				case 5 :
					// ProjLang.g:49:8: LEFTCUB c1= expr ( SEMICOLON c2= expr )* RIGHTCUB
					{
					match(input,LEFTCUB,FOLLOW_LEFTCUB_in_expr446); 
					pushFollow(FOLLOW_expr_in_expr450);
					c1=expr();
					state._fsp--;

					// ProjLang.g:49:24: ( SEMICOLON c2= expr )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==SEMICOLON) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// ProjLang.g:49:26: SEMICOLON c2= expr
							{
							match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expr454); 
							pushFollow(FOLLOW_expr_in_expr458);
							c2=expr();
							state._fsp--;

							value =new SeqExp(c1,c2);
							}
							break;

						default :
							break loop1;
						}
					}

					match(input,RIGHTCUB,FOLLOW_RIGHTCUB_in_expr463); 
					}
					break;
				case 6 :
					// ProjLang.g:50:8: NOT c1= expr
					{
					match(input,NOT,FOLLOW_NOT_in_expr472); 
					pushFollow(FOLLOW_expr_in_expr476);
					c1=expr();
					state._fsp--;

					value =new NotExp (c1);
					}
					break;
				case 7 :
					// ProjLang.g:51:8: i= ID ASSIGN c1= expr
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_expr489); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_expr491); 
					pushFollow(FOLLOW_expr_in_expr495);
					c1=expr();
					state._fsp--;

					value =new AssnExp((i!=null?i.getText():null),c1);
					}
					break;
				case 8 :
					// ProjLang.g:52:8: r= relexpr
					{
					pushFollow(FOLLOW_relexpr_in_expr508);
					r=relexpr();
					state._fsp--;

					value =r;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "relexpr"
	// ProjLang.g:54:1: relexpr returns [Expr value] : a= arithexpr ( (r1= RELOP |r1= EQUALS ) a2= arithexpr )? ;
	public final Expr relexpr() throws RecognitionException {
		Expr value = null;


		Token r1=null;
		Expr a =null;
		Expr a2 =null;

		try {
			// ProjLang.g:54:29: (a= arithexpr ( (r1= RELOP |r1= EQUALS ) a2= arithexpr )? )
			// ProjLang.g:54:31: a= arithexpr ( (r1= RELOP |r1= EQUALS ) a2= arithexpr )?
			{
			pushFollow(FOLLOW_arithexpr_in_relexpr527);
			a=arithexpr();
			state._fsp--;

			value =a;
			// ProjLang.g:54:60: ( (r1= RELOP |r1= EQUALS ) a2= arithexpr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQUALS||LA4_0==RELOP) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ProjLang.g:54:61: (r1= RELOP |r1= EQUALS ) a2= arithexpr
					{
					// ProjLang.g:54:61: (r1= RELOP |r1= EQUALS )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==RELOP) ) {
						alt3=1;
					}
					else if ( (LA3_0==EQUALS) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// ProjLang.g:54:62: r1= RELOP
							{
							r1=(Token)match(input,RELOP,FOLLOW_RELOP_in_relexpr533); 
							}
							break;
						case 2 :
							// ProjLang.g:54:71: r1= EQUALS
							{
							r1=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_relexpr537); 
							}
							break;

					}

					pushFollow(FOLLOW_arithexpr_in_relexpr542);
					a2=arithexpr();
					state._fsp--;

					if ((r1!=null?r1.getText():null).equals("=")) value =new BinExp(value,BinOp.EQ,a2);
									else value =new BinExp(value,BinOp.LT,a2);
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "relexpr"



	// $ANTLR start "arithexpr"
	// ProjLang.g:59:1: arithexpr returns [Expr value] : t= term ( BINA b1= term | BINS b2= term | BINOR b3= term )* ;
	public final Expr arithexpr() throws RecognitionException {
		Expr value = null;


		Expr t =null;
		Expr b1 =null;
		Expr b2 =null;
		Expr b3 =null;

		try {
			// ProjLang.g:59:33: (t= term ( BINA b1= term | BINS b2= term | BINOR b3= term )* )
			// ProjLang.g:59:35: t= term ( BINA b1= term | BINS b2= term | BINOR b3= term )*
			{
			pushFollow(FOLLOW_term_in_arithexpr563);
			t=term();
			state._fsp--;

			value =t;
			// ProjLang.g:60:14: ( BINA b1= term | BINS b2= term | BINOR b3= term )*
			loop5:
			while (true) {
				int alt5=4;
				switch ( input.LA(1) ) {
				case BINA:
					{
					alt5=1;
					}
					break;
				case BINS:
					{
					alt5=2;
					}
					break;
				case BINOR:
					{
					alt5=3;
					}
					break;
				}
				switch (alt5) {
				case 1 :
					// ProjLang.g:60:15: BINA b1= term
					{
					match(input,BINA,FOLLOW_BINA_in_arithexpr581); 
					pushFollow(FOLLOW_term_in_arithexpr585);
					b1=term();
					state._fsp--;

					value =new BinExp(value,BinOp.PLUS,b1);
					}
					break;
				case 2 :
					// ProjLang.g:61:15: BINS b2= term
					{
					match(input,BINS,FOLLOW_BINS_in_arithexpr602); 
					pushFollow(FOLLOW_term_in_arithexpr606);
					b2=term();
					state._fsp--;

					value =new BinExp(value,BinOp.MINUS,b2);
					}
					break;
				case 3 :
					// ProjLang.g:62:15: BINOR b3= term
					{
					match(input,BINOR,FOLLOW_BINOR_in_arithexpr623); 
					pushFollow(FOLLOW_term_in_arithexpr627);
					b3=term();
					state._fsp--;

					value = new BinExp(value,BinOp.OR,b3);
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "arithexpr"



	// $ANTLR start "term"
	// ProjLang.g:64:1: term returns [Expr value] : f= factor ( BINM m= factor | BIND d= factor | BINAND a1= factor )* ;
	public final Expr term() throws RecognitionException {
		Expr value = null;


		Expr f =null;
		Expr m =null;
		Expr d =null;
		Expr a1 =null;

		try {
			// ProjLang.g:64:26: (f= factor ( BINM m= factor | BIND d= factor | BINAND a1= factor )* )
			// ProjLang.g:64:29: f= factor ( BINM m= factor | BIND d= factor | BINAND a1= factor )*
			{
			pushFollow(FOLLOW_factor_in_term644);
			f=factor();
			state._fsp--;

			value =f;
			// ProjLang.g:65:12: ( BINM m= factor | BIND d= factor | BINAND a1= factor )*
			loop6:
			while (true) {
				int alt6=4;
				switch ( input.LA(1) ) {
				case BINM:
					{
					alt6=1;
					}
					break;
				case BIND:
					{
					alt6=2;
					}
					break;
				case BINAND:
					{
					alt6=3;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// ProjLang.g:65:13: BINM m= factor
					{
					match(input,BINM,FOLLOW_BINM_in_term660); 
					pushFollow(FOLLOW_factor_in_term664);
					m=factor();
					state._fsp--;

					value =new BinExp(value,BinOp.TIMES,m);
					}
					break;
				case 2 :
					// ProjLang.g:66:13: BIND d= factor
					{
					match(input,BIND,FOLLOW_BIND_in_term679); 
					pushFollow(FOLLOW_factor_in_term683);
					d=factor();
					state._fsp--;

					value =new BinExp(value,BinOp.DIV,d);
					}
					break;
				case 3 :
					// ProjLang.g:67:13: BINAND a1= factor
					{
					match(input,BINAND,FOLLOW_BINAND_in_term698); 
					pushFollow(FOLLOW_factor_in_term702);
					a1=factor();
					state._fsp--;

					value =new BinExp(value,BinOp.AND,a1);
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "factor"
	// ProjLang.g:69:1: factor returns [Expr value] : ( NUMBER | TRUE | FALSE |d= ID |d1= ID LPAR x= expr RPAR | LPAR x2= expr RPAR );
	public final Expr factor() throws RecognitionException {
		Expr value = null;


		Token d=null;
		Token d1=null;
		Token NUMBER2=null;
		Expr x =null;
		Expr x2 =null;

		try {
			// ProjLang.g:69:28: ( NUMBER | TRUE | FALSE |d= ID |d1= ID LPAR x= expr RPAR | LPAR x2= expr RPAR )
			int alt7=6;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt7=1;
				}
				break;
			case TRUE:
				{
				alt7=2;
				}
				break;
			case FALSE:
				{
				alt7=3;
				}
				break;
			case ID:
				{
				int LA7_4 = input.LA(2);
				if ( (LA7_4==LPAR) ) {
					alt7=5;
				}
				else if ( ((LA7_4 >= BINA && LA7_4 <= BINS)||(LA7_4 >= DO && LA7_4 <= EQUALS)||LA7_4==IN||(LA7_4 >= RELOP && LA7_4 <= THEN)) ) {
					alt7=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LPAR:
				{
				alt7=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// ProjLang.g:69:31: NUMBER
					{
					NUMBER2=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor717); 
					value =new IntConst(Integer.parseInt((NUMBER2!=null?NUMBER2.getText():null)));
					}
					break;
				case 2 :
					// ProjLang.g:70:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_factor724); 
					value =new BoolConst(Boolean.parseBoolean("true"));
					}
					break;
				case 3 :
					// ProjLang.g:71:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_factor731); 
					value =new BoolConst(Boolean.parseBoolean("false"));
					}
					break;
				case 4 :
					// ProjLang.g:72:4: d= ID
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_factor740); 
					value =new VarExp((d!=null?d.getText():null));
					}
					break;
				case 5 :
					// ProjLang.g:73:10: d1= ID LPAR x= expr RPAR
					{
					d1=(Token)match(input,ID,FOLLOW_ID_in_factor755); 
					match(input,LPAR,FOLLOW_LPAR_in_factor757); 
					pushFollow(FOLLOW_expr_in_factor761);
					x=expr();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_factor763); 
					value =new AppExp((d1!=null?d1.getText():null),x);
					}
					break;
				case 6 :
					// ProjLang.g:74:7: LPAR x2= expr RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_factor773); 
					pushFollow(FOLLOW_expr_in_factor777);
					x2=expr();
					state._fsp--;

					value =x2;
					match(input,RPAR,FOLLOW_RPAR_in_factor781); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "factor"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_input311 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_input315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr328 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr332 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_THEN_in_expr334 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_expr340 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr355 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_VAL_in_expr357 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_expr361 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQUALS_in_expr363 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr367 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_expr369 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr373 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_END_in_expr375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_expr386 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_FUNCTION_in_expr388 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_expr392 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAR_in_expr394 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_expr398 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_RPAR_in_expr400 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_EQUALS_in_expr402 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_IN_in_expr408 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr412 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_END_in_expr414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_expr425 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr429 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DO_in_expr431 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFTCUB_in_expr446 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr450 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_expr454 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr458 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_RIGHTCUB_in_expr463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_expr472 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr489 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ASSIGN_in_expr491 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_expr495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relexpr_in_expr508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr527 = new BitSet(new long[]{0x0000000010010002L});
	public static final BitSet FOLLOW_RELOP_in_relexpr533 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_EQUALS_in_relexpr537 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_arithexpr_in_relexpr542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_arithexpr563 = new BitSet(new long[]{0x0000000000000622L});
	public static final BitSet FOLLOW_BINA_in_arithexpr581 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_term_in_arithexpr585 = new BitSet(new long[]{0x0000000000000622L});
	public static final BitSet FOLLOW_BINS_in_arithexpr602 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_term_in_arithexpr606 = new BitSet(new long[]{0x0000000000000622L});
	public static final BitSet FOLLOW_BINOR_in_arithexpr623 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_term_in_arithexpr627 = new BitSet(new long[]{0x0000000000000622L});
	public static final BitSet FOLLOW_factor_in_term644 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_BINM_in_term660 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_factor_in_term664 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_BIND_in_term679 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_factor_in_term683 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_BINAND_in_term698 = new BitSet(new long[]{0x000000020A0A0000L});
	public static final BitSet FOLLOW_factor_in_term702 = new BitSet(new long[]{0x00000000000001C2L});
	public static final BitSet FOLLOW_NUMBER_in_factor717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_factor724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_factor731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor755 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_LPAR_in_factor757 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_factor761 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_RPAR_in_factor763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_factor773 = new BitSet(new long[]{0x0000000A0EDA0000L});
	public static final BitSet FOLLOW_expr_in_factor777 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_RPAR_in_factor781 = new BitSet(new long[]{0x0000000000000002L});
}
