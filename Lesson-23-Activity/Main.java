class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

  double[] prices = {19.99, 5.49, 3.50, 15.99, 29.99};
  System.out.println(priceSum(prices));

  int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};
  System.out.println(isin(arr, 7));

  int[] ticket = {4, 8, 15, 16, 23, 42};
  int[] winning = {4, 8, 15, 16, 23, 99};
  System.out.println(checkLotto(ticket, winning));

  int[] nums = {34, 67, 23, 89, 2, 100, 45};
  System.out.println(biggest(nums));

  


  }



  // Use these functions below for the activity

  String convertToEmoji(String code){
    return String.valueOf(Character.toChars(
                               Integer.parseInt(code, 16)));
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  boolean isPrime(int n){
    int divisor = 2;
    while(n%divisor !=0){
      divisor+=1;
    }
    if(divisor==n)
      return true;
    else
      return false;
  }

  double priceSum(double[] prices){
    double sum = 0.0;
    for(int i=0; i<prices.length; i++){
      sum += prices[i];
    }
    sum *= 1.08525;
    return sum;
    }

    boolean isin(int[] arr, int target){
      for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
          return true;
        }
      }
      return false;
    }

    int checkLotto(int[] ticket, int[] winning){
      int matches = 0;
      String msg = "";
      for (int i=0; i<ticket.length; i++){
        if (ticket[i]==winning[i]){
          matches += 1;
        }
      }
      if (matches == 6){
        msg = "Good for u";
      }else{
        msg = "womp womp little guy, u got";
      }
      System.out.println(msg);
      return matches;
      }

      int biggest(int[] arr){
        int biggest = 0;
        for (int i=0; i<arr.length; i++){
          if (arr[i]>biggest){
            biggest = arr[i];
          }
        }
        return biggest;
      }
    }
