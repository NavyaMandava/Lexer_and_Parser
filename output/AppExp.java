public class AppExp extends Expr {
	String str;
	Expr expr;
	public AppExp(String _str, Expr _expr) {
		str = _str;
		expr = _expr;
	}
	public Value eval(Env e) throws EvalError {
		return null;
	}
	public String toString() {
		return str+"("+expr.toString()+")";
	}
}