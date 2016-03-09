package equationsolver;

public class EquationSolver{
  
  private int input;
  
  private interface Result{
      public double getAnswer();  
  }
  
  public EquationSolver(int in){
     this.input = in;
  }
  
  public Result getResult(final int input1, final int input2){
      
	  final int[] localVar = {2,6,10,14};
      
	  class MyResult implements Result{
	  
		 private int normField;
		 
		 public MyResult(){
		    normField = 2;
		 }
		 
		 public double getAnswer(){
			 return (double) (input1 / input2 - input + localVar[2] - normField);
		 }
	  }
	  
	  return new MyResult();  
  }
  
  public static void main(String[] args){
	  
	  EquationSolver es = new EquationSolver(10);
	  Result r = es.getResult(33, 5);
	  System.out.println(r.getAnswer());
	  
  }
  
}