public class VarExp extends Expr {
    public  String str;
    public VarExp(String _str) {
	str = _str;
    }
    public Value eval(Env e) throws EvalError {
	Value val= e.lookup(str);
	return val;
    }
    public String toString(){
	return str;
    }
}