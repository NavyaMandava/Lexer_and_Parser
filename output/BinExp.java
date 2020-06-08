public class BinExp extends Expr{
	public Expr e1;
	public Expr e2;
    public BinOp binop;
	public  BinExp (Expr _e1,BinOp _binop,Expr _e2){
        binop = _binop;
		e1 = _e1;
		e2 = _e2;
   	}
    public Value eval(Env e) throws EvalError{
			
				switch(binop){
					case PLUS: 
								return new IntVal(((IntVal)e1.eval(e)).value+((IntVal)e2.eval(e)).value);
					case MINUS: 
								return new IntVal(((IntVal)e1.eval(e)).value-((IntVal)e2.eval(e)).value);
					case TIMES: 
								return new IntVal(((IntVal)e1.eval(e)).value*((IntVal)e2.eval(e)).value);
					case DIV: 
							if(((IntVal)e2.eval(e)).value==0) { 
							throw new EvalError("Division by 0 Error"); 
							}
							else { 
							return new IntVal(((IntVal)e1.eval(e)).value/((IntVal)e2.eval(e)).value); 
							}
				
					case LT: if(((IntVal)e1.eval(e)).value<((IntVal)e2.eval(e)).value) {
								return new BoolVal(true); 
								} 
								else {
									return new BoolVal(false);
									}
					case AND: if(((BoolVal)e1.eval(e)).value&&((BoolVal)e2.eval(e)).value) 
									return new BoolVal(true); 
							  else return new BoolVal(false); 
					case OR: if(((BoolVal)e1.eval(e)).value) 
									return new BoolVal(true);
							 else 
								 return new BoolVal(((BoolVal)e2.eval(e)).value);
					case EQ: if(((BoolVal)e1.eval(e)).value==((BoolVal)e2.eval(e)).value) 
									return new BoolVal(true); 
							 else return new BoolVal(false);
					}
			
			return null;
		}
		
	
    public String toString(){
		return e1.toString()+ binop.toString() + e2.toString();
    }
}




