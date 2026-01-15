class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    Animal faun = new Animal("faun", 50.0, 20.0);
    Animal ZEUS = new Animal("god", 120.0, 30.0);
    System.out.println("Is faun healthy? " + faun.ishealthy());
    System.out.println("Is ZEUS healthy? " + ZEUS.ishealthy());

    
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}