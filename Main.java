class Main {
  public static void main(String[] args){
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    
  } 
  
  public static boolean isPalindrome(String str){
    
    StringBuilder sb = new StringBuilder(str);
    str=str.toLowerCase().replaceAll("[^a-z]", "");
    sb=new StringBuilder(str).reverse();
    if(sb.toString().equalsIgnoreCase(str))
      return true;
    else
      return false;
    
  
  }
    
    
  
}