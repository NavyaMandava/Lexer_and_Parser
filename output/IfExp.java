public class IfExp extends Expr 
{
	public  Expr c1,c2,c3;
    	public  IfExp(Expr _c1, Expr _c2,Expr _c3) 
    	{
		c1 = _c1;
		c2 = _c2;
		c3 = _c3;
    	}
   	public Value eval(Env e) throws EvalError 
    	{
		Value val=c1.eval(e);
		Value result=null;
		if(val instanceof BoolVal)
		{
			if(((BoolVal)val).value){
				result=c2.eval(e);
				return result;
			}
			else{
				result=c3.eval(e);
				return result;
			}
		}
		else{
			result=new BoolVal(false);
			return result;
		}	
    	}
    	public String toString()
    	{
		return "if"+c1.toString()+"then "+c2.toString()+"else" +c3.toString();
    	}
}