class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Goose", "Maverick", "Iceman", "Viper", "Jester"};
    double tempc[] = {0.0, 12.5, 23.3, 34.6, 45.2, 56.8, 67.3, 78.9, 89.4, 100.0};
    convert(tempc);

  
   
    
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }

  void convert(double[] tempc){
    int[] tempf = new int[tempc.length];
    for(int i=0; i<tempc.length; i++){
      tempf[i] = (int)celsiusToFarhenheit(tempc[i]);
    }
    for(int i=0; i<tempf.length; i++){
      System.out.println(tempf[i]+" "+tempc[i]);
    }

  }
}