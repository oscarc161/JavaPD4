class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    spaces(5);
    harmonic(5);
    fib(5);
  }

  void spaces(int n){
    String result = "";
    for(int i = 0; i < n; i++){
      result += " ";
    }
    print(result+ "DONE");
  }

  void harmonic(int n){
    double total = 1.0;
    for(double i = 1; i < n; i++){
      total += 1.0 / i;
    }
    System.out.println(total);
  }

  void findSin(int angle, int n){
    int neg = 1;
    double sin = angle;
    for(int i = 3; i <= n; i += 2){
      neg *= -1;
      sin += neg * Math.pow(angle, i) / 1;

    }
  }

  void fib(int n){
    int a = 1;

  }


  
}