class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    roll();
    lotto();
    additionTutor();



    
  }

  void roll(){
    int die1 = (int)Math.random()*6+1;
    int die2 = (int)Math.random()*6+1;
    System.out.println(die1 + " " + die2);
  }

  void lotto(){
    String build = "";
    for(int i=0;i<6;i++){
      int num = (int)(Math.random()*49)+1;
      build += num + " ";
    }
    System.out.println(build);

  }

  void additionTutor(){
    int num1 = (int)(Math.random()*100)+1;
    int num2 = (int)(Math.random()*100)+1;
    int answer = num1 + num2;
    System.out.println("What is " + num1 + " + " + num2 + "?");
    int user_input = Input.readInt();
    if(answer == user_input){
      System.out.println("Correct!");
    }else{
      System.out.println("Wrongo, dumbo");
  }




}
}