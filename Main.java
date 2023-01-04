class Main {
  public static void main(String[] args){
    CalculatorWithMemory calc = new CalculatorWithMemory();
      
    calc.accumulator = 10;
    calc.save();
    calc.accumulator = 20; 
    calc.recall();
    
    System.out.println(calc.accumulator);//output: 10
    System.out.println(calc.getMemory());//output: 10

    System.out.println(calc.getMemory());//output: 0
    
     calc.clearMemory();
    System.out.println(calc.getMemory());
  }
    
    
  
}