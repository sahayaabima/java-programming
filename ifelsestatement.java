class Main {
  public static void main(String[] args) {
  int purchaseamount = 5000;
        
       if( purchaseamount > 20000 )      
       {
           System.out.println("Free Trolley Suitcase"); 
       }
       else if( purchaseamount > 10000 ) 
       {
            System.out.println("Free Travel Bag");
       }
       else if( purchaseamount > 5000 ) 
       {
           System.out.println("Free BackPck"); 
       }
       else
       {
           System.out.println("Collect money even for cover we give");  
       }
  }
}