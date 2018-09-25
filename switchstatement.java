class Main {
  public static void main(String[] args) {
  int DayOfTheWeek = 1;
      String day;
	       switch (DayOfTheWeek) {
         case 0:
           day = ":Free Personal Pizza on purchase of medium Pizza";
           break;
         case 1:
           day = "Rs.101 OFF on a bill of Rs.400 and above";
	         break;
         case 2:
           day = "Free Plain Garlic Bread on another medium pizza";
           break;
         case 3:
           day = "Buy 1 Get 1 Free on any medium pizza";
           break;
         case 4:
           day = "Buy any medium pizza and get 50% off on another medium pizza";
           break;
         case 5:
           day = "Tastiest pizza 20% off on bill of Rs.399 or above";
           break;
         case 6:
           day = "Get Together Offer Free Garlic Bread and Dip on a min bill of Rs.350";
           break;
         default: 
           day = "Invalid day";
           break;
      }
      System.out.println(day);
  }
}