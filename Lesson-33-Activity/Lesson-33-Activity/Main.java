class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem item1 = new CartItem("Laptop", 999.99, 1, true);
    CartItem item2 = new CartItem("Mouse", 25.50, 2, false);
    CartItem item3 = new CartItem("Keyboard", 45.00, 1, true);

    double a = item1.getItemPrice();
    System.out.println(a);
    double b = item2.getItemPrice();
    System.out.println(b);
    double c = item3.getItemPrice();
    System.out.println(c);

    double subtotal = (a+b+c)*(108.675/100);
    System.out.println(subtotal);

  
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}