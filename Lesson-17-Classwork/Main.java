class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    swap("hello there");
    encryption2("abcdefghij");
    encryption3("abcdefgh");


    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  void swap(String s){
    String build = "";
    for(int x=0; x<s.length(); x+=1){
      if(s.substring(x,x+1).equals("e")){
        build += "%";
      }else{
        build += s.substring(x,x+1);
      }
      }
      System.out.println(build);
    }

  void encryption2(String s){
    String build = "";
    int length = s.length();
    int half = length/2;

    String first = s.substring(0, half);
    String second = s.substring(half, length);

    for(int x=0; x<half; x+=1){
      build += first.substring(x,x+1);
      build += second.substring(x,x+1);
    }
    System.out.println(build);
  }

  void encryption3(String s){
    String build = "";
    String normal = s.substring(0, s.length()/2);
    String reverse = "";
    int half = normal.length()/2;

    int length = normal.length();
    for(int x=length-2; x>=half; x-=1){
      reverse += normal.substring(x,x+1);
    }

    for(int x=0; x<length; x+=1){
      build += normal.substring(x,x+1);
      build += reverse.substring(x,x+1);
    }
    System.out.println(build);
  }

  }


