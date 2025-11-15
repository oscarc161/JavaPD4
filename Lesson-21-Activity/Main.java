class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    allowance();
    addTwoNumbers();
    gcf(24,36);
    rpd();
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  void allowance(){
    double total = 0.01;
    int count = 0;
    while(total < 5){
      total *= 2;
      count++;
    }
    System.out.println(count + " Days");
  }

  void addTwoNumbers(){
    int num1 = randInt(1,6);
    int num2 = randInt(1,6);
    System.out.println("what is " + num1 + " + " + num2 + " ?");
    int answer = num1 + num2;
    int userInput = Input.readInt();
    while(!(userInput == answer)){
      System.out.println("Incorrect, try again");
      userInput = Input.readInt();
    }
    System.out.println("Correct!");
  }

  void gcf(int a, int b){
    System.out.println("My bum ahh cant solve this :(");
  }

  void rpd(){
    System.out.println("|1 for rock, 2 for paper, 3 for scissors)");
    int computerChoice = 2;
    int userChoice = Input.readInt();
    while(!(userChoice == 3)){
      if(userChoice == computerChoice){
        System.out.println("It's a tie! Try again!");
      } else if(userChoice > computerChoice){
        System.out.println("You win!!!");
      } else {
        System.out.println("You lose! Try again!");
    }
      userChoice = Input.readInt();
   
    }
  }


}