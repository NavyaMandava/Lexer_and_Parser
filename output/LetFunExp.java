public class LetFunExp extends Expr{
    public final String str1,str2;
    public final Expr expr1,expr2;
    
    public LetFunExp(String _str1, String _str2, Expr _expr1, Expr _expr2) {
        str1 = _str1;
        str2 = _str2;
        expr1 = _expr1;
        expr2 = _expr2;
    }

 

    public Value eval(Env e) throws EvalError {    
        return null;
    }

 

    public String toString() {
        
        return "let fun"+str1+"("+str2+")"+expr1.toString()+"in"+expr2.toString()+"end";
        
    }

 

}