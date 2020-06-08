public class LetValExp extends Expr{
	public final String str;
	public final Expr e1,e2;
	public LetValExp(String _str, Expr _e1, Expr _e2) {
		str = _str;
		e1 = _e1;
		e2 = _e2;
	}
	public Value eval(Env e) throws EvalError {		
		return e2.eval(e.addBinding(str,e1.eval(e)));
	}
	public String toString() {
		return "let val"+str+":="+e1.toString()+"in"+e2.toString()+"end";
	}

}
