class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    collegeCredit("IDK MAN");
    getCounselor("TUTUTUTUTUTUTUTUTU ARRRRRGH");
    imageType("PNG");
   

    
  }

  void collegeCredit(String coursecode){
    String six_eighth_letter = coursecode.substring(5,6);
    String correct1 = "E";
    String correct2 = "M";
    if(six_eighth_letter.equals(correct1) || six_eighth_letter.equals(correct2)){
      System.out.println(true);
    }else{
      System.out.println(false);
    }
    }
    
  void getCounselor(String official_class){
    String first_letter = official_class.substring(0,1);
    String half_letter = official_class.substring((official_class.length()/2),(official_class.length()/2)+1);

    String counselor = "Unassigned";

    if(first_letter.equals("B") || half_letter.equals("B")){
       counselor = "Berrouet";
    }else if(first_letter.equals("C") || half_letter.equals("C")){
        counselor = "Chu";
    }else if(first_letter.equals("D") || half_letter.equals("D")){
        counselor = "Dinn";
    }else if(first_letter.equals("E") || half_letter.equals("E")){
        counselor = "Eyzengart";
    }else if(first_letter.equals("F") || half_letter.equals("F")){
        counselor = "Flores";
    }else if(first_letter.equals("G") || half_letter.equals("G")){
        counselor = "Gibson";
    }else if(first_letter.equals("L") || half_letter.equals("L")){
        counselor = "Shim Lee";
    }else if(first_letter.equals("M") || half_letter.equals("M")){
        counselor = "Meltzer";
    }else if(first_letter.equals("P") || half_letter.equals("P")){
        counselor = "Paccione";
    }else if(first_letter.equals("S") || half_letter.equals("S")){
        counselor = "Fiore";
    }else if(first_letter.equals("T") || half_letter.equals("T")){
        counselor = "Tsai";
    }else if(first_letter.equals("Z") || half_letter.equals("Z")){
        counselor = "Zayes";
    }

    System.out.println(counselor);



  }

  void imageType(String file_name){
    if(file_name.equals("JPEG") || file_name.equals("JPG")){
      System.out.println("Joint Photographic Experts Group");
    }else if(file_name.equals("PNG")){
      System.out.println("Portable Network Graphics");
    }else if(file_name.equals("GIF")){
      System.out.println("Graphics Interchange Format");
    }else if(file_name.equals("PDF")){
      System.out.println("Portable Document Format");
    }else{
      System.out.println("idk man");
    }
  }
    


}

 
