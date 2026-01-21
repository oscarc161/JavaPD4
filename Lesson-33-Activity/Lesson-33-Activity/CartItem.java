class CartItem{
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;

  //Create the constructor

  CartItem(String itemName, double itemPrice, int quantity, boolean onSale){
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
    this.onSale = onSale;
  }


  double getItemPrice(){
    if(onSale == true){
      return itemPrice * 0.9;
    } else {
      return itemPrice;
    }
  }

  // challenges.txt



}