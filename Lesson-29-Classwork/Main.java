class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    Dog Layla = new Dog();
    Layla.name = "Layla";
    Layla.age = 3;
    Layla.breed = "Schnauzer";
    Dog Snoopy = new Dog();
    Snoopy.age = 5;
    Snoopy.breed = "Beagle";
    Snoopy.name = "Snoopy";
    Dog poophy = new Dog();
    poophy.name = "poophy";
    poophy.age = 2;
    poophy.breed = "Golden retriever";

    Layla.bark();
    Snoopy.bark();
    poophy.bark();


    
   
    
  }

  class Dog{
    String name;
    int age;
    String breed;

    void bark(){
      System.out.println("Woof!");
    
    }
  }








  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}