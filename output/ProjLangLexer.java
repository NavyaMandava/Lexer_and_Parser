// $ANTLR 3.5.2 ProjLang.g 2020-04-30 18:07:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "ProjLang.g"; }

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// ProjLang.g:4:2: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// ProjLang.g:7:2: ( '0' .. '9' )
			// ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:9:4: ( 'if' )
			// ProjLang.g:9:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:10:6: ( 'then' )
			// ProjLang.g:10:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:11:6: ( 'else' )
			// ProjLang.g:11:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:12:5: ( 'let' )
			// ProjLang.g:12:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:13:4: ( 'in' )
			// ProjLang.g:13:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "VAL"
	public final void mVAL() throws RecognitionException {
		try {
			int _type = VAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:14:5: ( 'val' )
			// ProjLang.g:14:7: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAL"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:15:5: ( 'end' )
			// ProjLang.g:15:7: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:16:9: ( 'fun' )
			// ProjLang.g:16:11: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "LEFTCUB"
	public final void mLEFTCUB() throws RecognitionException {
		try {
			int _type = LEFTCUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:17:9: ( '{' )
			// ProjLang.g:17:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTCUB"

	// $ANTLR start "RIGHTCUB"
	public final void mRIGHTCUB() throws RecognitionException {
		try {
			int _type = RIGHTCUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:18:9: ( '}' )
			// ProjLang.g:18:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTCUB"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:19:7: ( ':' )
			// ProjLang.g:19:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:20:9: ( 'while' )
			// ProjLang.g:20:11: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:21:4: ( 'do' )
			// ProjLang.g:21:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:22:11: ( ';' )
			// ProjLang.g:22:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:23:8: ( ':=' )
			// ProjLang.g:23:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:24:5: ( '!' )
			// ProjLang.g:24:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "BINA"
	public final void mBINA() throws RecognitionException {
		try {
			int _type = BINA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:25:8: ( '+' )
			// ProjLang.g:25:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINA"

	// $ANTLR start "BINS"
	public final void mBINS() throws RecognitionException {
		try {
			int _type = BINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:26:8: ( '-' )
			// ProjLang.g:26:11: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINS"

	// $ANTLR start "BINM"
	public final void mBINM() throws RecognitionException {
		try {
			int _type = BINM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:27:8: ( '*' )
			// ProjLang.g:27:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINM"

	// $ANTLR start "BIND"
	public final void mBIND() throws RecognitionException {
		try {
			int _type = BIND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:28:8: ( '/' )
			// ProjLang.g:28:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIND"

	// $ANTLR start "BINAND"
	public final void mBINAND() throws RecognitionException {
		try {
			int _type = BINAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:29:11: ( '&' )
			// ProjLang.g:29:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINAND"

	// $ANTLR start "BINOR"
	public final void mBINOR() throws RecognitionException {
		try {
			int _type = BINOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:30:11: ( '|' )
			// ProjLang.g:30:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BINOR"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:31:6: ( 'true' )
			// ProjLang.g:31:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:32:7: ( 'false' )
			// ProjLang.g:32:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:33:8: ( ( DIGIT )+ )
			// ProjLang.g:33:10: ( DIGIT )+
			{
			// ProjLang.g:33:10: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:34:4: ( LETTER ( LETTER | DIGIT )* )
			// ProjLang.g:34:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// ProjLang.g:34:12: ( LETTER | DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:35:6: ( '(' )
			// ProjLang.g:35:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:36:9: ( ')' )
			// ProjLang.g:36:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:37:8: ( '=' )
			// ProjLang.g:37:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:38:7: ( '<' )
			// ProjLang.g:38:10: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ProjLang.g:40:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// ProjLang.g:40:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// ProjLang.g:40:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// ProjLang.g:1:8: ( IF | THEN | ELSE | LET | IN | VAL | END | FUNCTION | LEFTCUB | RIGHTCUB | COLON | WHILE | DO | SEMICOLON | ASSIGN | NOT | BINA | BINS | BINM | BIND | BINAND | BINOR | TRUE | FALSE | NUMBER | ID | LPAR | RPAR | EQUALS | RELOP | WS )
		int alt4=31;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// ProjLang.g:1:10: IF
				{
				mIF(); 

				}
				break;
			case 2 :
				// ProjLang.g:1:13: THEN
				{
				mTHEN(); 

				}
				break;
			case 3 :
				// ProjLang.g:1:18: ELSE
				{
				mELSE(); 

				}
				break;
			case 4 :
				// ProjLang.g:1:23: LET
				{
				mLET(); 

				}
				break;
			case 5 :
				// ProjLang.g:1:27: IN
				{
				mIN(); 

				}
				break;
			case 6 :
				// ProjLang.g:1:30: VAL
				{
				mVAL(); 

				}
				break;
			case 7 :
				// ProjLang.g:1:34: END
				{
				mEND(); 

				}
				break;
			case 8 :
				// ProjLang.g:1:38: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 9 :
				// ProjLang.g:1:47: LEFTCUB
				{
				mLEFTCUB(); 

				}
				break;
			case 10 :
				// ProjLang.g:1:55: RIGHTCUB
				{
				mRIGHTCUB(); 

				}
				break;
			case 11 :
				// ProjLang.g:1:64: COLON
				{
				mCOLON(); 

				}
				break;
			case 12 :
				// ProjLang.g:1:70: WHILE
				{
				mWHILE(); 

				}
				break;
			case 13 :
				// ProjLang.g:1:76: DO
				{
				mDO(); 

				}
				break;
			case 14 :
				// ProjLang.g:1:79: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 15 :
				// ProjLang.g:1:89: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 16 :
				// ProjLang.g:1:96: NOT
				{
				mNOT(); 

				}
				break;
			case 17 :
				// ProjLang.g:1:100: BINA
				{
				mBINA(); 

				}
				break;
			case 18 :
				// ProjLang.g:1:105: BINS
				{
				mBINS(); 

				}
				break;
			case 19 :
				// ProjLang.g:1:110: BINM
				{
				mBINM(); 

				}
				break;
			case 20 :
				// ProjLang.g:1:115: BIND
				{
				mBIND(); 

				}
				break;
			case 21 :
				// ProjLang.g:1:120: BINAND
				{
				mBINAND(); 

				}
				break;
			case 22 :
				// ProjLang.g:1:127: BINOR
				{
				mBINOR(); 

				}
				break;
			case 23 :
				// ProjLang.g:1:133: TRUE
				{
				mTRUE(); 

				}
				break;
			case 24 :
				// ProjLang.g:1:138: FALSE
				{
				mFALSE(); 

				}
				break;
			case 25 :
				// ProjLang.g:1:144: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 26 :
				// ProjLang.g:1:151: ID
				{
				mID(); 

				}
				break;
			case 27 :
				// ProjLang.g:1:154: LPAR
				{
				mLPAR(); 

				}
				break;
			case 28 :
				// ProjLang.g:1:159: RPAR
				{
				mRPAR(); 

				}
				break;
			case 29 :
				// ProjLang.g:1:164: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 30 :
				// ProjLang.g:1:171: RELOP
				{
				mRELOP(); 

				}
				break;
			case 31 :
				// ProjLang.g:1:177: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\6\25\2\uffff\1\46\2\25\17\uffff\1\51\1\52\10\25\2\uffff\1\25"+
		"\1\64\2\uffff\3\25\1\70\1\71\1\72\1\73\2\25\1\uffff\1\76\1\77\1\100\4"+
		"\uffff\2\25\3\uffff\1\103\1\104\2\uffff";
	static final String DFA4_eofS =
		"\105\uffff";
	static final String DFA4_minS =
		"\1\11\1\146\1\150\1\154\1\145\2\141\2\uffff\1\75\1\150\1\157\17\uffff"+
		"\2\60\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\2\uffff\1\151\1"+
		"\60\2\uffff\1\156\2\145\4\60\1\163\1\154\1\uffff\3\60\4\uffff\2\145\3"+
		"\uffff\2\60\2\uffff";
	static final String DFA4_maxS =
		"\1\175\1\156\1\162\1\156\1\145\1\141\1\165\2\uffff\1\75\1\150\1\157\17"+
		"\uffff\2\172\1\145\1\165\1\163\1\144\1\164\1\154\1\156\1\154\2\uffff\1"+
		"\151\1\172\2\uffff\1\156\2\145\4\172\1\163\1\154\1\uffff\3\172\4\uffff"+
		"\2\145\3\uffff\2\172\2\uffff";
	static final String DFA4_acceptS =
		"\7\uffff\1\11\1\12\3\uffff\1\16\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\31"+
		"\1\32\1\33\1\34\1\35\1\36\1\37\12\uffff\1\17\1\13\2\uffff\1\1\1\5\11\uffff"+
		"\1\15\3\uffff\1\7\1\4\1\6\1\10\2\uffff\1\2\1\27\1\3\2\uffff\1\30\1\14";
	static final String DFA4_specialS =
		"\105\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\15\4\uffff\1\22\1\uffff\1\26\1\27"+
			"\1\20\1\16\1\uffff\1\17\1\uffff\1\21\12\24\1\11\1\14\1\31\1\30\3\uffff"+
			"\32\25\6\uffff\3\25\1\13\1\3\1\6\2\25\1\1\2\25\1\4\7\25\1\2\1\25\1\5"+
			"\1\12\3\25\1\7\1\23\1\10",
			"\1\33\7\uffff\1\34",
			"\1\35\11\uffff\1\36",
			"\1\37\1\uffff\1\40",
			"\1\41",
			"\1\42",
			"\1\44\23\uffff\1\43",
			"",
			"",
			"\1\45",
			"\1\47",
			"\1\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"",
			"\1\63",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\74",
			"\1\75",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"",
			"",
			"\1\101",
			"\1\102",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( IF | THEN | ELSE | LET | IN | VAL | END | FUNCTION | LEFTCUB | RIGHTCUB | COLON | WHILE | DO | SEMICOLON | ASSIGN | NOT | BINA | BINS | BINM | BIND | BINAND | BINOR | TRUE | FALSE | NUMBER | ID | LPAR | RPAR | EQUALS | RELOP | WS );";
		}
	}

}
