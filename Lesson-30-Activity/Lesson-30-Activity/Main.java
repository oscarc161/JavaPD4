class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    car RollsRoyce = new car("Rolls Royce", "Black", "Phantom", 2021, 450000);
    car Tesla = new car("Tesla", "Red", "Model S", 2022, 120000);

    System.out.println("This" + " " + RollsRoyce.brand + " " + "is a" + " " + RollsRoyce.model + " Model, costing" + " " + RollsRoyce.price + " " + "dollars.");
    System.out.println("This" + " " + Tesla.brand + " " + "is a" + " " + Tesla.model + " Model, costing" + " " + Tesla.price + " " + "dollars.");
    if(RollsRoyce.price > 10000){
      RollsRoyce.honk();
    }
    if(Tesla.price > 10000){
      Tesla.honk();
    }

  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}