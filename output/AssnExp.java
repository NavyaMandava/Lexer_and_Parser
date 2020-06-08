public class AssnExp extends Expr{
	public final String str;
	public final Expr ex;
	public AssnExp(String _str, Expr _ex) {
		str = _str;
		ex = _ex;
	}	
	public Value eval(Env e) throws EvalError {
		Value val=ex.eval(e);
		Value val1=e.lookup(str);
		if(val1.getClass()==val.getClass()){
			e=e.updateBinding(str,ex.eval(e));
		}
		else throw new EvalError("Invalid argument");
		return val;
	}
	
	public String toString() {
		
		return str+":="+ex.toString();
	}
	

}