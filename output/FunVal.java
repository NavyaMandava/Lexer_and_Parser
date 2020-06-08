public class FunVal extends Value{
	public final Env e1;
	public final String str;
	public final Expr ex;
	public FunVal(String _str, Expr _ex, Env _e1) {
		str = _str;
		ex = _ex;
		e1 = _e1;
	}
	public String toString() {
		return str;
	}
}