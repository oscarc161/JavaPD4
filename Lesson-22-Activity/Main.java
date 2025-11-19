class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //Using this array to test your summArray and avgArray function
    int nums[] = {10,15,22,54,32,34,65,87,45,100,23,99,95,87,56,83};
    System.out.println(sumArray(nums));
    System.out.println(avgArray(nums));

    // Use these two arrays to test your quizGrader function
    char[] studentAns = {'A','A','B','C','D','C'};
    char[] ansKey = {'A','B','B','C','D','C'};

    System.out.println(quizGrader(studentAns, ansKey));

  }

  //Problem 1:
  // Write a function called sumArray that accepts an array of integers and
  // returns the sum of all the values in the array.

  int sumArray(int[] a){
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i];
    }
    return sum;
  }



  

  //Problem 2
  // Write a function called avgArray that accepts an array of integers and
  // returns the average of the values in the array

  double avgArray(int[] a){
    double sum = sumArray(a);
    double average = sum / a.length;
    return average;
  }





  

  //Problem 3
  // Write a function called quizGrader that accepts two arrays of characters.  One array 
  // represents the students answers and the other array represents the answer key.
  //
  // Return the quiz grade by counting the number of correct answers divided by
  // the number of questions.

  double quizGrader(char[] studentAns, char[] ansKey){
    double correct = 0;
    for (int i = 0; i < studentAns.length; i++) {
      if (studentAns[i] == ansKey[i]) {
        correct++;
      }
    }
    double grade = (correct / studentAns.length) ;
    return grade;


  }

  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}