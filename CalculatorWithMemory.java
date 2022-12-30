public class CalculatorWithMemory extends Calculator {
  
  private double accumuator = 6;
  
  public double add(double x, double y) {
    accumuator += x + y;
    return accumuator;
  }
  
  public double subtract(double x, double y) {
    accumuator -= x - y;
    return accumuator;
  }
  
  public double multiply(double x, double y) {
    accumuator *= x * y;
    return accumuator;
  }
  
  
  
  
    
    
  }

  

 
  
  
