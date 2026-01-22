class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here

    // #1
    int fail = 0;
    int pass = 0;
    for(int i = 0; i < students.length; i++){
      if(students[i].gpa < 65.0){
        fail++;
      } else {
        pass++;
      }
    }
    print(fail);
    print(pass);

    // #2
    double percent = (fail * 100.0) / (fail + pass);
    System.out.println(Math.round(percent)+"%");
      
    // #3
    int Students_That_Castro_Failed_Lol = 0;
    for(int i = 0; i < students.length; i++){
      if(students[i].findTeacher("CASTRO R") && students[i].gpa < 65.0){
        Students_That_Castro_Failed_Lol++;
      }
    }
    print(Students_That_Castro_Failed_Lol);

    // #4
    int Failing_Non_Music_Students = 0;
    for(int i = 0; i < students.length; i++){
      if(!students[i].findCourseStartingWith("UL") && students[i].gpa < 65.0){
        Failing_Non_Music_Students++;
      }
    }

    print(Failing_Non_Music_Students);

    // #5
    for(int i = 0; i < students.length; i++){
      if(students[i].findCourseStartingWith("UL") && students[i].gpa < 65.0){
        System.out.println(students[i].id);
      }
    }

    // #6
    int total_smart_freshmen_and_sophmores = 0;
    for(int i = 0; i < students.length; i++){
      if((students[i].gradeLevel == 9 || students[i].gradeLevel == 10) && students[i].gpa > 90.0){
        total_smart_freshmen_and_sophmores++;
      }
    }
    System.out.println(total_smart_freshmen_and_sophmores);

    // #7 

    int has_BANU_and_PORCHETTA = 0;
    for(int i = 0; i < students.length; i++){
      if(students[i].findTeacher("BANU") && students[i].findTeacher("PORCHETTA")){
        has_BANU_and_PORCHETTA++;
      }
    }
    System.out.println(has_BANU_and_PORCHETTA);

    // #8 
    int freshmen = 0;
    int sophomore = 0;
    int junior = 0;
    int senior = 0;
    int SUPERSENIOR = 0;
    for(int i = 0; i < students.length; i++){
      if(students[i].gradeLevel == 9){
        freshmen++;
      } else if(students[i].gradeLevel == 10){
        sophomore++;
      } else if(students[i].gradeLevel == 11){
        junior++;
      }else if(students[i].gradeLevel == 12){
        senior++;
      }else{
        SUPERSENIOR++;
      }
    }
    System.out.println(freshmen);
    System.out.println(sophomore);
    System.out.println(junior);
    System.out.println(senior);
    System.out.println(SUPERSENIOR);

    // #9

    int porchetta_freshmen = 0;
    int porchetta_sophomore = 0;
    int porchetta_junior = 0;
    int porchetta_senior = 0;
    int porchetta_SUPERSENIOR = 0;
    for(int i = 0; i < students.length; i++){
      if(students[i].gradeLevel == 9 && students[i].findTeacher("PORCHETTA")){
        porchetta_freshmen++;
      } else if(students[i].gradeLevel == 10 && students[i].findTeacher("PORCHETTA")){
        porchetta_sophomore++;
      } else if(students[i].gradeLevel == 11 && students[i].findTeacher("PORCHETTA")){
        porchetta_junior++;
      }else if(students[i].gradeLevel == 12 && students[i].findTeacher("PORCHETTA")){
        porchetta_senior++;
      }else{
        SUPERSENIOR++;
      }
    }
    System.out.println(porchetta_freshmen);
    System.out.println(porchetta_sophomore);
    System.out.println(porchetta_junior);
    System.out.println(porchetta_senior);
    System.out.println(porchetta_SUPERSENIOR);





    
    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}