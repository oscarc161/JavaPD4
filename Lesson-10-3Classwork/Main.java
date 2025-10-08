class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    groupSavings(10);
    groceryDiscount(4,150);

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
  void groupSavings(double ticket){
    double cost = 0;
    if(ticket >= 1 && ticket <= 8){
      cost = ticket*11;
    }else if(ticket >= 9 && ticket <= 16){
      cost = ticket*10.5;
    }else if(ticket>16){
      cost = ticket*8.5;
    }
    System.out.println(cost);
  }

  
  /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */

    void groceryDiscount(int cans, int money_spent){
      if(cans >= 3 && money_spent >= 100){
        System.out.println("10$ savings");
      }else if(cans >= 5 && money_spent >= 200){
        System.out.println("25$ savings");
      }else{
        System.out.println("0$ savings");
      }
    }
}
