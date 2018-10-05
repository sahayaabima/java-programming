class leapyearornot {
  public static void main(String[] args) {
  int year = 2016;
  System.out.println();        
    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        System.out.println("Yes");
    else
      System.out.println("no");
      System.out.println();
  }
}